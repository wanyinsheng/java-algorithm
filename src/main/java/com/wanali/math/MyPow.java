package com.wanali.math;

/**
 * Pow(x,n)
 * 
 * 实现 pow(x, n) ，即计算 x 的 n 次幂函数。
 * 
 * 输入: 2.00000, 10 输出: 1024.00000 
 * 
 * 输入: 2.10000, 3 输出: 9.26100 
 * 
 * 输入: 2.00000, -2 输出: 0.25000 解释: 2-2 = 1/22 = 1/4 = 0.25
 * 
 * @author wan_ys
 *
 *         2019年2月24日下午9:50:46
 */
public class MyPow {
	public static void main(String[] args) {
		System.out.println(myPow(2.0000, 10));
		System.out.println(myPow(2.10000, 3));
		System.out.println(myPow(2.0000, -2));

	}

	static double myPow(double x, int n) {

		// 判断n是正还是负
		if (n > 0) {
			return power(x, n);
		} else {
			return 1 / power(x, -n);
		}

	}

	/**
	 * n为偶数时，power(x,n)=power(x,n/2)*power(x,n/2);
	 * n为奇数时，power(x,n)=power(x,n/2)*power(x,n/2)*x;
	 * @param x
	 * @param n
	 * @return
	 */
	static double power(double x, int n) {
		if (n == 0) {
			return 1;
		}
		double pow = power(x, n / 2);
		if (n % 2 == 0) {
			return pow * pow;
		} else {// 奇数次方
			return x * pow * pow;
		}
	}

}
