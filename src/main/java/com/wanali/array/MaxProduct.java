package com.wanali.array;
/**
 * 乘积最大子序列
 * 给定一个整数数组 nums ，找出一个序列中乘积最大的连续子序列（该序列至少包含一个数）
 * 输入: [2,3,-2,4] 	输出: 6
 * 输入: [-2,0,-1] 输出: 0  注意是连续子序列
 * @author wan_ys
 *
 * 2019年1月20日下午10:42:48
 */
public class MaxProduct {
	public static void main(String[] args) {
		int[] nums = new int[] {2,3,-2,4};
		int[] nums1=new int[] {-2,0,-1};
		System.out.println(maxProduct(nums));
		System.out.println(maxProduct(nums1));
	}
	static int maxProduct(int[] nums) {
		int maxNum=nums[0];
		int minNum=nums[0];
		int result=nums[0];
		for (int i = 1; i < nums.length; i++) {
			int maxTemp=maxNum;
			int minTemp=minNum;
			maxNum=max(nums[i], max(nums[i]*maxTemp, nums[i]*minTemp));
			minNum=min(nums[i], min(nums[i]*minTemp, nums[i]*maxTemp));
			result=max(result, maxNum);
		}
		return result;
	}
	
	static int max(int a,int b) {
		if(a>b) {
			return a;
			}
		return b;
		}
	
	static int min(int a,int b) {
		if (a>b) {
			return b;
		}
		return a;
	}

}
