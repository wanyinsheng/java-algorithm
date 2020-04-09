package com.wanali.heap;

import java.util.Arrays;

/**
 * 239. 滑动窗口最大值
 * 
 * 给定一个数组 nums，有一个大小为 k 的滑动窗口从数组的最左侧移动到数组的最右侧。你只可以看到在滑动窗口内的 k 个数字。滑动窗口每次只向右移动一位。
 * 
 * 返回滑动窗口中的最大值。
 * 
 * 示例：
 * 
 * 输入: nums = [1,3,-1,-3,5,3,6,7], 和 k = 3
输出: [3,3,5,5,6,7] 
解释: 

  滑动窗口的位置                最大值
---------------               -----
[1  3  -1] -3  5  3  6  7       3
 1 [3  -1  -3] 5  3  6  7       3
 1  3 [-1  -3  5] 3  6  7       5
 1  3  -1 [-3  5  3] 6  7       5
 1  3  -1  -3 [5  3  6] 7       6
 1  3  -1  -3  5 [3  6  7]      7

 * @author wanyinsheng
 *
 * @date 2020年4月9日下午10:24:09
 *
 */
public class MaxSlidingWindow {
	public static void main(String[] args) {
		System.out.println(Arrays.toString(maxSlidingWindow(new int[] { 1, 3, -1, -3, 5, 3, 6, 7 }, 3)));// [3,3,5,5,6,7]
	}

	static int[] maxSlidingWindow(int[] nums, int k) {

		int[] result = new int[nums.length - k + 1];
		int windowMax;

		for (int i = 0; i < result.length; i++) {// i为当前窗口的第一个数
			windowMax = nums[i];
			for (int j = i; j < i + k; j++) {
				if (nums[j] > windowMax) {
					windowMax = nums[j];
				}
			}
			result[i] = windowMax;

		}
		return result;
	}

}
