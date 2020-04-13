package com.wyz.patterndesign.usecase.adapter.objectadaper;

/**
 * @Author: WangYouzheng
 * @Date: 2020/4/4 21:01
 * @Description:
 */
public class Client {
	public static void main(String[] args) {
		System.out.println("---对象适配器模式----");
		Phone phone = new Phone();
		phone.charming(new VoltageAdapter(new Voltage220V()));
	}
}
