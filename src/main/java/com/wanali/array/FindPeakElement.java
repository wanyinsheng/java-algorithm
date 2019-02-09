package com.wanali.array;

/**
 * 寻找峰值
 * 
 * 峰值元素是指其值大于左右相邻值的元素。
 * 
 * 给定一个输入数组 nums，其中 nums[i] ≠ nums[i+1]，找到峰值元素并返回其索引。
 * 
 * 数组可能包含多个峰值，在这种情况下，返回任何一个峰值所在位置即可。
 * 
 * 你可以假设 nums[-1] = nums[n] = -∞。
 * 
 * 输入: nums = [1,2,3,1] 输出: 2 解释: 
 * 
 * 输入: nums = [1,2,1,3,5,6,4] 输出: 1 或 5 
 * 
 * @author wan_ys
 *
 *         2019年2月9日下午4:21:26
 */
public class FindPeakElement {
	public static void main(String[] args) {
		System.out.println(findPeakElement(new int[] { 1, 2, 3, 1 }));
		System.out.println(findPeakElement(new int[] { 1, 2, 1, 3, 5, 6, 4 }));
	}

	static int findPeakElement(int[] nums) {
		int len = nums.length;
		if (len == 1) {
			return 0;
		}
		// 当只有两个元素，返回较大元素的下标
		if (len == 2) {
			if (nums[0] > nums[1]) {
				return 0;
			} else {
				return 1;
			}
		}
		//判断最后一个元素是否为峰值
		if (nums[len - 1] > nums[len - 2]) {
			return len - 1;
		}
		//前len-3项是否有峰值
		for (int i = 0; i < nums.length - 2; i++) {
			if (nums[i] < nums[i + 1] && nums[i + 1] > nums[i + 2]) {
				return i + 1;
			}

		}

		return 0;
	}

}
