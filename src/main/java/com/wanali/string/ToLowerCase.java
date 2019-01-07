package com.wanali.string;
/**
 * 实现函数 ToLowerCase()，该函数接收一个字符串参数 str，并将该字符串中的大写字母转换成小写字母，之后返回新的字符串。
 * 输入: "Hello" 输出: "hello"
 * 输入: "here" 输出: "here"
 * @author wan_ys
 *
 * 2019年1月7日上午11:00:42
 */
public class ToLowerCase {
	public static void main(String[] args) {
		String string="Hello";
		String string2="here";
		System.out.println(toLowerCase(string));
		System.out.println(toLowerCase(string2));
	}
	static String toLowerCase(String str) {
		char[] cs=str.toCharArray();
		for (int i = 0; i < cs.length; i++) {
			if(cs[i]>='A'&&cs[i]<='Z') {
				cs[i]=(char) (cs[i]+32);
			}
		}
		StringBuffer stringBuffer=new StringBuffer();
		for (int i = 0; i < cs.length; i++) {
			stringBuffer.append(cs[i]);
		}
		String string=stringBuffer.toString();
		return string;
	}

}
