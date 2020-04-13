package com.wyz.patterndesign.usecase.prototype.improve;

/**
 * @Author: WangYouzheng
 * @Date: 2020/4/3 19:27
 * @Description: 通过
 */
public class Client {

	public static void main(String[] args) {
		System.out.println("原型模式完成对象的创建");
		Sheep sheep = new Sheep("tom", 1, "白色");
		Sheep sheep2 = (Sheep)sheep.clone();
		Sheep sheep3 = (Sheep)sheep.clone();
		Sheep sheep4 = (Sheep)sheep.clone();
		System.out.println(sheep);
		System.out.println(sheep2);
		System.out.println(sheep3);
		System.out.println(sheep4);

	}
}
