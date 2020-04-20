package com.wyz.patterndesign.usecase.bridge;

/**
 * @Author: WangYouzheng
 * @Date: 2020/4/20 21:13
 * @Description:
 */
public class XiaoMi implements Brand {
	@Override
	public void open() {
		System.out.println("小米开机");
	}

	@Override
	public void close() {
		System.out.println("小米关机");
	}

	@Override
	public void call() {
		System.out.println("小米打电话");
	}
}
