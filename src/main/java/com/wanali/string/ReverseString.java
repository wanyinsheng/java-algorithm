package com.wanali.string;

/**
 * 将输入的字符串反转过来 
 * 输入: "hello" 
 * 输出: "olleh" 
 * 输入: "A man, a plan, a canal: Panama" 
 * 输出:
 * "amanaP :lanac a ,nalp a ,nam A"
 * 
 * @author wan_ys
 *
 * 2019年1月6日上午11:20:37
 */
public class ReverseString {
	public static void main(String[] args) {
		System.out.println(reverseString("hello"));
		System.out.println(reverseString("A man, a plan, a canal: Panama"));
		System.out.println(reverseString1("hello"));
		System.out.println(reverseString1("A man, a plan, a canal: Panama"));
	}
	/**
	 * 遍历并赋值给数组
	 * @param string
	 * @return
	 */
	static String reverseString(String string) {

		String ss = "\"" + string + "\"";
		int len = ss.length();
		String[] strings = new String[len];
		for (int i = 0; i < len; i++) {
			strings[i] = ss.substring(i, i + 1);
		}
		StringBuffer stringBuffer = new StringBuffer();
		for (int i = len - 1; i >= 0; i--) {
			stringBuffer.append(strings[i]);
		}
		String string2 = stringBuffer.toString();
		return string2;

	}
	/**
	 * 直接调用函数的方法
	 * @param string
	 * @return
	 */
	static String reverseString1(String string) {
		String ss = "\"" + string + "\"";
		StringBuffer stringBuffer = new StringBuffer();
		stringBuffer.append(ss);
		//调用StringBuffer的reverse()函数
		StringBuffer reverse = stringBuffer.reverse();
		return reverse.toString();
	}

}
