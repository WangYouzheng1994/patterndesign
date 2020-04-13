package com.wyz.patterndesign.usecase.builder.improve;

/**
 * @Author: WangYouzheng
 * @Date: 2020/4/4 14:38
 * @Description: 具体建造者的实现
 */
public class CommonHouse extends HouseBuilder {
	@Override
	public void buildBasic() {
		System.out.println("普通房子打地基");
	}

	@Override
	public void buildWalls() {
		System.out.println("普通房子砌墙");
	}

	@Override
	public void buildRoofed() {
		System.out.println("普通房子封顶");
	}
}
