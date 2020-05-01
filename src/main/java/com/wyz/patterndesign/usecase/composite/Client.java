package com.wyz.patterndesign.usecase.composite;

/**
 * @Author: WangYouzheng
 * @Date: 2020/5/1 11:22
 * @Description: 使用者 实际上这个client可以认为是 构建树的那个使用者，这个树真正组装完了以后还会有一个使用者的。
 */
public class Client {
	public static void main(String[] args) {
		// 根据层级 依次构建对象
		// 学校
		OrganizationComponent university = new University("清华大学", "中国顶级高校");
		// 学院
		OrganizationComponent computerCollege = new University("计算机学院", "计算机学院");
		OrganizationComponent engineerCollege = new University("信息工程学院", "信息工程学院");

		// 系，专业
		computerCollege.add(new Department("软件工程", "软件工程不错"));
		computerCollege.add(new Department("网络工程", "网络工程不错"));
		computerCollege.add(new Department("计算机科学与技术", "计算机科学与技术是传统老牌的专业"));

		engineerCollege.add(new Department("通信工程", "通信工程不好学~"));
		engineerCollege.add(new Department("信息工程", "信息工程很好学~"));

		// 将College 放到 University中。（这个实际上是业务层面的，实际上是任何层级都可以放的，除了Leaf节点的Department）
		university.add(computerCollege);
		university.add(engineerCollege);
		university.print(); // 输出 University 及下面的所有节点
		System.out.println("--=-=-=-=-=-=-=");
		computerCollege.print();
		System.out.println("--=-=-=-=-=-=-=");
		engineerCollege.print();
	}
}
