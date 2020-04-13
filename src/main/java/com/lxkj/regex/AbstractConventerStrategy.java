package com.lxkj.regex;

import com.lxkj.regex.handle.ConventerStrategy;

import java.util.regex.Pattern;

/**
 * @Author: WangYouzheng
 * @Date: 2020/3/30 16:58
 * @Description: 定义转换的骨架
 */
public abstract class AbstractConventerStrategy implements ConventerStrategy {

	/**
	 * 骨架方法
	 */
	Pattern getPattern(String str) {
//		String Buffer
		// 分割 括号

		// 分割 AND

		// 分割 NOT

		// 分割 NEAR

		// 分割 AFTER


		return null;
	}
	public abstract void strToPattern(String str);
}
