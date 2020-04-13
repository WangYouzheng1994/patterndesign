package com.wyz.patterndesign.uml.aggregation;

/**
 * @Author: WangYouzheng
 * @Date: 2020/3/27 21:30
 * @Description:
 */
public class Computer {
	private Monitor monitor;
	private Mouse mouse;

	public void setMonitor(Monitor monitor) {
		this.monitor = monitor;
	}

	public void setMouse(Mouse mouse) {
		this.mouse = mouse;
	}
}
