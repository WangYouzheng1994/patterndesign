package com.wyz.patterndesign.usecase.bridge;

/**
 * @Author: WangYouzheng
 * @Date: 2020/4/20 21:13
 * @Description:
 */
public class Vivo implements Brand {
	@Override
	public void open() {
		System.out.println("Vivo开机");
	}

	@Override
	public void close() {
		System.out.println("Vivo关机");
	}

	@Override
	public void call() {
		System.out.println("Vivo打电话");
	}
}