package com.wanali.array;

import java.util.Arrays;

/**
 * 三角形的最大周长
 * 
 * 给定由一些正数（代表长度）组成的数组 A，返回由其中三个长度组成的、面积不为零的三角形的最大周长。
 * 
 * 如果不能形成任何面积不为零的三角形，返回 0。 示例 1：
 * 
 * 输入：[2,1,2] 输出：5 
 * 
 * 输入：[1,2,1] 输出：0 
 * 
 * 输入：[3,2,3,4] 输出：10 
 * 
 * 输入：[3,6,2,3] 输出：8
 * 
 * @author wan_ys
 *
 *         2019年2月9日下午3:49:22
 */
public class LargestPerimeter {
	public static void main(String[] args) {
		System.out.println(largestPerimeter(new int[] { 2, 1, 2 }));
		System.out.println(largestPerimeter(new int[] { 1, 2, 1 }));
		System.out.println(largestPerimeter(new int[] { 3, 2, 3, 4 }));
		System.out.println(largestPerimeter(new int[] { 3, 6, 2, 3 }));
	}

	static int largestPerimeter(int[] A) {
		//先对数组进行排序
		Arrays.sort(A);
		int len = A.length;
		if (len < 3) {
			return 0;
		}
		int i = len - 1;
		//如果元素大于三个，先从最大的元素开始，如果构不成三角形，就i--
		while (i >= 2) {
			if (A[i] < A[i - 1] + A[i - 2]) {
				return A[i] + A[i - 1] + A[i - 2];
			} else {
				i--;
			}
		}
		return 0;
	}

}
