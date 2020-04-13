package com.wyz.patterndesign.usecase.adapter.objectadaper;

/**
 * @Author: WangYouzheng
 * @Date: 2020/4/4 20:52
 * @Description: 被适配的类
 */
public class Voltage220V {
	public int output220() {
		System.out.println("服务商提供了---220V电压");
		return 220;
	}
}
