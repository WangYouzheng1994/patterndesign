package com.wyz.patterndesign.usecase.factory.simplefactory.pizzastore.order;

import com.wyz.patterndesign.usecase.factory.simplefactory.pizzastore.pizza.CheesePizza;
import com.wyz.patterndesign.usecase.factory.simplefactory.pizzastore.pizza.GreekPizza;
import com.wyz.patterndesign.usecase.factory.simplefactory.pizzastore.pizza.Pizza;

/**
 * @Author: WangYouzheng
 * @Date: 2020/3/31 20:38
 * @Description:
 */
public class SimpleFactory {
	public Pizza createPizza(String orderType) {
		System.out.println("简单工厂模式");

		Pizza pizza = null;
		if (orderType.equals("greek")) {
			pizza = new GreekPizza();
			pizza.setName("希腊披萨");
		} else if (orderType.equals("cheese")) {
			pizza = new CheesePizza();
			pizza.setName("奶酪披萨");
		}

		return pizza;
	}

	public static Pizza createPizza2(String orderType) {
		Pizza pizza = null;
		System.out.println("简单工厂模式2 -- 静态工厂");

		if (orderType.equals("greek")) {
			pizza = new GreekPizza();
			pizza.setName("希腊披萨");
		} else if (orderType.equals("cheese")) {
			pizza = new CheesePizza();
			pizza.setName("奶酪披萨");
		}

		return pizza;
	}
}
