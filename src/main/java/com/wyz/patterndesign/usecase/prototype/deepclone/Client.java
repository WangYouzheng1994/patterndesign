package com.wyz.patterndesign.usecase.prototype.deepclone;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author: WangYouzheng
 * @Date: 2020/4/3 20:38
 * @Description: // 深拷贝，不能通过hashcode来验证。 但是可以通过equals来验证是不同的对象。
 */
public class Client {
	public static void main(String[] args) throws CloneNotSupportedException {
		DeepPrototype p = new DeepPrototype();
		p.setName("松江");
		p.setDeepCloneableTarget(new DeepCloneableTarget("大牛", "大牛的类"));

		// 方式一
		DeepPrototype p2 = p.clone();

		/*System.out.println(p.hashCode());
		System.out.println(p.getName());*/
		/*System.out.println(p.getDeepCloneableTarget().hashCode());
		*//*System.out.println(p2.hashCode());
		System.out.println(p2.getName());*//*
		p2.setName("阿斯顿发的说法 ");
		System.out.println(p2.getDeepCloneableTarget().hashCode());

		System.out.println(p);
		System.out.println(p2);
		System.out.println(p == p2);*/

		// 方式2 通过序列化的方式深拷贝
		p2 = (DeepPrototype) p.deepClone();
		// System.out.println(p2.hashCode());
		System.out.println(p.getDeepCloneableTarget().getCloneName());
		p2.getDeepCloneableTarget().setCloneName("大牛的克隆~");
		System.out.println(p2.getDeepCloneableTarget().getCloneName());
		System.out.println(p.getDeepCloneableTarget().getCloneName());

		// System.out.println(p.hashCode());
		// spring 多例模式构建对象。利用的就是原型模式。看配置文件也能看出来：prototype
		ApplicationContext a = new ClassPathXmlApplicationContext("bean.xml");
		SpringsBean bean = a.getBean(SpringsBean.class);
		SpringsBean bean1 = a.getBean(SpringsBean.class);
		System.out.println(bean.getRandom());
		System.out.println(bean1.getRandom());
		System.out.println(bean == bean1);
	}

}
