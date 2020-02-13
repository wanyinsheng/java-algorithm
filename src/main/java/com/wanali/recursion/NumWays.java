package com.wanali.recursion;

/**
 * 面试题10- II. 青蛙跳台阶问题
 * 
 * 一只青蛙一次可以跳上1级台阶，也可以跳上2级台阶。求该青蛙跳上一个 n 级的台阶总共有多少种跳法。
 * 
 * 答案需要取模 1e9+7（1000000007），如计算初始结果为：1000000008，请返回 1。
 * 
 * 示例 1：
 * 
 * 输入：n = 2 输出：2
 * 
 * 示例 2：
 * 
 * 输入：n = 7 输出：21
 * 
 * @author wanyinsheng
 *
 * @date 2020年2月13日下午1:33:03
 *
 */
public class NumWays {
	public static void main(String[] args) {
		System.out.println(numWays(2));
		System.out.println(numWays(7));
	}

	static int numWays(int n) {
		if (n <= 2)
			return n < 2 ? 1 : 2;
		int f1 = 1;
		int f2 = 2;
		for (int i = 3; i <= n; i++) {
			f2 = f2 + f1;
			f1 = f2 - f1;
			f2 = (int) (f2 % (1e9 + 7));
		}
		return f2;

	}
}
