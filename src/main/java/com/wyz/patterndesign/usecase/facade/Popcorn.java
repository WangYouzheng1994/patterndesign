package com.wyz.patterndesign.usecase.facade;

import java.io.File;

/**
 * @Author: WangYouzheng
 * @Date: 2020/5/1 13:47
 * @Description: 爆米花子系统
 */
public class Popcorn {
	private static Popcorn instance = new Popcorn();

	public static Popcorn getInstance() {
		return instance;
	}

	public void on() {
		System.out.println("popcorn on");
	}

	public void off() {
		System.out.println("popcorn off");
		File f = new File("");
	}

	public void pop() {
		System.out.println("popcorn pop");
	}

	public void play() {
		System.out.println("popcorn is playing");
	}

	public void pause() {
		System.out.println("popcorn is pause");
	}
}
