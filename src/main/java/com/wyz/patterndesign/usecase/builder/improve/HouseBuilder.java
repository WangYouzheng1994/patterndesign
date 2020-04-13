package com.wyz.patterndesign.usecase.builder.improve;

/**
 * @Author: WangYouzheng
 * @Date: 2020/4/4 14:31
 * @Description: 抽象出建造一个 House 的过程。 写一个返回具体实例的方法
 */
public abstract class HouseBuilder {
	protected House house = new House();

	public abstract void buildBasic();

	public abstract void buildWalls();

	public abstract void buildRoofed();

	public House buildHouse() {
		return house;
	}
}
