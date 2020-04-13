package com.wyz.patterndesign.usecase.adapter.classadapter;

/**
 * @Author: WangYouzheng
 * @Date: 2020/4/4 20:56
 * @Description: 适配器 220V转成5V 的接口。
 */
public class VoltageAdapter extends Voltage220V implements IVoltage5V {
	/**
	 * 适配器的实现5V
	 * @return
	 */
	@Override
	public int output5V() {
		int src = output220();
		int dstV = src / 44; // 转成5V
		return dstV;
	}
}
