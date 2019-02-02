package com.wanali.array;

/**
 * 删除排序数组中的重复项 
 * 给定一个排序数组，你需要在原地删除重复出现的元素，使得每个元素只出现一次，返回移除后数组的新长度。
 * 
 * 不要使用额外的数组空间，你必须在原地修改输入数组并在使用 O(1) 额外空间的条件下完成。
 * 
 * nums = [1,1,2]
 * nums = [0,0,1,1,1,2,2,3,3,4],
 * @author wan_ys
 *
 *         2019年2月2日下午7:18:38
 */
public class RemoveDuplicates {
	public static void main(String[] args) {
		System.out.println(removeDuplicates(new int[] { 1, 1, 2 }));
		System.out.println(removeDuplicates(new int[] { 0, 0, 1, 1, 1, 2, 2, 3, 3, 4 }));
	}

	/**
	 * 定义i和j两个指针，如果nums[i]==nums[j],j+1跳过重复项,不相等时，i+1赋新值
	 * 
	 * @param nums
	 * @return
	 */
	static int removeDuplicates(int[] nums) {
		if (nums.length == 0) {
			return 0;
		}
		int i = 0;
		for (int j = 1; j < nums.length; j++) {
			if (nums[j] != nums[i]) {
				i++;
				nums[i] = nums[j];
			}
		}
		return i + 1;
	}

}
