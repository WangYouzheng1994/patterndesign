package com.wyz.patterndesign.usecase.decorator.io;

import java.io.DataInputStream;
import java.io.FileInputStream;

/**
 * @Author: WangYouzheng
 * @Date: 2020/4/26 21:31
 * @Description: 感受io的装饰者实现
 */
public class Decorator {
	public static void main(String[] args) throws Exception {

		/**
		 * InputStream是一个抽象类，就是抽象构件。
		 * FileInputStream 继承了InputStream可以是具体构建
		 * FilterInputStream 继承了 InputStream并且持有InputStream的成员变量  视为抽象装饰者
		 * DataInputStream是FileInputStream的子类。 视为具体装饰者
		 */
		DataInputStream dis = new DataInputStream(new FileInputStream("3.27 大批更改.xlsx"));
		System.out.println(dis.read());
		dis.close();
	}
}
