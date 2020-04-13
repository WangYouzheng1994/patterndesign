package com.lxkj.regex.handle;

import com.alibaba.fastjson.JSONObject;
import com.lxkj.regex.KeyConstants;
import org.apache.commons.lang3.StringUtils;

import java.util.LinkedHashMap;
import java.util.Stack;
import java.util.regex.Pattern;

/**
 * @Author: WangYouzheng
 * @Date: 2020/3/30 17:11
 * @Description: 关于括号的转换
 */
public class BracketStrategy implements ConventerStrategy {
	@Override
	public Pattern getPattern() {
		return null;
	}

	/**
	 * 处理逻辑
	 * @param sourceStr
	 */
	@Override
	public void handle(JSONObject sourceStr) {
		// 这个地方一层一层的切割。 切割成一个
/*		if (StringUtils.isNotBlank(sourceStr)) {
			// 切割成成对的
			*//*Pattern compile = Pattern.compile("\\(+.*\\)");
			Matcher matcher = compile.matcher("(A AND (Not B))");

			while (matcher.find()) {
				System.out.println(matcher.start());
				System.out.println(matcher.end());
				System.out.println(matcher.group());
			}*//*

			splitBracket(sourceStr);
		}*/
	}
/*
	public static void main(String[] args) {
		BracketStrategy bs = new BracketStrategy();
		bs.handle("(A AND (Not B))");
	}*/

	@Override
	public Boolean hasKeyWords(String sourceStr) throws IllegalArgumentException {
		boolean result = false;
		// 有括号的优先分割
		// 先判断有多少个左右括号。
		if (StringUtils.containsAny(sourceStr, KeyConstants.STR_BRACKET_L, KeyConstants.STR_BRACKET_R)) {
			// 左右括号数量对等。
			if (StringUtils.countMatches(sourceStr, KeyConstants.STR_BRACKET_L) == StringUtils.countMatches(sourceStr, KeyConstants.STR_BRACKET_R)) {

			} else {
				throw new IllegalArgumentException("括号关键字不对称！");
			}
		}

		return result;
	}

	private LinkedHashMap splitBracket(String str) {

		System.out.println(StringUtils.indexOf(str, "("));
		return null;
	}

	public static void main(String[] args) {
		Stack<Character> stack = new Stack<Character>();
			String target = "(A AND (Not B))";
			char[] bytes = target.toCharArray();
			// 将第一个字符压入栈
			stack.push(bytes[0]);
			/*
			 * 从第二个字符开始，依次与栈中的字符匹配
			 */
			for (int i = 1; i < bytes.length; ++i) {
				Character c1 = (Character) stack.peek();
				Character c2 = bytes[i];
				if ((c1.toString().equals("(") && c2.toString().equals(")")) || (c1.toString().equals("[") && c2.toString().equals("]")) || (c1.toString().equals("{") && c2.toString().equals("}"))) {
					stack.pop();
				} else {
					stack.push(c2);
				}
			}
			boolean isMatch = stack.isEmpty();
			System.out.println("栈内内容：" + stack);
			System.out.println("括号匹配结果：" + isMatch);
	}
}
