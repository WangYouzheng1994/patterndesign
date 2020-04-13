package com.wyz.patterndesign.usecase.prototype.deepclone;

import lombok.Data;

import java.io.Serializable;

/**
 * @Author: WangYouzheng
 * @Date: 2020/4/3 20:27
 * @Description:
 */
@Data
public class DeepCloneableTarget implements Serializable, Cloneable {
	private String cloneName;

	private String cloneClass;

	public DeepCloneableTarget(String cloneName, String cloneClass) {
		this.cloneName = cloneName;
		this.cloneClass = cloneClass;
	}

	/**
	 * 因为该类的成员变量 都是String，因此使用默认的clone来完成原型方式的创建对象即可。
	 * @return
	 * @throws CloneNotSupportedException
	 */
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}
