package com.wanali.math;
/**
 * 给定一个整数，写一个函数来判断它是否是 3 的幂次方
 * @author wan_ys
 *
 * 2019年1月5日下午10:05:52
 */
public class IsPowerOfThree {
	public static void main(String[] args) {
		System.out.println(isPowerOfThree(7));
		System.out.println(isPowerOfThree(3));
		System.out.println(isPowerOfThree(27));
	}
	
	static boolean isPowerOfThree(int n) {
		boolean flag=false;
		long i=1;
		while(i<=n) {
			if(i==n) {
				flag=true;
			}
			i=i*3;
		}
		return flag;

	}
}