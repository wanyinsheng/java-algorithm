package com.wanali.array;

/**
 * 给定一个包含 n + 1 个整数的数组 nums，其数字都在 1 到 n 之间（包括 1 和 n），可知至少存在一个重复的整数。
 * 假设只有一个重复的整数，找出这个重复的数。
 *  数组中只有一个重复的数字，但它可能不止重复出现一次。 
 *  输入: [1,3,4,2,2] 输出: 2 
 *  输入:[3,1,3,4,2] 输出: 3
 * 
 * @author wan_ys
 *
 *  2019年1月6日下午10:04:30
 */
public class FindDuplicate {
	public static void main(String[] args) {
		int[] nums = new int[] { 1, 3, 4, 2, 2 };
		System.out.println(findDuplicate(nums));
		int[] num = new int[] { 3, 1, 3, 4, 2 };
		System.out.println(findDuplicate(num));
	}

	static int findDuplicate(int[] nums) {
		int number = 0;
		for (int i = 0; i < nums.length - 1; i++) {
			for (int j = i + 1; j < nums.length; j++) {
				if (nums[i] == nums[j])
					number = nums[i];
			}
		}
		return number;
	}

}
