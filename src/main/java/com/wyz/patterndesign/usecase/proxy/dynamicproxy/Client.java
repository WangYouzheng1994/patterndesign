package com.wyz.patterndesign.usecase.proxy.dynamicproxy;

/**
 * @Author: WangYouzheng
 * @Date: 2020/5/2 14:33
 * @Description: JDK动态代理的使用
 */
public class Client {
	public static void main(String[] args) {
		// 创建目标对象
		ITeacherDao targetTeacherDao = new TeacherDao();

		// 通过工厂类拿到代理对象，可以转成ITeacherDao，为什么可以转成ITeacherDao，因为可以联想到Spring，他如果用默认的JDK代理是作用在接口上的代理。他与真正的被代理（目标）对象是平级的。
		ITeacherDao proxyInstance = (ITeacherDao) new ProxyFactory(targetTeacherDao).getProxyInstance(); // 强转成共同的接口~
		System.out.println(proxyInstance); // com.wyz.patterndesign.usecase.proxy.dynamicproxy.TeacherDao@3b07d329  这个应该是jdk的代理对象重写了toString
		System.out.println(proxyInstance.getClass()); // class com.sun.proxy.$Proxy0  看到了$不？ 这就是代理对象。

		// 通过代理对象调用了目标对象的方法。
		proxyInstance.teach();

		proxyInstance.sayHello("susu");
	}
}
