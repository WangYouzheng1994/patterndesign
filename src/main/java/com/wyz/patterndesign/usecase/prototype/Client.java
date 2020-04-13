package com.wyz.patterndesign.usecase.prototype;

/**
 * @Author: WangYouzheng
 * @Date: 2020/4/3 18:56
 * @Description:
 */
public class Client {
	public static void main(String[] args) {
		// 传统的方式
		Sheep sheep = new Sheep("tom", 1, "白色");
		Sheep sheep2 = new Sheep(sheep.getName(), sheep.getAge(), sheep.getColor());
		Sheep sheep3 = new Sheep(sheep.getName(), sheep.getAge(), sheep.getColor());
		Sheep sheep4 = new Sheep(sheep.getName(), sheep.getAge(), sheep.getColor());
		Sheep sheep5 = new Sheep(sheep.getName(), sheep.getAge(), sheep.getColor());
		Sheep sheep6 = new Sheep(sheep.getName(), sheep.getAge(), sheep.getColor());
		System.out.println(sheep.hashCode());
		System.out.println(sheep2.hashCode());
		System.out.println(sheep3);
		System.out.println(sheep4);
		System.out.println(sheep5);
		System.out.println(sheep6);
	}
}
