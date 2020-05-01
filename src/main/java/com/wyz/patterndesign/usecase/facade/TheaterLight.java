package com.wyz.patterndesign.usecase.facade;

/**
 * @Author: WangYouzheng
 * @Date: 2020/5/1 13:50
 * @Description: 灯光
 */
public class TheaterLight {
	private static TheaterLight instance = new TheaterLight();

	public static TheaterLight getInstance() {
		return instance;
	}

	public void on() {
		System.out.println("TheaterLight on");
	}

	public void off() {
		System.out.println("TheaterLight off");
	}
	
	public void dim() {
		System.out.println("TheaterLight dim");
	}

	public void bright() {
		System.out.println("TheaterLight bright");
	}
}
