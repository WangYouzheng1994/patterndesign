package com.wyz.patterndesign.usecase.facade;

/**
 * @Author: WangYouzheng
 * @Date: 2020/5/1 13:45
 * @Description: DVD播放器
 */
public class DVDPlayer {
	private static DVDPlayer instance = new DVDPlayer();

	public static DVDPlayer getInstance() {
		return instance;
	}

	public void on() {
		System.out.println("dvd on");
	}

	public void off() {
		System.out.println("dvd off");
	}

	public void play() {
		System.out.println("dvd is playing");
	}

	public void pause() {
		System.out.println("dvd is pause");
	}
}
