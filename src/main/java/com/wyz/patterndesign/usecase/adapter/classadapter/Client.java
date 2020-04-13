package com.wyz.patterndesign.usecase.adapter.classadapter;

/**
 * @Author: WangYouzheng
 * @Date: 2020/4/4 21:01
 * @Description:
 */
public class Client {
	public static void main(String[] args) {
		System.out.println("---类适配器模式----");
		Phone phone = new Phone();
		phone.charming(new VoltageAdapter());
	}
}
