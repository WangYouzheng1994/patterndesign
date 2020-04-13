package com.wyz.patterndesign.usecase.factory.factorymethod.pizzastore.order;

import com.wyz.patterndesign.usecase.factory.factorymethod.pizzastore.pizza.LDCheesePizza;
import com.wyz.patterndesign.usecase.factory.factorymethod.pizzastore.pizza.LDPepperPizza;
import com.wyz.patterndesign.usecase.factory.factorymethod.pizzastore.pizza.Pizza;

/**
 * @Author: WangYouzheng
 * @Date: 2020/4/2 20:00
 * @Description:
 */
public class LDOrderPizza extends OrderPizza {
	@Override
	Pizza createPizza(String orderType) {
		Pizza pizza = null;
		if ("cheese".equals(orderType)) {
			pizza = new LDCheesePizza();
		} else if("pepper".equals(orderType)) {
			pizza = new LDPepperPizza();
		}

		return pizza;
	}
}
