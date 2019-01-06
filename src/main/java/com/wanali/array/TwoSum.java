package com.wanali.array;

import java.util.Arrays;

/**
 * 给定一个整数数组 nums 和一个目标值 target，请你在该数组中找出和为目标值的那 两个 整数，并返回他们的数组下标。
 * 
 * 你可以假设每种输入只会对应一个答案。但是，你不能重复利用这个数组中同样的元素。
 * 
 * 给定 nums = [2, 7, 11, 15], target = 9
 * 
 * 因为 nums[0] + nums[1] = 2 + 7 = 9 所以返回 [0, 1]
 * 
 * @author wan_ys
 *
 * 2019年1月6日下午3:12:26
 */
public class TwoSum {
	public static void main(String[] args) {
		int[] nums = new int[] { 2, 7, 11, 15 };
		int target = 9;
		System.out.println(Arrays.toString(twoSum(nums, target)));
	}

	/**
	 * 
	 * @param nums
	 * @param target
	 * @return
	 */
	static int[] twoSum(int[] nums, int target) {
		int len = nums.length;
		int[] sub = new int[2];
		for (int i = 0; i < len - 1; i++) {
			for (int j = i + 1; j < len; j++) {
				if (nums[i] + nums[j] == target) {
					sub[0] = i;
					sub[1] = j;
				}
			}
		}
		return sub;

	}

}
