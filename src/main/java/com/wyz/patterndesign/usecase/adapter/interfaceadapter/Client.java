package com.wyz.patterndesign.usecase.adapter.interfaceadapter;

/**
 * @Author: WangYouzheng
 * @Date: 2020/4/8 11:07
 * @Description:
 */
public class Client {
	public static void main(String[] args) {
		// 虽然有默认的实现，但毕竟是抽象类，我们想怎么用就写个匿名类，对想用的做一个重写。这个匿名类就是具体实现类啊。
		// 使用者真正用的时候 再写实现。
		AbsAdapter absAdapter = new AbsAdapter() {
			@Override
			public void m1() {
				System.out.println("使用真正的转换方式~");
			}
		};
		absAdapter.m1();

		absAdapter = new AbsAdapter() {
			@Override
			public void m1() {
				super.m1();
			}
		};
		absAdapter.m1();
	}
}
