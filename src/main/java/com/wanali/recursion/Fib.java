package com.wanali.recursion;

/**
 * 面试题10- I. 斐波那契数列
 * 
 * 写一个函数，输入 n ，求斐波那契（Fibonacci）数列的第 n 项。斐波那契数列的定义如下：
 * 
 * F(0) = 0,   F(1) = 1 F(N) = F(N - 1) + F(N - 2), 其中 N > 1. 斐波那契数列由 0 和 1
 * 开始，之后的斐波那契数就是由之前的两数相加而得出。
 * 
 * 答案需要取模 1e9+7（1000000007），如计算初始结果为：1000000008，请返回 1。
 * 
 * 示例 1：
 * 
 * 输入：n = 2 输出：1
 * 
 * 示例 2：
 * 
 * 输入：n = 5 输出：5
 * 
 * 
 * @author wanyinsheng
 *
 * @date 2020年2月13日下午1:15:21
 *
 */
public class Fib {
	int[] num = new int[100];

	public static void main(String[] args) {
		Fib fib = new Fib();
		System.out.println(fib.fib(2));
		System.out.println(fib.fib(48));
		System.out.println(Integer.MAX_VALUE);
	}

	public int fib(int n) {
		if (n <= 1) {
			return n == 0 ? 0 : 1;
		}
		int f0 = 0;
		int f1 = 1;
		for (int i = 2; i <= n; i++) {
			f1 = f0 + f1;
			f0 = f1 - f0;
			f1 %= 1000000007;
		}
		return f1;
	}

}
