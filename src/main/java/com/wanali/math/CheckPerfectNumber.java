package com.wanali.math;

/**
 * 完美数
 * 
 * 对于一个 正整数，如果它和除了它自身以外的所有正因子之和相等，我们称它为“完美数”。
 * 
 * 给定一个 正整数 n， 如果他是完美数，返回 True，否则返回 False
 * 
 * 输入: 28 输出: True 解释: 28 = 1 + 2 + 4 + 7 + 14
 * 
 * @author wan_ys
 *
 *         2019年2月13日下午12:44:26
 */
public class CheckPerfectNumber {
	public static void main(String[] args) {
		System.out.println(checkPerfectNumber(28));
	}

	static boolean checkPerfectNumber(int num) {
		if (num == 1) {// 1不是完美数
			return false;
		}
		int sum = 1;

		for (int i = 2; i <= Math.sqrt(num); i++) {
			if (num % i == 0) {
				sum += i;
				if (i != num / i) {
					sum += num / i;
				}
			}
		}
		return num == sum;
	}

}
