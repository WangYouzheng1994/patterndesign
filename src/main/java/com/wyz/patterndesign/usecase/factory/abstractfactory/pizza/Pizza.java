package com.wyz.patterndesign.usecase.factory.abstractfactory.pizza;

/**
 * @Author: WangYouzheng
 * @Date: 2020/3/31 19:09
 * @Description: 抽象一个pizza
 */
public abstract class Pizza {
	protected String name;

	/**
	 * 准备原材料，不同的pizza是不一样的，因此，我们要做成抽象方法。
	 */
	public abstract void prepare();

	/**
	 * 烘烤
	 */
	public void bake() {
		System.out.println(this.name + " baking;");
	}

	/**
	 * 切割
	 */
	public void cut() {
		System.out.println(this.name + " cut;");
	}

	/**
	 * 打包
	 */
	public void box() {
		System.out.println(this.name + " box;");
	}

	public void setName(String name) {
		this.name = name;
	}
}
