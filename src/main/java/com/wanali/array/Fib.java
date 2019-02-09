package com.wanali.array;

/**
 * 斐波那契数
 * 
 * 斐波那契数，通常用 F(n) 表示，形成的序列称为斐波那契数列。该数列由 0 和 1 开始，后面的每一项数字都是前面两项数字的和。也就是：
 * 
 * F(0) = 0, F(1) = 1 F(N) = F(N - 1) + F(N - 2), 其中 N > 1.
 * 
 * 输入：2 输出：1 
 * 输入：3 输出：2
 * 输入：4 输出：3
 * 
 * @author wan_ys
 *
 *         2019年2月9日下午10:33:14
 */
public class Fib {
	public static void main(String[] args) {
		System.out.println(fib(2));
		System.out.println(fib(3));
		System.out.println(fib(4));
	}

	static int fib(int N) {
		if (N == 0) {
			return 0;
		}
		if (N == 1) {
			return 1;
		}
		return fib(N - 1) + fib(N - 2);
	}

}
