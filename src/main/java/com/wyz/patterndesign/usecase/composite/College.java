package com.wyz.patterndesign.usecase.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: WangYouzheng
 * @Date: 2020/5/1 11:11
 * @Description: College 管理的就是 department 这个类也是 Composite
 */
public class College extends OrganizationComponent {
	/**
	 * 这个list中存放的是  Department
	 */
	List<OrganizationComponent> organizationComponents = new ArrayList<>();

	/**
	 * 构造器
	 *
	 * @param name
	 * @param des
	 */
	public College(String name, String des) {
		super(name, des);
	}

	/**
	 * 为什么不做成抽象的？ 因为有些类（叶子节点），他可能不需要重写add方法
	 * 或者说他不需要add方法。如果做成抽象方法，那么所有的叶子都需要进行实现
	 *
	 * @param organizationComponent
	 */
	@Override
	protected void add(OrganizationComponent organizationComponent) {
		organizationComponents.add(organizationComponent);
	}

	@Override
	protected void remove(OrganizationComponent organizationComponent) {
		organizationComponents.remove(organizationComponent);
	}

	@Override
	public String getDes() {
		return super.getDes();
	}

	@Override
	public String getName() {
		return super.getName();
	}

	/**
	 * 做成抽象的方法 所有叶子节点都得实现。
	 */
	@Override
	protected void print() {
		System.out.println("----------------------------" + getName() + "----------------------------");
		// 遍历下层节点集合 List，进行输出
		for (OrganizationComponent organizationComponent : organizationComponents) {
			organizationComponent.print();
		}
	}
}
