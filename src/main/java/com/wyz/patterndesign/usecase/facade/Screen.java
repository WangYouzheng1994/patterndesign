package com.wyz.patterndesign.usecase.facade;

/**
 * @Author: WangYouzheng
 * @Date: 2020/5/1 13:50
 * @Description: 屏幕
 */
public class Screen {
	private static Screen instance = new Screen();

	public static Screen getInstance() {
		return instance;
	}

	public void up() {
		System.out.println("Screen up");
	}

	public void down() {
		System.out.println("Screen down");
	}
}
