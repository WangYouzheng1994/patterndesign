package com.wyz.patterndesign.usecase.factory.factorymethod.pizzastore.order;

import com.wyz.patterndesign.usecase.factory.factorymethod.pizzastore.pizza.BJCheesePizza;
import com.wyz.patterndesign.usecase.factory.factorymethod.pizzastore.pizza.BJPepperPizza;
import com.wyz.patterndesign.usecase.factory.factorymethod.pizzastore.pizza.Pizza;

/**
 * @Author: WangYouzheng
 * @Date: 2020/4/2 20:00
 * @Description:
 */
public class BJOrderPizza extends OrderPizza {
	@Override
	Pizza createPizza(String orderType) {
		Pizza pizza = null;
		if ("cheese".equals(orderType)) {
			pizza = new BJCheesePizza();
		} else if("pepper".equals(orderType)) {
			pizza = new BJPepperPizza();
		}
		return pizza;
	}
}
