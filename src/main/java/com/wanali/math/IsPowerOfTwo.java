package com.wanali.math;

/**
 * 2的幂 
 * 给定一个整数，编写一个函数来判断它是否是 2 的幂次方。 
 * 输入: 1 输出: true 
 * 输入: 16 输出: true 
 * 输入: 218 输出: false
 * 
 * @author wan_ys
 *
 *         2019年1月28日下午11:23:37
 */
public class IsPowerOfTwo {
	public static void main(String[] args) {
		int n = 1;
		System.out.println(isPowerOfTwo(n));
		int n1 = 16;
		System.out.println(isPowerOfTwo(n1));
		int n2 = 218;
		System.out.println(isPowerOfTwo(n2));
	}

	static boolean isPowerOfTwo(int n) {
		// 特殊考虑
		if (n == 1 || n == 2) {
			return true;
		}
		// 不断的除以2，如果余数为0，就接着除，看最终结果是否为2，如果是，则就是2的幂，如果不能被2整除就就直接返回false
		while (n > 1) {
			if (n % 2 == 0) {
				n = n / 2;
				if (n == 2) {
					return true;
				}
			} else {
				return false;
			}

		}
		return false;
	}

}
