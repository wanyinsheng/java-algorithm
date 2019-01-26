package com.wanali.array;

import java.util.Arrays;

/**
 * 只出现一次的数字2
 * 给定一个非空整数数组，除了某个元素只出现一次以外，其余每个元素均出现了三次。找出那个只出现了一次的元素。
 *  输入: [2,2,3,2] 输出: 3 
 *  输入: [0,1,0,1,0,1,99] 输出: 99
 * 
 * @author wan_ys
 *
 * 2019年1月26日下午2:58:33
 */
public class SingleNumber2 {
	public static void main(String[] args) {
		int[] nums = new int[] { 2, 2, 3, 2 };
		int[] nums1 = new int[] { 0, 1, 0, 1, 0, 1, 99 };
		System.out.println(singleNumber(nums));
		System.out.println(singleNumber(nums1));
	}

	/**
	 * 排序之后再进行比较，每三个元素分为一组，只比较该组中的第一个和第三个元素，如果不同返回改组的第一个元素 否则，返回整个数组的最后一个元素
	 * 
	 * @param nums
	 * @return
	 */
	static int singleNumber(int[] nums) {
		Arrays.sort(nums);
		for (int i = 0; i < nums.length - 3; i = i + 3) {
			if (nums[i] != nums[i + 2]) {
				return nums[i];
			}
		}
		return nums[nums.length - 1];
	}

}
