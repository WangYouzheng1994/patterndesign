package com.wyz.patterndesign.usecase.factory.simplefactory.pizzastore.order;

import com.wyz.patterndesign.usecase.factory.simplefactory.pizzastore.pizza.Pizza;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * @Author: WangYouzheng
 * @Date: 2020/3/31 19:08
 * @Description: 静态工厂使用的方式。
 */
public class OrderPizza2 {
	Pizza pizza = null;
	String orderType = "";

	public OrderPizza2() {
		do {
			orderType = getType();
			pizza = SimpleFactory.createPizza2(orderType);

			if (pizza != null) {
				pizza.prepare();
				pizza.bake();
				pizza.cut();
				pizza.box();
			} else {
				System.out.println("订购失败");
				break;
			}
		} while (true);
	}

	/**
	 * 接收控制台输入的串
	 *
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
