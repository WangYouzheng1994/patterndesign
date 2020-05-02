package com.wyz.patterndesign.usecase.proxy.staticproxy;

/**
 * @Author: WangYouzheng
 * @Date: 2020/5/2 12:52
 * @Description:
 */
public class TeacherDao implements ITeacherDao {
	@Override
	public void teach() {
		System.out.println("老师上课中。。。");
	}
}
