package com.wanali.string;

import java.util.Arrays;

/**
 * 找不同 
 * 给定两个字符串 s 和 t，它们只包含小写字母。
 * 字符串 t 由字符串 s 随机重排，然后在随机位置添加一个字母。
 * 请找出在 t 中被添加的字母。 
 * 
 * 输入： s = "abcd" t = "abcde"
 * 
 * 输出： e
 * 
 * @author wan_ys
 *
 * 2019年1月26日下午12:36:05
 */
public class FindTheDifference {
	public static void main(String[] args) {
		String s = "abcd";
		String t = "abcde";
		System.out.println(findTheDifference_A(s, t));
		System.out.println(findTheDifference_B(s, t));
	}

	/**
	 * 现将两个字符串转化为字符数组并排序，排序之后比较两个数组对应位置的元素来找不同
	 * 
	 * @param s
	 * @param t
	 * @return
	 */
	static char findTheDifference_A(String s, String t) {
		// 将字符串转换为字符数组并排序
		char[] cs = s.toCharArray();
		char[] ct = t.toCharArray();
		Arrays.sort(cs);
		Arrays.sort(ct);
		for (int i = 0; i < cs.length; i++) {
			if (cs[i] != ct[i]) {
				return ct[i];
			}
		}
		// 因为ct的长度比cs的长度大1，如果比较了cs.length次比较之后没有找到，就说明ct新增的元素是最后一个
		return ct[ct.length - 1];
	}

	/**
	 * 异或算法
	 * 
	 * @param s
	 * @param t
	 * @return
	 */
	static char findTheDifference_B(String s, String t) {
		char c = 0;
		for (int i = 0; i < s.length(); ++i) {
			c ^= s.charAt(i);
		}
		for (int i = 0; i < t.length(); ++i) {
			c ^= t.charAt(i);
		}
		return c;
	}

}
