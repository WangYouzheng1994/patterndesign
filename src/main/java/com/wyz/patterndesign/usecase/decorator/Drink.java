package com.wyz.patterndesign.usecase.decorator;

/**
 * @Author: WangYouzheng
 * @Date: 2020/4/21 21:28
 * @Description:
 */
public abstract class Drink {
	/**
	 * 描述
	 */
	public String des;
	private float price = 0.0f;
	public String getDes() {
		return des;
	}
}
