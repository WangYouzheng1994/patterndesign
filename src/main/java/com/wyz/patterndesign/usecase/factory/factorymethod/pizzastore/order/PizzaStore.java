package com.wyz.patterndesign.usecase.factory.factorymethod.pizzastore.order;

/**
 * @Author: WangYouzheng
 * @Date: 2020/4/2 20:15
 * @Description:
 */
public class PizzaStore {
	public static void main(String[] args) {
		// 创建北京口味的各种pizza
		// new BJOrderPizza();
		// 创建伦敦口味的pizza
		new LDOrderPizza();
		// 这种模式暴露的一个明显的问题是。针对于同一个大类的分类中的实例化，需要分开调用。
	}
}
