package com.wyz.patterndesign.usecase.proxy.staticproxy;

/**
 * @Author: WangYouzheng
 * @Date: 2020/5/2 12:53
 * @Description: 代理对象，静态代理
 */
public class TeacherDaoProxy implements ITeacherDao {
	/**
	 * 目标对象，也就是被代理对象，通过接口进行聚合
	 */
	private ITeacherDao targetTeacherDao;

	/**
	 * 接收目标对象
	 *
	 * @param targetTeacherDao
	 */
	public TeacherDaoProxy(ITeacherDao targetTeacherDao) {
		this.targetTeacherDao = targetTeacherDao;
	}

	/**
	 * 增强了目标对象（被代理对象）的功能。对外暴露的是同一个接口。
	 */
	@Override
	public void teach() {
		System.out.println("开始代理。。。。");

		this.targetTeacherDao.teach();

		System.out.println("代理结束。。。。");
	}
}
