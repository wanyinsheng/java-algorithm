package com.wanali.math;

/**
 * 丑数
 * 编写一个程序判断给定的数是否为丑数。
 * 丑数就是只包含质因数 2, 3, 5 的正整数。
 * 
 * 输入: 6 输出: true 解释: 6 = 2 × 3 
 * 
 * 输入: 8 输出: true 解释: 8 = 2 × 2 × 2 
 * 
 * 输入: 14 输出: false
 * 
 * @author wan_ys
 *
 *         2019年1月31日上午9:36:27
 */
public class IsUgly {
	public static void main(String[] args) {
		System.out.println(isUgly(6));
		System.out.println(isUgly(8));
		System.out.println(isUgly(14));
	}

	static boolean isUgly(int num) {
		if (num < 1) {
			return false;
		}
		if (num == 1) {
			return true;
		}
		while (num % 5 == 0) {
			num /= 5;
		}
		while (num % 3 == 0) {
			num /= 3;
		}
		while (num % 2 == 0) {
			num /= 2;
		}
		return num == 1;// 如果为1，则是丑数

	}

}
