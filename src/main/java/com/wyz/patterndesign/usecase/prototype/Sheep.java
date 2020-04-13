package com.wyz.patterndesign.usecase.prototype;

import lombok.Data;

/**
 * @Author: WangYouzheng
 * @Date: 2020/4/3 18:57
 * @Description:
 */
@Data
public class Sheep {
	private String name;

	private Integer age;

	private String color;

	public Sheep(String name, Integer age, String color) {
		this.name = name;
		this.age = age;
		this.color = color;
	}
}
