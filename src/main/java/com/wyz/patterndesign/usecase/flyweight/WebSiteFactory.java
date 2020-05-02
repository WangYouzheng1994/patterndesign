package com.wyz.patterndesign.usecase.flyweight;

import java.util.HashMap;

/**
 * @Author: WangYouzheng
 * @Date: 2020/5/1 20:04
 * @Description: 享元工厂类  --- > 网站的工厂类，根据需求返回一个网站的实例。
 */
public class WebSiteFactory {
	/**
	 * 集合，充当池的作用
	 */
	private HashMap<String, ConcreateWebSite> pool = new HashMap<>();

	/**
	 * 根据网站的类型，返回一个网站，如果没有就创建一个网站，并放入池中，并返回
	 *
	 * @param type
	 * @return
	 */
	public WebSite getWebsiSiteCategory(String type) {
		if (!pool.containsKey(type)) {
			pool.put(type, new ConcreateWebSite(type));
		}
		return pool.get(type);
	}

	public int getWebSiteCount() {
		return pool.size();
	}
}
