package com.wyz.patterndesign.usecase.prototype.deepclone;

import lombok.Data;

import java.util.Random;

/**
 * @Author: WangYouzheng
 * @Date: 2020/4/4 12:19
 * @Description:
 */
@Data
public class SpringsBean {
	private String springName;

	private Random random = new Random(100);

	public SpringsBean() {

	}
}
