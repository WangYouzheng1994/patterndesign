package com.wyz.patterndesign.usecase.factory.abstractfactory.order;

import com.wyz.patterndesign.usecase.factory.abstractfactory.pizza.Pizza;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * @Author: WangYouzheng
 * @Date: 2020/4/2 21:12
 * @Description:
 */
public class OrderPizza {
	AbsFactory factory;

	public OrderPizza(AbsFactory factory) {
		this.setFactory(factory);
	}

	public void setFactory(AbsFactory factory) {
		Pizza pizza = null;
		String orderType = "";
		this.factory = factory;
		do {
			orderType = getType();
			// 持有抽象工厂的抽象
			pizza = factory.createPizza(orderType);
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
