package com.wyz.patterndesign.uml.composition;

/**
 * @Author: WangYouzheng
 * @Date: 2020/3/27 21:30
 * @Description:
 */
public class Computer {
	private Monitor monitor = new Monitor();
	private Mouse mouse = new Mouse();

}
