package com.wanali.dynamic_planning;

/**
 * 零钱兑换
 * 给定不同面额的硬币 coins 和一个总金额
 * amount。编写一个函数来计算可以凑成总金额所需的最少的硬币个数。如果没有任何一种硬币组合能组成总金额，返回 -1。
 * 输入: coins = [1, 2, 5], amount = 11
 * 输出: 3 
 * 输入: coins = [2], amount = 3
 * 输出: -1
 * @author wan_ys
 *
 * 2019年1月19日下午3:32:50
 */
public class CoinChange {
	public static void main(String[] args) {
		int[] coins = new int[] { 1, 2, 5 };
		int amount = 11;
		System.out.println(coinChange(coins, amount));
		int[] coins1 = new int[] { 2 };
		int amount1 = 3;
		System.out.println(coinChange(coins1, amount1));
	}

	/**
	 * 
	 * @param coins
	 *            零钱数组
	 * @param amount
	 *            兑换金币总金额
	 * @return
	 */
	static int coinChange(int[] coins, int amount) {
		int[] dp = new int[amount + 1];
		dp[0] = 0;
		for (int i = 1; i <= amount; i++) {
			dp[i] = amount + 1;// 初始化一个最大的值
			for (int j = 0; j < coins.length; j++) {
				if (i >= coins[j] && (dp[i - coins[j]] + 1) < dp[i]) {
					dp[i] = dp[i - coins[j]] + 1;
				}
			}
		}
		return dp[amount] == amount + 1 ? -1 : dp[amount];
	}

}
