package com.wanali.array;

import java.util.Arrays;

/**
 * 数组拆分1
 * 
 * 给定长度为 2n 的数组, 你的任务是将这些数分成 n 对, 例如 (a1, b1), (a2, b2), ..., (an, bn) ，使得从1 到 n
 * 的 min(ai, bi) 总和最大。
 * 
 * 输入: [1,4,3,2]
 * 
 * 输出: 4 解释: n 等于 2, 最大总和为 4 = min(1, 2) + min(3, 4).
 * 
 * @author wan_ys
 *
 *         2019年2月9日下午10:44:21
 */
public class ArrayPairSum {
	public static void main(String[] args) {
		System.out.println(arrayPairSum(new int[] { 1, 4, 3, 2 }));
	}

	static int arrayPairSum(int[] nums) {
		Arrays.sort(nums);
		int result = 0;
		for (int i = 0; i < nums.length; i = i + 2) {
			result += nums[i];
		}
		return result;
	}

}
