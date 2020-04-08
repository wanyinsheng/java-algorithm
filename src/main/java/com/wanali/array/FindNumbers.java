package com.wanali.array;

/**
 * 1295. 统计位数为偶数的数字
 * 
 * 给你一个整数数组 nums，请你返回其中位数为 偶数 的数字的个数。
 * 
 * 示例1：
 * 
 * 输入：nums = [12,345,2,6,7896]
 * 
 * 输出：2 解释： 12 是 2 位数字（位数为偶数）  345 是 3 位数字（位数为奇数）   2 是 1 位数字（位数为奇数）  6 是 1 位数字
 * 位数为奇数）  7896 是 4 位数字（位数为偶数）   因此只有 12 和 7896 是位数为偶数的数字
 * 
 * 示例2：
 * 
 * 输入：nums = [555,901,482,1771]
 * 
 * 输出：1 解释： 只有 1771 是位数为偶数的数字。
 * 
 * 
 * @author wanyinsheng
 *
 * @date 2020年4月8日下午11:50:20
 *
 */
public class FindNumbers {
	public static void main(String[] args) {
		System.out.println(findNumbers(new int[] { 12, 345, 2, 6, 7896 }));// 2
		System.out.println(findNumbers(new int[] { 555, 901, 482, 1771 }));// 1
	}

	static int findNumbers(int[] nums) {
		int count = 0;
		for (int i = 0; i < nums.length; i++) {
			String string = nums[i] + "";
			if (string.length() % 2 == 0) {
				count++;
			}
		}

		return count;
	}

}
