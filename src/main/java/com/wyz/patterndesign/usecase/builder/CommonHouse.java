package com.wyz.patterndesign.usecase.builder;

/**
 * @Author: WangYouzheng
 * @Date: 2020/4/4 12:39
 * @Description:
 */
public class CommonHouse extends AbstractHouse {
	@Override
	public void buildBasic() {
		System.out.println("给普通房子打地基");
	}

	@Override
	public void buildWalls() {
		System.out.println("给普通房子砌墙");
	}

	@Override
	public void roofed() {
		System.out.println("给普通房子封顶");
	}
}
