package com.wanali.string;

/**
 * 给定一个字符串，你需要反转字符串中每个单词的字符顺序，同时仍保留空格和单词的初始顺序。 
 * 输入: "Let's take LeetCode contest"
 * 输出: "s'teL ekat edoCteeL tsetnoc"
 * 
 * @author wan_ys
 *
 * 2019年1月7日下午2:26:33
 */
public class ReverseWords3 {
	public static void main(String[] args) {
		String string = "Let's take LeetCode contest";
		System.out.println(reverseWords(string));
	}

	static String reverseWords(String s) {
		String[] strings = s.split(" ");
		// 利用for循环对每一个字符串元素进行反转
		for (int i = 0; i < strings.length; i++) {
			StringBuffer stringBuffer = new StringBuffer();
			stringBuffer.append(strings[i]);
			stringBuffer = stringBuffer.reverse();

			strings[i] = stringBuffer.toString();
		}
		// 将各个已经反转的子字符串拼接为一个字符串
		StringBuffer stringBuffer = new StringBuffer();
		for (int i = 0; i < strings.length; i++) {
			// 前n-1个的子串后面都加空格
			if (i < strings.length - 1) {
				stringBuffer.append(strings[i] + " ");
			} else if (i == strings.length - 1) {
				stringBuffer.append(strings[i]);
			}
		}
		String string = stringBuffer.toString();
		return string;
	}

}
