package com.wyz.patterndesign.usecase.factory.abstractfactory.order;

/**
 * @Author: WangYouzheng
 * @Date: 2020/4/2 21:26
 * @Description: 抽象工厂模式 -- 传递不同的工厂实现子类来实现构建不同的对象。这样相比较于工厂模式来说，工厂更多了 可以应付更多不同的对象进行创建
 */
public class PizzaStore {
	public static void main(String[] args) {
		new OrderPizza(new BJFactory());
	}
}
