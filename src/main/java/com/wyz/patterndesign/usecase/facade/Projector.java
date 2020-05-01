package com.wyz.patterndesign.usecase.facade;

/**
 * @Author: WangYouzheng
 * @Date: 2020/5/1 13:48
 * @Description: 投影仪子系统
 */
public class Projector {
	private static Projector instance = new Projector();

	public static Projector getInstance() {
		return instance;
	}

	public void on() {
		System.out.println("Projector on");
	}

	public void off() {
		System.out.println("Projector off");
	}
	public void focus() {
		System.out.println("Projector focus");
	}
}
