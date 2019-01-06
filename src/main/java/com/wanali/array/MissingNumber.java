package com.wanali.array;
/**
 * 给定一个包含 0, 1, 2, ..., n 中 n 个数的序列，找出 0 .. n 中没有出现在序列中的那个数。
 * 输入: [3,0,1]
 * 输出: 2
 * 输入: [9,6,4,2,3,5,7,0,1]
 * 输出: 8
 * @author wan_ys
 *
 * 2019年1月6日下午10:27:51
 */
public class MissingNumber {
	public static void main(String[] args) {
		int[] nums = new int[] { 3, 0, 1 };
		System.out.println(missingNumber(nums));
		int[] num = new int[] { 9, 6, 4, 2, 3, 5, 7, 0, 1 };
		System.out.println(missingNumber(num));
	}

	static int missingNumber(int[] nums) {
		int sum = 0;
		int max = nums[0];
		int missNum = 0;
		for (int i = 0; i < nums.length; i++) {
			sum += nums[i];
			if (max < nums[i]) {
				max = nums[i];
			}
		}
		// 根据前n个数字之和与该缺少元素数组比较确定缺失数字
		missNum = max * (max + 1) / 2 - sum;
		return missNum;
	}

}
