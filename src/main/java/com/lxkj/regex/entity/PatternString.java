package com.lxkj.regex.entity;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.JSONValidator;
import com.fasterxml.jackson.annotation.JsonAlias;
import com.lxkj.regex.KeyConstants;
import org.apache.commons.lang3.StringUtils;
import org.springframework.util.CollectionUtils;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @Author: WangYouzheng
 * @Date: 2020/4/1 9:29
 * @Description:
 */
public class PatternString {
	// 把str转换的实体类

	private String operate;
	// private String


	public static PatternString jsonToPatternString(String jsonStr) {
		PatternString result = new PatternString();

		return result;
	}

	public static boolean checkJson(String jsonStr) {
		return JSONValidator.from(jsonStr).validate();
	}

	public static String getPatternString(String jsonStr) {
		String patternRst = StringUtils.EMPTY;
		if (checkJson(jsonStr)) {
			JSONObject jsonObject = JSON.parseObject(jsonStr);
			if (!CollectionUtils.isEmpty(jsonObject)) {
				String operate = String.valueOf(jsonObject.get(KeyConstants.DATA_FILED_OPERATE));

			}
		}

		return patternRst;
	}

	public static String getData(JSONObject jsonObject) {
		return null;
	}

	public static void main(String[] args) {
		String json = "{\"operate\":\"AND\",\"content\":[\"A\",{\"operate\":\"OR\",\"content\":[\"B\",\"C\"]}]}";
		JSONObject jsonObject = JSON.parseObject(json);
		System.out.println(JSONValidator.from(json).validate());
		System.out.println(jsonObject);
	}

	/**
	 * 解析转换后的实体类，分别传进去
	 */




}
