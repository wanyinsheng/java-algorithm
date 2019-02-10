package com.wanali.array;

import java.util.Arrays;

/**
 * 三个数的最大乘积
 * 
 * 给定一个整型数组，在数组中找出由三个数组成的最大乘积，并输出这个乘积。
 * 
 * 输入: [1,2,3] 输出: 6 
 * 
 * 输入: [1,2,3,4] 输出: 24
 * 
 * @author wan_ys
 *
 *         2019年2月10日下午9:49:56
 */
public class MaximumProduct {
	public static void main(String[] args) {
		System.out.println(maximumProduct(new int[] { 1, 2, 3 }));
		System.out.println(maximumProduct(new int[] { 1, 2, 3, 4 }));
	}

	/**
	 * 对数组进行排序后，判断第二个数是正数还是负数，如果是正数，最大值应该是三个正数的乘积， 否则，就是前两个负数和最大的正数的乘积或者三个较大正数的乘积
	 * 
	 * @param nums
	 * @return
	 */
	static int maximumProduct(int[] nums) {
		int len = nums.length;
		Arrays.sort(nums);
		if (nums[1] > 0) {
			return nums[len - 1] * nums[len - 2] * nums[len - 3];
		} else {
			return Math.max(nums[0] * nums[1] * nums[len - 1], nums[len - 1] * nums[len - 2] * nums[len - 3]);
		}

	}

}
