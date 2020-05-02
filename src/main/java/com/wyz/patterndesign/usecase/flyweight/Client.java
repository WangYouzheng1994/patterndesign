package com.wyz.patterndesign.usecase.flyweight;

import java.sql.DriverManager;

/**
 * @Author: WangYouzheng
 * @Date: 2020/5/1 20:12
 * @Description:
 */
public class Client {
	public static void main(String[] args) {
		// 创建一个工厂类
		WebSiteFactory factory = new WebSiteFactory();
		// 发布一个新闻类型的。
		WebSite news = factory.getWebsiSiteCategory("新闻");
		news.use(new User("老王2"));

		// 发布一个博客形式的。
		WebSite blog = factory.getWebsiSiteCategory("博客");
		blog.use(new User("老王"));

		WebSite blog2 = factory.getWebsiSiteCategory("博客");
		blog2.use(new User("老张"));

		System.out.println(factory.getWebSiteCount());

	}
}
