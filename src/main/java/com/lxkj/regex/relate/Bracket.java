package com.lxkj.regex.relate;

/**
 * @Author: WangYouzheng
 * @Date: 2020/3/31 15:14
 * @Description: 括号实体，要先解析孩子
 */
public class Bracket {
	private String sourceStr;

	private Bracket parent;

	private Bracket child;
}
