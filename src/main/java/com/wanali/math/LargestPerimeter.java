package com.wanali.math;

import java.util.Arrays;

/**
 * 三角形的最大周长 
 * 给定由一些正数（代表长度）组成的数组 A，返回由其中三个长度组成的、面积不为零的三角形的最大周长。
 * 
 * 如果不能形成任何面积不为零的三角形，返回 0。 
 * 输入：[2,1,2] 输出：5 
 * 输入：[1,2,1] 输出：0 
 * 输入：[3,2,3,4] 输出：10
 * 输入：[3,6,2,3] 输出：8
 * 
 * @author wan_ys
 *
 *         2019年1月29日下午7:48:11
 */
public class LargestPerimeter {
	public static void main(String[] args) {
		System.out.println(largestPerimeter(new int[] { 2, 1, 2 }));
		System.out.println(largestPerimeter(new int[] { 1, 2, 1 }));
		System.out.println(largestPerimeter(new int[] { 3, 2, 3, 4 }));
		System.out.println(largestPerimeter(new int[] { 3, 6, 2, 3 }));
	}
	/**
	 * 假设a<=b<=c ,能够成三角形的条件为c<a+b,将数组排序，排序之后从大的一端开始遍历
	 * @param A
	 * @return
	 */
	static int largestPerimeter(int[] A) {
		Arrays.sort(A);
		for (int i = A.length - 1; i >= 2; i--) {
			if (A[i] < A[i - 1] + A[i - 2]) {// 一个较长的边小于两个较小的边的和
				return A[i] + A[i - 1] + A[i - 2];
			}
		}
		return 0;
	}

}
