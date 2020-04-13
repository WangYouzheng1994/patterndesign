package com.wyz.patterndesign.usecase.builder.improve;

/**
 * @Author: WangYouzheng
 * @Date: 2020/4/4 14:47
 * @Description: 使用者来决定到底要使用哪个建造者，然后传给指挥者。
 */
public class Client {
	public static void main(String[] args) {
		// 选定建造者 传统方式就是直接new了。 new出来以后 再由客户自己去调用怎么着怎么着的。实际上 都是一个用法。
		// 然后就抽象出来一个构造者。 这个构造者 和原来的类做抽象类没什么区别，重点在于加了一个执行者。然后把客户以前自己调用的顺序给封装起来。

		// 指定构造者。 这个隐含的意思是
		CommonHouse commonHouse = new CommonHouse();
		// 发给指挥者
		HouseDirector houseDirector = new HouseDirector(commonHouse);
		House house = houseDirector.constructHouse();
		System.out.println("__________+============");
		// 盖高楼
		HighBuilding highBuilding = new HighBuilding();
		houseDirector.setHouseBuilder(highBuilding);
		houseDirector.constructHouse();

		System.out.println("jdk的使用__________________+========");
		// JDK在建造者模式的使用
		StringBuilder sb = new StringBuilder("hello, susu");
		System.out.println(sb);
	}
}
