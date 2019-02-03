package com.wanali.string;

/**
 * 最长公共前缀
 * 
 * 编写一个函数来查找字符串数组中的最长公共前缀。
 * 如果不存在公共前缀，返回空字符串 ""。
 * 
 * 输入: ["flower","flow","flight"] 输出: "fl" 
 * 
 * 输入: ["dog","racecar","car"] 输出: "" 解释: 输入不存在公共前缀。
 * 
 * @author wan_ys
 *
 *         2019年2月3日下午9:35:23
 */
public class LongestCommonPrefix {
	public static void main(String[] args) {
		System.out.println(longestCommonPrefix(new String[] { "flower", "flow", "flight" }));
		System.out.println(longestCommonPrefix(new String[] { "dog", "racecar", "car" }));
	}

	static String longestCommonPrefix(String[] strs) {
		String string = "";
		if (strs.length == 0) {
			return string;

		}
		if (strs.length == 1) {
			return strs[0];
		}
		// 定义最短元素大小
		int minLen = strs[0].length();
		// 求最短元素大小
		for (int i = 1; i < strs.length; i++) {
			if (minLen > strs[i].length()) {
				minLen = strs[i].length();
			}
		}
		boolean flag;
		// 最多比较次数
		for (int i = 0; i < minLen; i++) {
			flag = true;
			for (int j = 1; j < strs.length; j++) {
				if (strs[0].charAt(i) != strs[j].charAt(i)) {// 判断第一个元素和第j个元素的第i个字母是否相同
					flag = false;
					break;
				}
			}

			if (!flag) {
				break;
			}
			string += strs[0].charAt(i);
		}
		return string;
	}

}
