package com.wyz.patterndesign.usecase.proxy.dynamicproxy;
/*
import org.springframework.cglib.proxy.InvocationHandler;
import org.springframework.cglib.proxy.Proxy;*/

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @Author: WangYouzheng
 * @Date: 2020/5/2 13:27
 * @Description:
 */
public class ProxyFactory {
	// 维护目标对象, Object的形式
	private Object target;

	/**
	 * 构建的时候，对target目标对象进行初始化
	 *
	 * @param target
	 */
	public ProxyFactory(Object target) {
		this.target = target;
	}

	public Object getProxyInstance() {
		// Param1: 指定当前目标对象使用的类加载器，获取加载器的方法固定
		// Param2: 目标对象实现的接口类型，使用泛型方法确认类型
		// 事件处理，指定目标对象的方法时，触发事件处理器方法，会把当前执行的目标对象方法作为一个参数传入。
		return Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(), new InvocationHandler() {
			@Override
			public Object invoke(Object o, Method method, Object[] objects) throws Throwable {
				System.out.println("JDK代理开始");
				// 反射机制调用目标对象的方法 param1:目标对象， param2:参数
				Object returnVal = method.invoke(target, objects);
				System.out.println("JDK代理完事");
				return returnVal;
			}
		});
	}
}
