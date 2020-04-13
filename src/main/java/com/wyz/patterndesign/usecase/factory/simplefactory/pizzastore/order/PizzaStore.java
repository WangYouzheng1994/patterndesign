package com.wyz.patterndesign.usecase.factory.simplefactory.pizzastore.order;

/**
 * @Author: WangYouzheng
 * @Date: 2020/3/31 19:08
 * @Description:
 */
public class PizzaStore {
	public static void main(String[] args) {
		// new OrderPizza();

		// 使用简单工厂模式，
		new OrderPizza(new SimpleFactory());
		System.out.println("退出");

		// 使用静态工厂模式
		new OrderPizza2();
	}
}
