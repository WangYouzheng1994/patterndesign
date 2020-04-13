package com.wyz.patterndesign;

import org.apache.commons.lang3.StringUtils;

import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @Author: WangYouzheng
 * @Date: 2020/3/26 16:59
 * @Description:
 */
public class Test {
	private static final String STR_BRACKET_L = "(";
	private static final String STR_BRACKET_R = ")";
	private static final String STR_NOT = "NOT";
	private static final String STR_AFTER = "AFTER";
	private static final String STR_NEAR = "NEAR";
	private static final String STR_AND = "AND";
	private static final String STR_OR = "OR";
	private static final String STR_PRESUF = ".*";

	private static Pattern Of(String patternStr) {
		Pattern pattern = Pattern.compile(patternStr);
		return pattern;
	}



	/**
	 * 1、语法执行顺序为：$>()>NOT>AFTER&NEAR>AND&OR；
	 * <p>
	 * 2、$表示对文本长度为全文（仅坐席通话内容）执行该语法规则，默认文本长度为一段；
	 * <p>
	 * 3、（）整体记为一个对象；
	 * <p>
	 * 4、（）存在多层时，从内层括号往外执行；
	 * <p>
	 * 5、NOT表示不包含某对象，左侧无内容，右侧为对象；
	 * <p>
	 * 6、A AFTER B表示对象A在对象B后，当一句中出现AFTER时，不可以存在其他语法词；
	 * <p>
	 * 7、A NEAR B表示对象A在对象B前或后，当一句中出现NEAR时，不可以存在其他语法词；
	 * <p>
	 * 8、AND与、含义相同，表示且，支持多个对象并列；
	 * <p>
	 * 9、OR与，含义相同，表示或，支持多个对象并列；
	 * <p>
	 * 10、AND与OR不支持混合并列；
	 */
	private static String Test1(String testSTR) {
		StringBuffer sb = new StringBuffer();
		sb.append(STR_PRESUF);
		sb.append("(滚蛋)+");
		sb.append(STR_PRESUF);
		Pattern of = Of(sb.toString());
		Matcher matcher = of.matcher(testSTR);
		System.out.println(matcher.matches());

		return "";
	}

	public static void main(String[] args) {

		Test1("你他妈的不要再给我打电话的了，滚蛋");
	}


	public static boolean testStringCompare(String patternStr, String str) {
		boolean result = false;

		// 六个关键字
		// 按照执行顺序 拆分。

		// 是否存在左右括号 并且 左括号数量等于右括号（成对）。并且，左括号的索引小于右括号。
		if (StringUtils.contains(patternStr, "(") && StringUtils.contains(patternStr, ")")) {
			// TODO:
		}

		return result;
	}

	private String getOr(String str) {

		if (StringUtils.contains(str, STR_OR)) {

		}
		return "|";
	}

	private String getAnd(String str) {
		return "";
	}

	/**
	 * 有括号的情况
	 *
	 * @return
	 */
	private String getconstitute() {
		return "";
	}

	/*public static void main(String[] args) {
		String str = "你他妈的不要再给我打电话了，滚蛋";
		String str2 = "他妈妈的车子坏了啊";

		*//**
		 * 1  A AND B
		 *
		 *  2  A NEAR E
		 *
		 *  3  D AFTER F AFTER Q
		 *
		 *  4  NOT (X NEAR P)
		 *
		 *  5  A AND (B AFTER (G,H,I,J))$
		 *//*
		String patternStr = "妈的 AND 滚";
		testStringCompare(patternStr, str);


		if (StringUtils.contains(patternStr, "AND")) {
			String pattern = "";
			StringBuffer sb = new StringBuffer();
			sb.append("[");
			String[] ands = patternStr.split("AND");
			for (String and : ands) {
				String trim = and.trim();

			}
			sb.append("]");
			String pa = "\\S*\\S*(他妈的)+\\S*滚+\\S*";
			Pattern compile = Pattern.compile("([妈][的])\\S*?[滚]");
			compile = Pattern.compile("(妈的)");//(?=.*滚) // |([滚][妈的])

			Matcher matcher = compile.matcher("你他妈的不要再给我打电话的了，滚蛋 ");
			*//*while (compile.matcher("你他妈的不要再给我打电话了，滚蛋").find()) {
				System.out.println(matcher.start());
				System.out.println(matcher.end());
			}
			*//*



			System.out.println(matcher.matches());
			System.out.println(compile.pattern());

			while (matcher.find()) {
				System.out.println("right-s");
				System.out.println(matcher.start());
				System.out.println(matcher.end());
				System.out.println(matcher.group());
				System.out.println("right-e");
			}

//			System.out.println(compile.matcher("你他妈的不要再给我打电话了，滚蛋").matches());
*//*
			// 贪婪模式
			Pattern com = Pattern.compile("a.*b");
			Matcher aabab = com.matcher("aabab");
			while (aabab.find()) {
				System.out.println(aabab.start());
				System.out.println(aabab.end());
				System.out.println(aabab.group());
//				System.out.println(aabab.groupCount());
			}

			// 懒惰模式
			Pattern com2 = Pattern.compile("a.*?b");
			Matcher aabab1 = com2.matcher("aabab");
			while (aabab1.find()) {
				System.out.println(aabab1.start());
				System.out.println(aabab1.end());
				System.out.println(aabab1.group());
				//				System.out.println(aabab.groupCount());
			}*//*


			*//*System.out.println(aabab.matches());
			System.out.println(aabab1.matches());*//*
		}
	}*/

	/**
	 * 1  A AND B
	 *
	 * @return
	 */
	public static boolean case1() {
		return false;
	}

	/**
	 * 2  A NEAR E
	 *
	 * @return
	 */
	public static boolean case2() {
		return false;
	}

	/**
	 * D AFTER F AFTER Q
	 *
	 * @return
	 */
	public static boolean case3() {
		return false;
	}
}

/**
 * 括号
 */
class Bracket {

}

class Whole {
	private List<Bracket> brackets;

	void addBracket(Bracket bracket) {
		this.brackets.add(bracket);
	}
}




