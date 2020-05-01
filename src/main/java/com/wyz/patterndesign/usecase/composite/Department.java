package com.wyz.patterndesign.usecase.composite;

/**
 * @Author: WangYouzheng
 * @Date: 2020/5/1 11:15
 * @Description: Department 是业务层面的叶子节点。他不可能包含其他的Organization,他不需要 ADD 和 Remove方法
 */
public class Department extends OrganizationComponent {
	/**
	 * 构造器
	 *
	 * @param name
	 * @param des
	 */
	public Department(String name, String des) {
		super(name, des);
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
		System.out.println(getName());
	}
}