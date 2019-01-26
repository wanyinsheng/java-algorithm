package com.wanali.array;

import java.util.Arrays;

/**
 * 只出现一次的数字 
 * 给定一个非空整数数组，除了某个元素只出现一次以外，其余每个元素均出现两次。找出那个只出现了一次的元素。 
 * 输入: [2,2,1] 输出:1 
 * 输入: [4,1,2,1,2] 输出: 4
 * 
 * @author wan_ys
 *
 * 2019年1月26日下午2:42:09
 */
public class SingleNumber {
	public static void main(String[] args) {
		int[] nums = new int[] { 2, 2, 1 };
		int[] nuns1 = new int[] { 4, 1, 2, 1, 2 };
		System.out.println(singleNumber(nums));
		System.out.println(singleNumber(nuns1));
	}
	/**
	 * 因为其他数字出现两次，所以在排序之后进行比较，两个为一组进行比较，如果有一组不相等，则就说明这一组的第一个元素个数为一个
	 * 否则，最后元素的个数为一个
	 * @param nums
	 * @return
	 */
	static int singleNumber(int[] nums) {
		Arrays.sort(nums);
		for (int i = 0; i < nums.length - 2; i = i + 2) {
			if (nums[i] != nums[i + 1]) {
				return nums[i];
			}
		}
		return nums[nums.length - 1];
	}

}
