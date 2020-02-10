package com.wanali.array;

import java.util.Arrays;

/**
 * 189.旋转数组
 * 
 * 给定一个数组，将数组中的元素向右移动 k 个位置，其中 k 是非负数。
 * 
 * 示例 1:
 * 
 * 输入: [1,2,3,4,5,6,7] 和 k = 3
 * 
 * 输出: [5,6,7,1,2,3,4]
 * 
 * 解释: 向右旋转 1 步: [7,1,2,3,4,5,6] 向右旋转 2 步: [6,7,1,2,3,4,5] 向右旋转 3 步:
 * [5,6,7,1,2,3,4]
 * 
 * 示例 2:
 * 
 * 输入: [-1,-100,3,99] 和 k = 2
 * 
 * 输出: [3,99,-1,-100] 解释: 向右旋转 1 步: [99,-1,-100,3] 向右旋转 2 步: [3,99,-1,-100]
 * 
 * 
 * @author wanyinsheng
 *
 * @date 2020年2月10日下午12:46:21
 *
 */
public class RotateArray {
	public static void main(String[] args) {
		System.out.println(Arrays.toString(rotate1(new int[] { 1, 2, 3, 4, 5, 6, 7 }, 3)));

		System.out.println(Arrays.toString(rotate2(new int[] { 1, 2, 3, 4, 5, 6, 7 }, 3)));
	}

	/**
	 * 使用额外数组
	 * 
	 * @param nums
	 * @param k
	 */
	static int[] rotate1(int[] nums, int k) {

		// 真实移动的的偏移量
		int offset = k % nums.length;
		// 额外数组
		int[] temp = new int[nums.length];
		for (int i = 0; i < temp.length; i++) {
			// temp[i]=nums[(i+offset)%nums.length];//注意旋转方式，向左旋转
			temp[(i + offset) % nums.length] = nums[i];// 向右旋转
		}
		for (int i = 0; i < nums.length; i++) {
			nums[i] = temp[i];
		}
		return nums;
	}

	/**
	 * 使用反转，三次反转
	 * 
	 * 空间复杂度为O(1),没有使用额外的空间
	 * 
	 * @param nums
	 * @param k
	 * @return
	 */
	static int[] rotate2(int[] nums, int k) {
		// 实际的移位
		k = k % nums.length;
		// 反转整个数组
		reverse(nums, 0, nums.length - 1);
		// 反转数组的前k个
		reverse(nums, 0, k - 1);
		// 反转数组的后n-k个
		reverse(nums, k, nums.length - 1);
		return nums;
	}

	/**
	 * 反转数组
	 * 
	 * @param nums
	 * @param start
	 * @param end
	 * @return
	 */
	static int[] reverse(int[] nums, int start, int end) {
		while (start < end) {
			int temp = nums[start];
			nums[start] = nums[end];
			nums[end] = temp;
			start++;
			end--;
		}
		return nums;
	}
}
