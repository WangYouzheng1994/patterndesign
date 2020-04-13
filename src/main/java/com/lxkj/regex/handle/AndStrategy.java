package com.lxkj.regex.handle;

import com.alibaba.fastjson.JSONObject;
import com.lxkj.regex.KeyConstants;
import org.apache.commons.lang3.StringUtils;

import java.util.regex.Pattern;

/**
 * @Author: WangYouzheng
 * @Date: 2020/3/30 17:40
 * @Description: And符号的转换
 */
public class AndStrategy implements ConventerStrategy {

	@Override
	public Pattern getPattern() {
		return null;
	}

	/**
	 * 处理逻辑
	 * @param sourceStr
	 */
	@Override
	public void handle(JSONObject sourceStr) {

	}

	/**
	 * 校验关键字，并且分割。
	 *
	 * @param sourceStr
	 * @return
	 * @throws IllegalArgumentException
	 */
	@Override
	public Boolean hasKeyWords(String sourceStr) throws IllegalArgumentException {
		if (StringUtils.containsAny(sourceStr, KeyConstants.STR_AND)) {
			String[] andArr = StringUtils.split(KeyConstants.STR_AND);
			// AND左右进行分割需要数组是2~
			if (andArr.length > 2) {
				return true;
			} else {
				throw new IllegalArgumentException(KeyConstants.STR_AND + "操作符，需要左右两侧都有数据！");
			}
		}
		return false;
	}
}
