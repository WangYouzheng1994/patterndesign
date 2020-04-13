package com.wyz.patterndesign.usecase.builder.improve;

/**
 * @Author: WangYouzheng
 * @Date: 2020/4/4 14:40
 * @Description: 高楼的建造者具体实现
 */
public class HighBuilding extends HouseBuilder {
	@Override
	public void buildBasic() {
		System.out.println("高楼打地基");
	}

	@Override
	public void buildWalls() {
		System.out.println("高楼砌墙20M");
	}

	@Override
	public void buildRoofed() {
		System.out.println("高楼封顶5M");
	}
}
