package com.lxkj.regex.handle;

import com.alibaba.fastjson.JSONObject;

import java.util.regex.Pattern;

/**
 * @Author: WangYouzheng
 * @Date: 2020/3/30 16:53
 * @Description: 括号，AND OR NEAR AFTER NOT
 */
public interface ConventerStrategy {
	Pattern bracketPattern = Pattern.compile("");
	Pattern getPattern();

	/**
	 * 处理逻辑
	 * @param sourceStr
	 */
	void handle(JSONObject sourceStr);

	/**
	 * 校验关键字，并且分割。
	 *
	 * @param sourceStr
	 * @return
	 * @throws IllegalArgumentException
	 */
	Boolean hasKeyWords(String sourceStr) throws IllegalArgumentException;
}
