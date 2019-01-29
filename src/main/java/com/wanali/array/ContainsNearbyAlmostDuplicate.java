package com.wanali.array;

/**
 * 存在重复元素3 
 * 
 * 给定一个整数数组，判断数组中是否有两个不同的索引 i 和 j，使得 nums [i] 和 nums [j] 的差的绝对值最大为 t，并且
 * i 和 j 之间的差的绝对值最大为 ķ。 
 * 
 * 输入: nums = [1,2,3,1], k = 3, t = 0 输出: true
 * 
 * 输入: nums = [1,0,1,1], k = 1, t = 2 输出: true 
 * 
 * 输入: nums = [1,5,9,1,5,9], k = 2, t = 3 输出: false
 * 
 * @author wan_ys
 *
 *         2019年1月29日上午8:55:52
 */
public class ContainsNearbyAlmostDuplicate {
	public static void main(String[] args) {
		int[] nums = new int[] { 1, 2, 3, 1 };
		int k = 3;
		int t = 0;
		System.out.println(containsNearbyAlmostDuplicate(nums, k, t));
		int[] nums1 = new int[] {1,0,1,1 };
		int k1 = 1;
		int t1 = 2;
		System.out.println(containsNearbyAlmostDuplicate(nums1, k1, t1));
		int[] nums2 = new int[] { 1, 5, 9, 1, 5, 9 };
		int k2 = 2;
		int t2 = 3;
		System.out.println(containsNearbyAlmostDuplicate(nums2, k2, t2));
	}

	static boolean containsNearbyAlmostDuplicate(int[] nums, int k, int t) {
		for (int i = 0; i < nums.length; i++) {
			for (int j = i + 1; j < nums.length; j++) {
				if (Math.abs(i - j) <= k && Math.abs((long) nums[i] - (long) nums[j]) <= (long) t) {
					return true;
				}
			}
		}
		return false;
	}

}
