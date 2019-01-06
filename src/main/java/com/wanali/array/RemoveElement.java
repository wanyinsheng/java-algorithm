package com.wanali.array;
/**
 * 给定一个数组 nums 和一个值 val，你需要原地移除所有数值等于 val 的元素，返回移除后数组的新长度。
 * 给定 nums = [3,2,2,3], val = 3,返回2
 * 给定 nums = [0,1,2,2,3,0,4,2], val = 2,返回5
 * @author wan_ys
 *
 * 2019年1月6日下午8:29:44
 */
public class RemoveElement {
	public static void main(String[] args) {
		int[] nums = new int[] { 0, 1, 2, 2, 2, 2, 2, 3, 0, 4, 2 };
		int val = 2;
		System.out.println(removeElement(nums, val));
	}

	static int removeElement(int[] nums, int val) {
		int index=0;
		for (int i = 0; i < nums.length; i++) {
			//如果不等于val,则重新赋值给这个数组
			if(nums[i]!=val) {
				nums[index++]=nums[i];
			}
		}
		return index;
	}

}
