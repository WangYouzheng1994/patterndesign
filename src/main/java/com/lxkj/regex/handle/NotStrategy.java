package com.lxkj.regex.handle;

import com.alibaba.fastjson.JSONObject;
import com.lxkj.regex.KeyConstants;
import org.apache.commons.lang3.ArrayUtils;
import org.apache.commons.lang3.StringUtils;

import java.util.regex.Pattern;

/**
 * @Author: WangYouzheng
 * @Date: 2020/3/30 18:51
 * @Description: Not
 */
public class NotStrategy implements ConventerStrategy {
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
		Boolean checkResult = false;
		// Not 在前面，然后 分割以后只能有一个。 可以出现两个，那么左边那个只能是左括号
		String replaceStr = StringUtils.replaceEach(sourceStr, ArrayUtils.toArray(KeyConstants.STR_BRACKET_L, KeyConstants.STR_BRACKET_R), ArrayUtils.toArray("", ""));
		replaceStr = StringUtils.trim(replaceStr);
		if (StringUtils.isNotBlank(replaceStr)) {
			if (StringUtils.split(replaceStr, KeyConstants.STR_NOT).length == 1) {

			}
		}

		return checkResult;
	}

	public static void main(String[] args) {
		StringUtils.split("Not ABC", "Not");
	}
}
