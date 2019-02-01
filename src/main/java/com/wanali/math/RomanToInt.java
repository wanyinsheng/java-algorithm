package com.wanali.math;

/**
 * 罗马数字转整数
 * 罗马数字包含以下七种字符: I， V， X， L，C，D 和 M 给定一个罗马数字，将其转换成整数。输入确保在 1 到 3999 的范围内。
 * 
 * 输入:"III" 输出: 3 
 * 
 * 输入: "IV" 输出: 4 
 * 
 * 输入: "IX" 输出: 9 
 * 
 * 输入: "LVIII" 输出: 58 解释: L = 50, V= 5, III = 3
 * 
 * 输入: "MCMXCIV" 输出: 1994 解释: M = 1000, CM = 900, XC = 90, IV = 4.
 * 
 * @author wan_ys
 *
 *         2019年2月1日下午9:37:28
 */
public class RomanToInt {
	public static void main(String[] args) {
		System.out.println(romanToInt("III"));
		System.out.println(romanToInt("IV"));
		System.out.println(romanToInt("IX"));
		System.out.println(romanToInt("LVIII"));
		System.out.println(romanToInt("MCMXCIV"));
	}

	/**
	 * 从后往前看时，如果后面的数字比前面的数字大，就相减，否则就相加
	 * 
	 * @param s
	 * @return
	 */
	static int romanToInt(String s) {
		int result = 0;
		int pre = 0;// 从后往前看，记录了后面的数字
		for (int i = s.length() - 1; i >= 0; i--) {
			switch (s.charAt(i)) {
			case 'I':
				if (pre > 1) {
					result -= 1;
				} else {
					result += 1;
				}
				pre = 1;
				break;
			case 'V':
				if (pre > 5) {
					result -= 5;
				} else {
					result += 5;
				}
				pre = 5;
				break;
			case 'X':
				if (pre > 10) {
					result -= 10;
				} else {
					result += 10;
				}
				pre = 10;
				break;

			case 'L':
				if (pre > 50) {
					result -= 50;
				} else {
					result += 50;
				}
				pre = 50;
				break;
			case 'C':
				if (pre > 100) {
					result -= 100;
				} else {
					result += 100;
				}
				pre = 100;
				break;
			case 'D':
				if (pre > 500) {
					result -= 500;
				} else {
					result += 500;
				}
				pre = 500;
				break;
			case 'M':
				if (pre > 1000) {
					result -= 1000;
				} else {
					result += 1000;
				}
				pre = 1000;
				break;

			}

		}
		return result;
	}
}
