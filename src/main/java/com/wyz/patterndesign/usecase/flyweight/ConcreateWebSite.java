package com.wyz.patterndesign.usecase.flyweight;

/**
 * @Author: WangYouzheng
 * @Date: 2020/5/1 20:02
 * @Description: 具体享元类 --- 网站实例。
 */
public class ConcreateWebSite extends WebSite {
	/**
	 * 网站发布的形式（类型）  共享的部分,内部状态~
	 */
	private String type = "";


	/**
	 * 创建具体的类的时候，指定好 Type
	 * @param type
	 */
	public ConcreateWebSite(String type) {
		this.type = type;
	}

	@Override
	public void use(User user) {
		System.out.println("网站的发布形式为:" + type + "，使用者为：" + user.getName());
	}
}
