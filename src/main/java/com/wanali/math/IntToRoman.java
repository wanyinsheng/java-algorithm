package com.wanali.math;

/**
 * 整数转罗马数字
 * 
 * 罗马数字包含以下七种字 输入: 3 输出: "III" 
 * 
 * 输入: 4 输出: "IV" 
 * 
 * 输入: 9 输出: "IX" 
 * 
 * 输入: 58 输出: "LVIII" 解释: L = 50, V = 5, III = 3
 * 
 * 输入: 1994 输出: "MCMXCIV" 解释: M = 1000, CM = 900, XC = 90, IV = 4
 * 
 * @author wan_ys
 *
 *         2019年2月1日下午9:57:11
 */
public class IntToRoman {
	public static void main(String[] args) {
		System.out.println(intToRoman(3));
		System.out.println(intToRoman(4));
		System.out.println(intToRoman(9));
		System.out.println(intToRoman(58));
		System.out.println(intToRoman(1994));
	}

	static String intToRoman(int num) {
		String[][] base = new String[][] { { "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX" }, // 个位的表示
				{ "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC" }, // 十位的表示
				{ "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM" }, // 百倍的表示
				{ "M", "MM", "MMM", "", "", "", "", "", "" } }; // 千位的表示

		String result = "";

		// 每除一次就示处理后一个数位（从小到大）
		// i记录当前处理的是第几个数位
		for (int i = 0; num != 0; num /= 10, i++) {
			// 如果不为0，说明这个数位上有值，要进行相加操作
			if (num % 10 != 0) {
				// 拼接结果
				result = base[i][num % 10 - 1] + result;
			}
		}

		return result;
	}

}
