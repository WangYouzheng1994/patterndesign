package com.wyz.patterndesign.usecase.builder.improve;

/**
 * @Author: WangYouzheng
 * @Date: 2020/4/4 14:42
 * @Description: 指挥者，具体来操作建造者的制作方法，返回产品。暴露给使用者的类。 指挥者来具体操作不同的生成结果。
 */
public class HouseDirector {
	HouseBuilder houseBuilder = null;

	/**
	 * 构造器传入houseBuilder进行聚合
	 */
	public HouseDirector(HouseBuilder houseBuilder) {
		this.houseBuilder = houseBuilder;
	}

	/**
	 * setter传入houseBuilder进行聚合
	 */
	public void setHouseBuilder(HouseBuilder houseBuilder) {
		this.houseBuilder = houseBuilder;
	}

	/**
	 * 指挥者。如何处理（调用）建造房子的流程 （调用Builder抽象出来的方法）。 这种方法会有很多。因为可能同一个构建者的构建顺序也不同
 	 */
	public House constructHouse() {
		houseBuilder.buildBasic();
		houseBuilder.buildWalls();
		houseBuilder.buildRoofed();
		return houseBuilder.buildHouse();
	}
}
