package com.wanali.math;

/**
 * 回文数
 * 
 * 判断一个整数是否是回文数。回文数是指正序（从左向右）和倒序（从右向左）读都是一样的整数。
 * 
 * 输入: 121 输出: true
 * 
 * 输入: -121 输出: false 
 * 
 * 输入: 10 输出: false 
 * 
 * @author wan_ys
 *
 *         2019年1月29日下午10:39:12
 */
public class IsPalindrome {
	public static void main(String[] args) {
		System.out.println(isPalindrome(121));
		System.out.println(isPalindrome(-121));
		System.out.println(isPalindrome(10));
	}

	static boolean isPalindrome(int x) {
		if (x < 0) {
			return false;
		}
		String s = String.valueOf(x); // 将数字转为为字符串
		for (int i = 0; i < s.length() / 2; i++) {
			if (s.charAt(i) != s.charAt(s.length() - i - 1))
				return false;
		}
		return true;

	}

}
