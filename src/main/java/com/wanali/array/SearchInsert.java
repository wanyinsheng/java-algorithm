package com.wanali.array;

/**
 * 搜索插入位置
 * 
 * 给定一个排序数组和一个目标值，在数组中找到目标值，并返回其索引。如果目标值不存在于数组中，返回它将会被按顺序插入的位置。
 * 
 * 你可以假设数组中无重复元素。
 * 
 * 输入: [1,3,5,6], 5 输出: 2 
 * 
 * 输入: [1,3,5,6], 2 输出: 1 
 * 
 * 输入: [1,3,5,6], 7 输出: 4 
 * 
 * 输入: [1,3,5,6], 0 输出: 0
 * 
 * @author wan_ys
 *
 *         2019年2月9日下午5:29:21
 */
public class SearchInsert {
	public static void main(String[] args) {
		System.out.println(searchInsert(new int[] { 1, 3, 5, 6 }, 5));
		System.out.println(searchInsert(new int[] { 1, 3, 5, 6 }, 2));
		System.out.println(searchInsert(new int[] { 1, 3, 5, 6 }, 7));
		System.out.println(searchInsert(new int[] { 1, 3, 5, 6 }, 0));
	}

	/**
	 * 二分法
	 * 
	 * @param nums
	 * @param target
	 * @return
	 */
	static int searchInsert(int[] nums, int target) {
		int mid;
		int left = 0;
		int right = nums.length - 1;
		while (left <= right) {
			mid = (left + right) / 2;
			if (nums[mid] == target) {
				return mid;
			} else if (nums[mid] < target) {
				left = mid + 1;
			} else {
				right = mid - 1;
			}
		}
		return left;
	}

}
