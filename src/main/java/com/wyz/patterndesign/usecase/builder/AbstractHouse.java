package com.wyz.patterndesign.usecase.builder;

/**
 * @Author: WangYouzheng
 * @Date: 2020/4/4 12:37
 * @Description: 抽取一个盖房子的抽象类，由不同的子类来实现。
 */
public abstract class AbstractHouse {
	/**
	 * 打地基
	 */
	public abstract void buildBasic();

	/**
	 * 砌墙
	 */
	public abstract void buildWalls();

	/**
	 * 封顶
	 */
	public abstract void roofed();

	public void build() {
		buildBasic();
		buildWalls();
		roofed();
	}
}
