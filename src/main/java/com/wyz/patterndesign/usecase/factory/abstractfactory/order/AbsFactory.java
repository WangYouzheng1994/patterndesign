package com.wyz.patterndesign.usecase.factory.abstractfactory.order;

import com.wyz.patterndesign.usecase.factory.abstractfactory.pizza.Pizza;

/**
 * @Author: WangYouzheng
 * @Date: 2020/4/2 21:08
 * @Description: 抽象工厂模式，工厂的抽象层
 */
public interface AbsFactory {
	/**
	 * 让下面的工厂子类来具体实现
	 *
	 * @param orderType
	 * @return
	 */
	public Pizza createPizza(String orderType);
}
