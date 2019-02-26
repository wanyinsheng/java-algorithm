package com.wanali.string;

/**
 * 验证回文串
 * 
 * 给定一个字符串，验证它是否是回文串，只考虑字母和数字字符，可以忽略字母的大小写。
 * 
 * 说明：本题中，我们将空字符串定义为有效的回文串。
 * 
 * 输入: "A man, a plan, a canal: Panama" 输出: true 
 * 
 * 输入: "race a car" 输出: false
 * 
 * @author wan_ys
 *
 *         2019年2月26日下午10:27:42
 */
public class IsPalindrome {
	public static void main(String[] args) {
		System.out.println(isPalindrome("A man, a plan, a canal: Panama"));
		System.out.println(isPalindrome("race a car"));
	}

	static boolean isPalindrome(String s) {
		s = s.toLowerCase();// 将所有的字母转换为小写
		char[] cs = s.toCharArray();
		int index = 0;
		for (int i = 0; i < cs.length; i++) {
			if (cs[i] >= 'a' && cs[i] <= 'z' || cs[i] >= '0' && cs[i] <= '9') {
				cs[index] = cs[i];// index的值即所有字母和数字的个数
				index++;
			}
		}
		if (index <= 1) {// 小于1的都是回文串
			return true;
		}
		if (index % 2 == 0) {// 有偶数个字母和数字
			for (int i = 0; i < index / 2; i++) {
				if (cs[i] != cs[index - 1 - i]) {
					return false;
				}
			}
		} else {// 有奇数个字母和数字
			for (int i = 0; i < (index - 1) / 2; i++) {
				if (cs[i] != cs[index - 1 - i]) {
					return false;
				}
			}
		}
		return true;
	}

}
