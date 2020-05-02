package com.wyz.patterndesign.usecase.flyweight;

/**
 * @Author: WangYouzheng
 * @Date: 2020/5/1 20:26
 * @Description: 享元对象的外部状态
 */
public class User {
	private String name;

	public User(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
