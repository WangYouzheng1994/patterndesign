package com.wyz.patterndesign.usecase.factory.abstractfactory.pizza;

/**
 * @Author: WangYouzheng
 * @Date: 2020/3/31 19:08
 * @Description:
 */
public class LDCheesePizza extends Pizza {

	/**
	 * 准备原材料，不同的pizza是不一样的，因此，我们要做成抽象方法。
	 */
	@Override
	public void prepare() {
		setName("伦敦奶酪披萨");
		System.out.println("给制作伦敦奶酪披萨准备原材料");
	}
}
