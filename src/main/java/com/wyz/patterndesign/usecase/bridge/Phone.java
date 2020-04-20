package com.wyz.patterndesign.usecase.bridge;

/**
 * @Author: WangYouzheng
 * @Date: 2020/4/20 21:13
 * @Description:
 */
public abstract class Phone {
	Brand brand;

	public Phone(Brand brand) {
		super();
		this.brand = brand;
	}

	protected void open() {
		this.brand.open();
	}

	protected void close() {
		this.brand.close();
	}

	protected void call() {
		this.brand.call();
	}
}
