package com.lxkj.regex.handle;

import com.alibaba.fastjson.JSONObject;
import com.lxkj.regex.KeyConstants;
import org.apache.commons.lang3.StringUtils;

import java.util.regex.Pattern;

/**
 * @Author: WangYouzheng
 * @Date: 2020/3/30 17:44
 * @Description: OR转换
 */
public class ORStrategy implements ConventerStrategy {
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
		if (StringUtils.containsAny(sourceStr, KeyConstants.STR_OR)) {
			String[] andArr = StringUtils.split(KeyConstants.STR_OR);
			// AND左右进行分割需要数组是2~
			if (andArr.length > 2) {
				return true;
			} else {
				throw new IllegalArgumentException(KeyConstants.STR_OR + "操作符，需要左右两侧都有数据！");
			}
		}
		return false;
	}
}
