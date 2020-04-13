package com.wyz.patterndesign.usecase.adapter.objectadaper;

import com.wyz.patterndesign.usecase.adapter.classadapter.IVoltage5V;

/**
 * @Author: WangYouzheng
 * @Date: 2020/4/4 20:58
 * @Description: 使用类
 */
public class Phone {
	public void charming(IVoltage5V iVoltage5V) {
		if (iVoltage5V.output5V() == 5) {
			System.out.println("电压为5V，可以充电");
		} else if (iVoltage5V.output5V() > 5) {
			System.out.println("电压过高，不能充电");
		}
	}
}
