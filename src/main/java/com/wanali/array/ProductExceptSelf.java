package com.wanali.array;

import java.util.Arrays;

/**
 * 给定长度为 n 的整数数组 nums，其中 n > 1，返回输出数组 output ，其中 output[i] 等于 nums 中除 nums[i]
 * 之外其余各元素的乘积。
 * 
 * 输入: [1,2,3,4] 输出: [24,12,8,6]
 * 
 * @author wan_ys
 *
 *         2019年3月5日上午10:22:28
 */
public class ProductExceptSelf {
	public static void main(String[] args) {
		System.out.println(Arrays.toString(productExceptSelf(new int[] { 1, 2, 3, 4 })));
	}

	static int[] productExceptSelf(int[] nums) {
		int left = 1;
		int right = 1;
		int len = nums.length;
		int[] output = new int[len];
		//先计算左半部分的乘积
		for (int i = 0; i < len; i++) {
			output[i] = left;
			left *= nums[i];
		}
		//在求出右半部分的乘积之后再乘以左半部分的乘积的结果
		for (int j = len - 1; j >= 0; j--) {
			output[j] *= right;
			right *= nums[j];
		}
		return output;
	}

}
