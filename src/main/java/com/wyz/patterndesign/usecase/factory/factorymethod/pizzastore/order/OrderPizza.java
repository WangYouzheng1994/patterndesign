package com.wyz.patterndesign.usecase.factory.factorymethod.pizzastore.order;

import com.wyz.patterndesign.usecase.factory.factorymethod.pizzastore.pizza.Pizza;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * @Author: WangYouzheng
 * @Date: 2020/3/31 19:08
 * @Description:
 */
public abstract class OrderPizza {
	Pizza pizza = null;

	public OrderPizza() {
		Pizza pizza = null;
		String orderType;

		do {
			orderType = getType();
			pizza = createPizza(orderType);// 由工厂子类完成

			// 输出pizza制作过程 来
			if (pizza != null) {
				pizza.prepare();
				pizza.bake();
				pizza.cut();
				pizza.box();
			} else {
				if ("q".equals(orderType)) {
					break;
				}
			}
		} while (true);

	}

	// 定义一个抽象方法，createPizza，让各个工厂子类自己实现
	abstract Pizza createPizza(String orderType);

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
