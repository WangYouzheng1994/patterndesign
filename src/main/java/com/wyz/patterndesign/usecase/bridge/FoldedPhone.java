package com.wyz.patterndesign.usecase.bridge;

/**
 * @Author: WangYouzheng
 * @Date: 2020/4/20 21:13
 * @Description: 折叠样式 继承了 抽象的类
 */
public class FoldedPhone extends Phone {
	public FoldedPhone(Brand brand) {
		super(brand);
	}

	public void open() {
		super.open();
		System.out.println("折叠手机");
	}
	public void close() {
		super.close();
		System.out.println("折叠手机");
	}

	public void call() {
		super.call();
		System.out.println("折叠手机");
	}
}
