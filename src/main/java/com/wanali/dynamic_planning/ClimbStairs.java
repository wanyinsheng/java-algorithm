package com.wanali.dynamic_planning;

/**
 * 爬楼梯
 * 
 * 假设你正在爬楼梯。需要 n 阶你才能到达楼顶。
 * 每次你可以爬 1 或 2 个台阶。你有多少种不同的方法可以爬到楼顶呢？ 
 * 
 * 输入： 2 输出： 2 
 * 
 * 输入： 3 输出： 3 
 * 
 * @author wan_ys
 *
 *         2019年1月29日下午8:33:47
 */
public class ClimbStairs {
	public static void main(String[] args) {
		System.out.println(climbStairs(2));
		System.out.println(climbStairs(3));
	}

	static int climbStairs(int n) {
		if (n == 1) {
			return 1;
		}
		int[] dp = new int[n + 1];
		dp[1] = 1;
		dp[2] = 2;
		for (int i = 3; i <= n; i++) {
			dp[i] = dp[i - 2] + dp[i - 1];
		}
		return dp[n];
	}

}
