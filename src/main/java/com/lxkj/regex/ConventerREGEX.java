package com.lxkj.regex;

import org.apache.commons.lang3.StringUtils;

/**
 * @Author: WangYouzheng
 * @Date: 2020/3/30 16:36
 * @Description:
 */
public class ConventerREGEX {
	private String sourceSTR = StringUtils.EMPTY;

	private ConventerREGEX() {

	}

	private ConventerREGEX(String sourceSTR) {
		this.sourceSTR = sourceSTR;
	}

	public ConventerREGEX of(String sourceSTR) {
		return new ConventerREGEX(sourceSTR);
	}

	// 整体思路，拿到前台给过来的配置串，然后依次根据 括号解析

}

