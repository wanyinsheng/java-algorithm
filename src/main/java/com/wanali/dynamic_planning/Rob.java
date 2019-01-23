package com.wanali.dynamic_planning;

/**
 * 打家劫舍 
 * 你是一个专业的小偷，计划偷窃沿街的房屋。每间房内都藏有一定的现金，影响你偷窃的唯一制约因素就是相邻的房屋装有相互连通的防盗系统，
 * 如果两间相邻的房屋在同一晚上被小偷闯入，系统会自动报警。
 * 给定一个代表每个房屋存放金额的非负整数数组，计算你在不触动警报装置的情况下，能够偷窃到的最高金额。 
 * 输入: [1,2,3,1] 输出: 4 
 * 输入: [2,7,9,3,1] 输出: 12
 * 
 * @author wan_ys
 *
 *  2019年1月21日下午12:01:23
 */
public class Rob {
	public static void main(String[] args) {
		int[] nums = new int[] { 1, 2, 3, 1 };
		int[] nums1 = new int[] { 2, 7, 9, 3, 1 };
		int[] nums2 = new int[] {};
		System.out.println(rob(nums));
		System.out.println(rob(nums1));
		System.out.println(rob(nums2));
	}

	/**
	 * 动态规划 dp[i]表示到i位置时形成的最大和，
	 * 先确定dp[0],dp[1],状态转移方程为dp[i]=max(dp[i-2]+nums[i],dp[i-1])
	 * 
	 * @param nums
	 * @return
	 */
	static int rob(int[] nums) {
		int max = 0;
		int n = nums.length;
		int[] dp = new int[n];
		if (n == 0) {
			max = 0;
		}
		if (n == 1) {
			max = nums[0];
		}
		if (n == 2) {
			max = Math.max(nums[0], nums[1]);
		}
		if (n > 2) {

			dp[0] = nums[0];
			dp[1] = Math.max(nums[0], nums[1]);
			for (int i = 2; i < nums.length; i++) {

				dp[i] = Math.max(dp[i - 2] + nums[i], dp[i - 1]);
				if (dp[i] > max) {
					max = dp[i];
				}
			}
		}
		return max;
	}

}
