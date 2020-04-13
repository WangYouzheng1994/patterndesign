package com.wyz.patterndesign.usecase.adapter.interfaceadapter;

/**
 * @Author: WangYouzheng
 * @Date: 2020/4/8 11:06
 * @Description: 我们将IInterface4中的方法进行默认实现。
 */
public abstract class AbsAdapter implements IInterface4 {
	@Override
	public void m1() {
		System.out.println("m1 的默认实现");
	}

	@Override
	public void m2() {
		System.out.println("m2 的默认实现");
	}

	@Override
	public void m3() {
		System.out.println("m3 的默认实现");
	}

	@Override
	public void m4() {
		System.out.println("m4 的默认实现");
	}
}
