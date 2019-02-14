package com.wanali.hash_table;

import java.util.Arrays;

/**
 * 重复N次的元素
 * 
 * 在大小为 2N 的数组 A 中有 N+1 个不同的元素，其中有一个元素重复了 N 次。
 * 
 * 返回重复了 N 次的那个元素。
 * 
 * 输入：[1,2,3,3] 输出：3
 * 
 * 输入：[2,1,2,5,3,2] 输出：2
 * 
 * 输入：[5,1,5,2,5,3,5,4] 输出：5
 * 
 * @author wan_ys
 *
 *         2019年2月14日上午10:10:33
 */
public class RepeatedNTimes {
	public static void main(String[] args) {
		System.out.println(repeatedNTimes(new int[] { 1, 2, 3, 3 }));
		System.out.println(repeatedNTimes(new int[] { 2, 1, 2, 5, 3, 2 }));
		System.out.println(repeatedNTimes(new int[] { 5, 1, 5, 2, 5, 3, 5, 4 }));
	}

	static int repeatedNTimes(int[] A) {
		Arrays.sort(A);
		//一半往前判断两个元素是否相等，相等就在前半部分
		if (A[A.length / 2 - 1] == A[A.length / 2 - 2]) {
			return A[A.length / 2 - 1];
		} else {
			return A[A.length / 2];
		}
	}

}
