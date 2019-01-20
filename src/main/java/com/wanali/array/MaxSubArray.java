package com.wanali.array;

/**
 * 给定一个整数数组 nums ，找到一个具有最大和的连续子数组（子数组最少包含一个元素），返回其最大和。 输入:
 * [-2,1,-3,4,-1,2,1,-5,4], 输出: 6
 * 
 * @author wan_ys
 *
 *2019年1月20日下午8:32:17
 */
public class MaxSubArray {
	public static void main(String[] args) {
		int[] nums = new int[] {-2,1,-3,4,-1,2,1,-5,4 };
		System.out.println(maxSubArray(nums));
		System.out.println(maxSubArray1(nums));
	}

	/**
	 * 暴力枚举法(O(N^3))
	 * 
	 * @param nums
	 * @return
	 */
	static int maxSubArray(int[] nums) {
		int sum;
		int max = Integer.MIN_VALUE;
		for (int i = 0; i < nums.length; i++) {// 子序列左边界
			for (int j = i; j < nums.length; j++) {// 子序列右边界
				sum = 0;
				for (int k = i; k <= j; k++) {// 对每一个子序列都进行求和找最大值
					sum += nums[k];
				}
				if (max < sum) {
					max = sum;
				}
			}
		}
		return max;
	}

	/**
	 * 对暴力枚举进行改进
	 * 
	 * @param nums
	 * @return
	 */
	static int maxSubArray1(int[] nums) {
		int max =Integer.MIN_VALUE;
		int sum;
		for (int i = 0; i < nums.length; i++) {
			sum = 0;
			for (int j = i; j < nums.length; j++) {
				sum += nums[j];
				if (sum > max) {
					max = sum;
				}
			}
		}
		return max;
	}

}
