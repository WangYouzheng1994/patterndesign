package com.wyz.patterndesign.usecase.factory.abstractfactory.order;

import com.wyz.patterndesign.usecase.factory.abstractfactory.pizza.BJCheesePizza;
import com.wyz.patterndesign.usecase.factory.abstractfactory.pizza.BJPepperPizza;
import com.wyz.patterndesign.usecase.factory.abstractfactory.pizza.Pizza;

/**
 * @Author: WangYouzheng
 * @Date: 2020/4/2 21:09
 * @Description:
 */
public class BJFactory implements AbsFactory {
	/**
	 * 让下面的工厂子类来具体实现
	 *
	 * @param orderType
	 * @return
	 */
	@Override
	public Pizza createPizza(String orderType) {
		Pizza pizza = null;
		System.out.println("抽象工厂创建");
		if ("cheese".equals(orderType)) {
			pizza = new BJCheesePizza();
		} else if ("pepper".equals(orderType)) {
			pizza = new BJPepperPizza();
		}
		return pizza;
	}
}
