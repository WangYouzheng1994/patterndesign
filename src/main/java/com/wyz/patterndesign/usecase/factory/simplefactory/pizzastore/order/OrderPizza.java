package com.wyz.patterndesign.usecase.factory.simplefactory.pizzastore.order;

import com.wyz.patterndesign.usecase.factory.simplefactory.pizzastore.pizza.CheesePizza;
import com.wyz.patterndesign.usecase.factory.simplefactory.pizzastore.pizza.GreekPizza;
import com.wyz.patterndesign.usecase.factory.simplefactory.pizzastore.pizza.Pizza;

import java.io.*;

/**
 * @Author: WangYouzheng
 * @Date: 2020/3/31 19:08
 * @Description: 先是通过工厂来解耦实例化对象的方法
 */
public class OrderPizza {
	SimpleFactory simpleFactory;
	Pizza pizza = null;
/*	public OrderPizza() {
		Pizza pizza = null;
		// 订购披萨的类型
		String orderType;

		do {
			orderType = getType();
			if (orderType.equals("greek")) {
				pizza = new GreekPizza();
				pizza.setName("希腊披萨");
			} else if (orderType.equals("cheese")) {
				pizza = new CheesePizza();
				pizza.setName("奶酪披萨");
			} else {
				break;
			}
			pizza.prepare();
			pizza.bake();
			pizza.cut();
			pizza.box();
		} while (true);
	}*/

	public OrderPizza(SimpleFactory simpleFactory) {
		setFactory(simpleFactory);
	}

	public void setFactory(SimpleFactory simpleFactory) {
		String orderType = "";
		this.simpleFactory = simpleFactory;

		do {
			orderType = getType();
			pizza = this.simpleFactory.createPizza(orderType);

			if (pizza != null) {
				pizza.prepare();
				pizza.bake();
				pizza.cut();
				pizza.box();
			} else {
				System.out.println("订购失败");
				break;
			}
		} while(true);

	}

	/**
	 * 接收控制台输入的串
	 * @return
	 */
	private String getType() {
		try {
			BufferedReader strin = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("输入想要的披萨类型：");
			String str = strin.readLine();

			return str;
		} catch (Exception e) {
			e.printStackTrace();
			return "";
		}
	}
}
