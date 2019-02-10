package com.wanali.array;

import java.util.Arrays;

/**
 * 两数之和2-输入有序数组
 * 
 * 给定一个已按照升序排列 的有序数组，找到两个数使得它们相加之和等于目标数。
 * 
 * 函数应该返回这两个下标值 index1 和 index2，其中 index1 必须小于 index2。
 * 
 * 返回的下标值（index1 和 index2）不是从零开始的。 你可以假设每个输入只对应唯一的答案，而且你不可以重复使用相同的元素。 
 * 
 * 输入: numbers = [2, 7, 11, 15], target = 9 输出: [1,2] 解释: 2 与 7 之和等于目标数 9 。因此
 * index1 = 1, index2 = 2 。
 * 
 * @author wan_ys
 *
 *         2019年2月10日下午9:15:52
 */
public class TwoSum2 {
	public static void main(String[] args) {
		System.out.println(Arrays.toString(twoSum(new int[] { 2, 7, 11, 15 }, 9)));
	}

	/**
	 * 双指针法
	 * 
	 * @param numbers
	 * @param target
	 * @return
	 */
	static int[] twoSum(int[] numbers, int target) {
		int[] result = new int[2];
		int i = 0;
		int j = numbers.length - 1;
		while (i < j) {
			if (numbers[i] + numbers[j] > target) {
				j--;
			} else if (numbers[i] + numbers[j] < target) {
				i++;
			} else {
				break;
			}

		}
		result[0] = i + 1;
		result[1] = j + 1;
		return result;
	}

}
