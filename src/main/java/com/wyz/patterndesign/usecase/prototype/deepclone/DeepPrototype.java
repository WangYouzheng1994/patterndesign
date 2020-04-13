package com.wyz.patterndesign.usecase.prototype.deepclone;

import lombok.Data;

import java.io.*;

/**
 * @Author: WangYouzheng
 * @Date: 2020/4/3 20:29
 * @Description:
 */
@Data
public class DeepPrototype implements Serializable, Cloneable {
	private String name;

	public DeepCloneableTarget deepCloneableTarget; // 引用类型

	public DeepPrototype() {

	}

	/**
	 * 方式1:使用重写clone的方法，实际上就是手动的去针对于引用型成员变量单独进行clone  ---》 确保子类可以克隆
	 *
	 * @return
	 * @throws CloneNotSupportedException
	 */
	@Override
	protected DeepPrototype clone() throws CloneNotSupportedException {
		DeepPrototype deepResult = (DeepPrototype) super.clone();
		// 这里完成对基本数据类型（属性）和String的克隆
		// 对引用类型的属性进行单独的处理
		deepResult.setDeepCloneableTarget((DeepCloneableTarget) this.deepCloneableTarget.clone());// 因为他自己的成员中是没有引用类型的。
		return deepResult;
	}

	public Object deepClone() {
		// 创建流对象
		try  {
			ByteArrayOutputStream bos = new ByteArrayOutputStream();
			ObjectOutputStream oos = new ObjectOutputStream(bos);
			oos.writeObject(this);

			ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
			ObjectInputStream ois = new ObjectInputStream(bis);
			DeepPrototype deepCopy = (DeepPrototype) ois.readObject();
			return deepCopy;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

}
