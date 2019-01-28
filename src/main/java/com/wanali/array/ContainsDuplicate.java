package com.wanali.array;

import java.util.Arrays;

/**
 * 存在重复元素
 * 
 * 给定一个整数数组，判断是否存在重复元素。
 * 
 * 如果任何值在数组中出现至少两次，函数返回 true。如果数组中每个元素都不相同，则返回 false。 
 * 输入: [1,2,3,1] 输出: true 
 * 输入: [1,2,3,4] 输出: false 
 * 输入: [1,1,1,3,3,4,3,2,4,2] 输出: true
 * 
 * @author wan_ys
 *
 * 2019年1月28日下午10:28:24
 */
public class ContainsDuplicate {
	public static void main(String[] args) {
		int[] nums = new int[] { 1, 2, 3, 1 };
		System.out.println(containsDuplicate(nums));
		int[] nums1 = new int[] { 1, 2, 3, 4 };
		System.out.println(containsDuplicate(nums1));
		int[] nums2 = new int[] { 1, 1, 1, 3, 3, 4, 3, 2, 4, 2 };
		System.out.println(containsDuplicate(nums2));
	}
	/**
	 * 先对数组进行排序，比较相邻元素是否相等，如果相等，就存在重复元素
	 * @param nums
	 * @return
	 */
	static boolean containsDuplicate(int[] nums) {
		Arrays.sort(nums);
		for (int i = 0; i < nums.length - 1; i++) {
			if (nums[i] == nums[i + 1]) {
				return true;
			}
		}
		return false;
	}

}
