package com.wanali.math;

/**
 * 4的幂
 * 给定一个整数 (32 位有符号整数)，请编写一个函数来判断它是否是 4 的幂次方。 
 * 输入: 16 输出: true 
 * 输入: 5 输出: false
 * 
 * @author wan_ys
 *
 *         2019年1月28日下午11:34:53
 */
public class IsPowerOfFour {
	public static void main(String[] args) {
		int n = 16;
		System.out.println(isPowerOfFour(n));
		int n1 = 5;
		System.out.println(isPowerOfFour(n1));

	}
	
	static boolean isPowerOfFour(int num) {
		if (num == 1 || num == 4) {
			return true;
		}
		//如果该数大于4，首先判断是否可以被4整除，如果不能被整除，直接返回false，如果这可以整除，就就绪除以4，看最终结果是否为4
		while (num > 4) {
			if (num % 4 == 0) {
				num = num / 4;
				if (num == 4) {
					return true;
				}
			} else {
				return false;
			}
		}
		return false;
	}

}
