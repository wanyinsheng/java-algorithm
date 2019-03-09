package com.wanali.math;

/**
 * 有效的完全平方数
 * 
 * 给定一个正整数 num，编写一个函数，如果 num 是一个完全平方数，则返回 True，否则返回 False。
 * 
 * 说明：不要使用任何内置的库函数，如 sqrt。
 * 
 * 输入：16 输出：True
 * 
 * 输入：14 输出：False
 * 
 * @author wan_ys
 *
 *         2019年3月9日下午11:09:45
 */
public class IsPerfectSquare {
	public static void main(String[] args) {
		System.out.println(isPerfectSquare(16));
		System.out.println(isPerfectSquare(14));
	}

	static boolean isPerfectSquare(int num) {
		int i = 1;
		while (i <= num / 2 + 1) {
			if (i * i == num) {
				return true;
			} else {
				i++;
			}
		}
		return false;
	}

}
