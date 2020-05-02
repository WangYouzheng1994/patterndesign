package com.wyz.patterndesign.usecase.proxy.cglib;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @Author: WangYouzheng
 * @Date: 2020/5/2 15:47
 * @Description: 跟跟源码看了一下  他继承了MethodIntercptor以后 实际上就是 一个回调类，只要调用了方法 那么就会执行intercept()
 */
public class ProxyFactory implements MethodInterceptor {

	/**
	 * 目标对象 被代理的对象。
	 */
	private Object target;

	public ProxyFactory(Object target) {
		this.target = target;
	}

	/**
	 * 获取一个目标对象target的代理对象。
	 *
	 * @return
	 */
	public Object getProxyInstance() {
		// 创建一个工具类
		Enhancer enhancer = new Enhancer();
		// 设置父类
		enhancer.setSuperclass(target.getClass());
		// 设置回调函数
		enhancer.setCallback(this);
		return enhancer.create();
	}

	/**
	 * 代理对象所有的方法都会调用这里的方法
	 *
	 * @param obj
	 * @param method
	 * @param args
	 * @param proxy
	 * @return
	 * @throws Throwable
	 */
	@Override
	public Object intercept(Object obj, Method method, Object[] args, MethodProxy proxy) throws Throwable {
		System.out.println("Cglib代理模式~~ 开始");
		Object returnVal = method.invoke(target, args);
		System.out.println("Cglib代理模式~~ 提交");
		return returnVal;
	}
}
