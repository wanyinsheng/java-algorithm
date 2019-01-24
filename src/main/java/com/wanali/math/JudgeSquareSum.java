package com.wanali.math;

/**
 * 平方数之和
 * 给定一个非负整数 c ，你要判断是否存在两个整数 a 和 b，使得 a^2 + b^2 = c
 * @author wan_ys
 * 2019年1月24日下午7:54:18
 */
public class JudgeSquareSum {
	public static void main(String[] args) {
		System.out.println(judgeSquareSum(5));
		System.out.println(judgeSquareSum(3));
	}

	static boolean judgeSquareSum(int c) {
		boolean flag = false;
		for (int i = 0; i <= Math.sqrt(c); i++) {
			for (int j = i; j<Math.sqrt(c); j++) {
				if (i * i + j * j == c) {
					flag = true;
					break;
				}
			}
		}
		return flag;
	}

}
