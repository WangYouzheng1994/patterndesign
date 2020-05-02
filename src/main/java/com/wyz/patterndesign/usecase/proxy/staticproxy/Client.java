package com.wyz.patterndesign.usecase.proxy.staticproxy;

/**
 * @Author: WangYouzheng
 * @Date: 2020/5/2 12:58
 * @Description: 静态代理的使用
 */
public class Client {
	public static void main(String[] args) {
		// 创建目标对象
		TeacherDao target = new TeacherDao();

		// 创建代理对象，同时将被代理对象传递给代理对象
		TeacherDaoProxy teacherDaoProxy = new TeacherDaoProxy(target);

		// 通过代理对象，调用到被代理对象的方法。
		teacherDaoProxy.teach();
	}
}
