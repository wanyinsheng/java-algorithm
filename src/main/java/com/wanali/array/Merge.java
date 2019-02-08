package com.wanali.array;

import java.util.Arrays;

/**
 * 合并两个有序数组
 * 给定两个有序整数数组 nums1 和 nums2，将 nums2 合并到 nums1 中，使得 num1 成为一个有序数组。
 * 
 * 输入: nums1 =[1,2,3,0,0,0], m = 3 nums2 = [2,5,6], n = 3
 * 
 * 输出: [1,2,2,3,5,6]
 * 
 * @author wan_ys
 *
 *         2019年2月8日上午11:04:19
 */
public class Merge {
	public static void main(String[] args) {
		
	}

	/**
	 * 只需要将nums2赋值给nums1的后n项，然后在排序
	 * 
	 * @param nums1
	 * @param m
	 * @param nums2
	 * @param n
	 */
	static void merge_A(int[] nums1, int m, int[] nums2, int n) {
		for (int i = 0; i < nums2.length; i++) {
			nums1[m + i] = nums2[i];
		}
		Arrays.sort(nums1);
	}

}
