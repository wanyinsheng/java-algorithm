package com.wanali.math;

import java.util.Arrays;

/**
 * 求众数
 * 给定一个大小为 n 的数组，找到其中的众数。众数是指在数组中出现次数大于 ⌊ n/2 ⌋ 的元素。
 * 
 * 你可以假设数组是非空的，并且给定的数组总是存在众数。
 * 
 * 输入: [3,2,3] 输出: 3 
 * 
 * 输入: [2,2,1,1,1,2,2] 输出: 2
 * 
 * @author wan_ys
 *
 *         2019年2月1日下午10:46:43
 */
public class MajorityElement {
	public static void main(String[] args) {
		System.out.println(majorityElement(new int[] { 3, 2, 3 }));
		System.out.println(majorityElement(new int[] { 2, 2, 1, 1, 1, 2, 2 }));
	}

	static int majorityElement(int[] nums) {
		//不论数组长度是偶数还是奇数，既然众数的数量大于一半，所以排序之后最中间的数肯定是众数
		Arrays.sort(nums);
		return nums[nums.length / 2];
	}

}
