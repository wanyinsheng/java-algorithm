package com.wanali.array;

import java.util.Arrays;
/**
 * 只出现一次的数字3
 * 给定一个整数数组 nums，其中恰好有两个元素只出现一次，其余所有元素均出现两次。 找出只出现一次的那两个元素。
 * 输入: [1,2,1,3,2,5] 输出: [3,5]
 * @author wan_ys
 *
 * 2019年1月26日下午7:59:33
 */
public class SingleNumber3 {
	public static void main(String[] args) {
		int[] nums = new int[] { 1,2,1,3,2,5};
		System.out.println(Arrays.toString(singleNumber(nums)));
	}
	static int[] singleNumber(int[] nums) {
		int sum = 0; // 记录所有异或的值，即两个只出现一次数的异或
		for (int i = 0; i < nums.length; i++) {
			sum ^= nums[i];
		}
		int[] result = new int[2];
		sum &= -sum; // 得出两个数异或结果的最右边的一个1，其他的为零，这样进行&操作就可以将两个不同的数分到不同的两组去
		for (int i = 0; i < nums.length; i++) {
			if ((sum & nums[i]) == 0)
				result[0] ^= nums[i];
			else
				result[1] ^= nums[i];
		}
		return result;

	}

}
