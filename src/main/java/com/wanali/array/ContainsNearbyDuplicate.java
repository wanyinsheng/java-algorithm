package com.wanali.array;

/**
 * 存在重复元素2
 * 给定一个整数数组和一个整数 k，判断数组中是否存在两个不同的索引 i 和 j，使得 nums [i] = nums [j]，并且 i 和 j
 * 的差的绝对值最大为 k。 
 * 输入: nums = [1,2,3,1], k = 3 输出: true 
 * 输入: nums = [1,0,1,1], k = 1输出: true 
 * 输入: nums = [1,2,3,1,2,3], k = 2 输出: false
 * 
 * @author wan_ys
 *
 * 2019年1月28日下午10:59:05
 */
public class ContainsNearbyDuplicate {
	public static void main(String[] args) {
		int[] nums = new int[] { 1, 2, 3, 1 };
		int k = 3;
		System.out.println(containsNearbyDuplicate(nums, k));
		int[] nums1 = new int[] { 1, 0, 1, 1 };
		int k1 = 1;
		System.out.println(containsNearbyDuplicate(nums1, k1));
		int[] nums2 = new int[] { 1, 2, 3, 1, 2, 3 };
		int k2 = 2;
		System.out.println(containsNearbyDuplicate(nums2, k2));
	}
	static boolean containsNearbyDuplicate(int[] nums, int k) {
		for (int i = 0; i < nums.length; i++) {
			for (int j = i + 1; j < nums.length; j++) {
				//找相同的元素并判断这两个元素的下标差的绝对值是否小于k
				if (nums[i] == nums[j] && Math.abs(j - i) <= k) {
					return true;
				}
			}

		}
		return false;
	}

}
