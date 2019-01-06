package com.wanali.array;

import java.util.Arrays;
/**
 * 给定一个数组 nums，编写一个函数将所有 0 移动到数组的末尾，同时保持非零元素的相对顺序。
 * 输入: [0,1,0,3,12]
 * 输出: [1,3,12,0,0]
 * @author wan_ys
 *
 * 2019年1月6日下午8:42:06
 */
public class MoveZeros {
	public static void main(String[] args) {
		int[] nums=new int[] {0,1,0,3,12};
		moveZeros(nums);
	}
	static void moveZeros(int[] nums) {
		int index=0;
		for (int i = 0; i < nums.length; i++) {
			if(nums[i]!=0) {
				nums[index++]=nums[i];
			}
		}
		//剩下的位置补0即可
		for (int i = index; i < nums.length; i++) {
			nums[i]=0;
		}
		System.out.println(Arrays.toString(nums));
	}

}
