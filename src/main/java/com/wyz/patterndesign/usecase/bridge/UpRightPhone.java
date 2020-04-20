package com.wyz.patterndesign.usecase.bridge;

/**
 * @Author: WangYouzheng
 * @Date: 2020/4/20 21:13
 * @Description:
 */
public class UpRightPhone extends Phone {
	public UpRightPhone(Brand brand) {
		super(brand);
	}

	@Override
	protected void open() {
		System.out.println("直立式手机");
		super.open();
	}

	@Override
	protected void close() {
		System.out.println("直立式手机");
		super.close();
	}

	@Override
	protected void call() {
		System.out.println("直立式手机");
		super.call();
	}
}
