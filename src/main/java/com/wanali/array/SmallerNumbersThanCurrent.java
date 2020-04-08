package com.wanali.array;

import java.util.Arrays;

/**
 * 1365. 有多少小于当前数字的数字
 * 
 * 给你一个数组 nums，对于其中每个元素 nums[i]，请你统计数组中比它小的所有数字的数目。
 * 
 * 换而言之，对于每个 nums[i] 你必须计算出有效的 j 的数量，其中 j 满足 j != i 且 nums[j] < nums[i] 。
 * 
 * 以数组形式返回答案。 示例1：
 * 
 * 输入：nums = [8,1,2,2,3] 输出：[4,0,1,1,3] 解释： 对于 nums[0]=8 存在四个比它小的数字：（1，2，2 和 3）。
 * 对于 nums[1]=1 不存在比它小的数字。 对于 nums[2]=2 存在一个比它小的数字：（1）。 对于 nums[3]=2
 * 存在一个比它小的数字：（1）。 对于 nums[4]=3 存在三个比它小的数字：（1，2 和 2）。
 * 
 * 示例2：
 * 
 * 输入：nums = [6,5,4,8] 输出：[2,1,0,3]
 * 
 * 示例3：
 * 
 * 输入：nums = [7,7,7,7] 输出：[0,0,0,0]
 * 
 * 
 * @author wanyinsheng
 *
 * @date 2020年4月8日下午10:46:07
 *
 */
public class SmallerNumbersThanCurrent {
	public static void main(String[] args) {
		System.out.println(Arrays.toString(smallerNumbersThanCurrent(new int[] { 8, 1, 2, 2, 3 })));// [4,0,1,1,3]
		System.out.println(Arrays.toString(smallerNumbersThanCurrent(new int[] { 6, 5, 4, 8 })));// [2,1,0,3]
		System.out.println(Arrays.toString(smallerNumbersThanCurrent(new int[] { 7, 7, 7, 7 })));// [0,0,0,0]
	}

	static int[] smallerNumbersThanCurrent(int[] nums) {
		int[] result = new int[nums.length];
		int count = 0;
		for (int i = 0; i < result.length; i++) {
			count = 0;
			for (int j = 0; j < result.length; j++) {
				if (nums[j] < nums[i]) {
					count++;
				}
			}
			result[i] = count;
		}
		return result;
	}
}
