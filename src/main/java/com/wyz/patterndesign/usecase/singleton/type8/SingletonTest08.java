package com.wyz.patterndesign.usecase.singleton.type8;

/**
 * @Author: WangYouzheng
 * @Date: 2020/3/30 18:58
 * @Description: 单例设计模式 --- 使用枚举实现，还可以防止反序列化生成对象。
 */
public class SingletonTest08 {
	public static void main(String[] args) {
		Singleton instantce = Singleton.INSTANTCE;
		Singleton instantce2 = Singleton.INSTANTCE;

		System.out.println(instantce == instantce2);

		System.out.println(instantce.hashCode());
		System.out.println(instantce2.hashCode());

		instantce.sayOK();
	}
}

enum Singleton {
	INSTANTCE;


	public void sayOK() {
		System.out.println("ok");
	}
}