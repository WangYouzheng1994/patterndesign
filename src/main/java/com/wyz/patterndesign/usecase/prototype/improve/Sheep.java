package com.wyz.patterndesign.usecase.prototype.improve;

import lombok.Data;

/**
 * @Author: WangYouzheng
 * @Date: 2020/4/3 18:57
 * @Description:
 */
@Data
public class Sheep implements Cloneable {
	private String name;

	private Integer age;

	private String color;

	private String address = "蒙古羊";
	public Sheep(String name, Integer age, String color) {
		this.name = name;
		this.age = age;
		this.color = color;
	}

	@Override
	protected Object clone() {
		Sheep sheep = null;

		try {
			sheep = (Sheep) super.clone();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return sheep;
	}
}
