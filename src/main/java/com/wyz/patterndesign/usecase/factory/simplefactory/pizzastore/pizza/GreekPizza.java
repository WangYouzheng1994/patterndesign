package com.wyz.patterndesign.usecase.factory.simplefactory.pizzastore.pizza;

/**
 * @Author: WangYouzheng
 * @Date: 2020/3/31 19:08
 * @Description:
 */
public class GreekPizza extends Pizza {


	/**
	 * 准备原材料，不同的pizza是不一样的，因此，我们要做成抽象方法。
	 */
	@Override
	public void prepare() {
		System.out.println("给希腊披萨准备原材料");
	}
}
