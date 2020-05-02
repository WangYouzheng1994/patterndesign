package com.wyz.patterndesign.usecase.proxy.cglib;

/**
 * @Author: WangYouzheng
 * @Date: 2020/5/2 15:45
 * @Description:
 */
public class TeacherDao {
	public void teach() {
		System.out.println("老师授课中，我是cglib代理，不需要实现接口~~~ ");
	}

	public String teachHasReturn() {
		System.out.println("老师授课中，我是cglib代理，不需要实现接口~~~ ");
		return "啦啦啦啦 返回值~";
	}
}
