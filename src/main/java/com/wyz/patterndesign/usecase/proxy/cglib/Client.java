package com.wyz.patterndesign.usecase.proxy.cglib;

/**
 * @Author: WangYouzheng
 * @Date: 2020/5/2 16:12
 * @Description: 试试CGLib 怎么用
 */
public class Client {
	public static void main(String[] args) {
		// 目标 被代理对象
		TeacherDao target = new TeacherDao();
		// 代理对象
		TeacherDao proxyInstance = (TeacherDao) new ProxyFactory(target).getProxyInstance();
		// 执行代理对象的方法，会去触发intercept 的方法，从而实现对目标对象的调用。
		proxyInstance.teach();
		System.out.println(proxyInstance.teachHasReturn());
	}
}
