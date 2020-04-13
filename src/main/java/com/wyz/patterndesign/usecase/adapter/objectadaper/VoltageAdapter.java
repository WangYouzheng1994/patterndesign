package com.wyz.patterndesign.usecase.adapter.objectadaper;

import com.wyz.patterndesign.usecase.adapter.classadapter.IVoltage5V;

/**
 * @Author: WangYouzheng
 * @Date: 2020/4/4 20:56
 * @Description: 适配器 220V转成5V 的接口。
 */
public class VoltageAdapter implements IVoltage5V {
	Voltage220V source;

	public VoltageAdapter(Voltage220V source) {
		this.source = source;
	}

	/**
	 * 适配器的实现5V
	 * @return
	 */
	@Override
	public int output5V() {
		int dstV = 0;
		if (source != null) {
			System.out.println("使用对象适配器进行适配转换");
			int src = source.output220();
			dstV = src / 44; // 转成5V
			System.out.println("适配完成");
		}

		return dstV;
	}
}
