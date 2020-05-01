package com.wyz.patterndesign.usecase.composite;

import lombok.Data;

/**
 * @Author: WangYouzheng
 * @Date: 2020/4/30 22:04
 * @Description: 抽象出一个共有的 所有节点的一些操作方式，他定一些方法。具体实现要看他的实现子类。
 */
@Data
public abstract class OrganizationComponent {
	private String name;
	private String des;

	public OrganizationComponent(String name, String des) {
		this.name = name;
		this.des = des;
	}

	/**
	 * 为什么不做成抽象的？ 因为有些类（叶子节点），他可能不需要重写add方法
	 * 或者说他不需要add方法。如果做成抽象方法，那么所有的叶子都需要进行实现
	 *
	 * @param organizationComponent
	 */
	protected void add(OrganizationComponent organizationComponent) {
		// 写一个默认的实现
		throw new UnsupportedOperationException();
	}

	protected void remove(OrganizationComponent organizationComponent) {
		// 写一个默认的实现
		throw new UnsupportedOperationException();
	}

	/**
	 * 做成抽象的方法 所有叶子节点都得实现。
	 */
	protected abstract void print();
}
