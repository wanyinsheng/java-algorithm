package com.wanali.math;

/**
 * 各位相加 
 * 给定一个非负整数 num，反复将各个位上的数字相加，直到结果为一位数。 
 * 输入: 38 输出: 2 (各位相加的过程为：3 + 8 = 11, 1+ 1 = 2。 由于 2 是一位数，所以返回 2。)
 * @author wan_ys
 * 2019年1月24日下午8:44:41
 */
public class AddDigits {
	public static void main(String[] args) {
		System.out.println(addDigits(38));
	}

	static int addDigits(int num) {
		int sum = 0;
		while (num > 0) {
			int i = num % 10;
			sum += i;
			num = num / 10;
		}
		// 如果sum是两位数，则继续求各位数之和
		if (sum >= 10) {
			num = sum;
			return addDigits(num);

		}
		return sum;

	}
}
