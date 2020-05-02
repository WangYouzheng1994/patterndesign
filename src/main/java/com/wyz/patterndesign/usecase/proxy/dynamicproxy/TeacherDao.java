package com.wyz.patterndesign.usecase.proxy.dynamicproxy;

/**
 * @Author: WangYouzheng
 * @Date: 2020/5/2 13:26
 * @Description:
 */
public class TeacherDao implements ITeacherDao {
	@Override
	public void teach() {
		System.out.println("老师正在授课中....");
	}

	@Override
	public void sayHello(String name) {
		System.out.println("hello " + name);
	}
}
