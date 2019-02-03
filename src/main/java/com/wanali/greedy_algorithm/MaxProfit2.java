package com.wanali.greedy_algorithm;

/**
 * 买卖股票最佳时机2
 * 
 * 给定一个数组，它的第 i 个元素是一支给定股票第 i 天的价格。
 * 
 * 设计一个算法来计算你所能获取的最大利润。你可以尽可能地完成更多的交易（多次买卖一支股票）。
 * 
 * 注意：你不能同时参与多笔交易（你必须在再次购买前出售掉之前的股票）。 
 * 
 * 输入: [7,1,5,3,6,4] 输出: 7 
 * 
 * 输入: [1,2,3,4,5] 输出: 4
 * 
 * @author wan_ys
 *
 *         2019年2月3日下午11:15:51
 */
public class MaxProfit2 {
	public static void main(String[] args) {
		System.out.println(maxProfit(new int[] { 7, 1, 5, 3, 6, 4 }));
		System.out.println(maxProfit(new int[] { 1, 2, 3, 4, 5 }));
	}

	/**
	 * 峰谷法
	 * 
	 * @param prices
	 * @return
	 */
	static int maxProfit(int[] prices) {
		if (prices.length==0) {
			return 0;
		}
		int i = 0;
		int valley = prices[0];
		int peak = prices[0];
		int max = 0;
		while (i < prices.length - 1) {
			while (i < prices.length - 1 && prices[i] >= prices[i + 1]) {
				i++;
			}
			valley = prices[i];
			while (i < prices.length - 1 && prices[i] <= prices[i + 1]) {
				i++;
			}
			peak = prices[i];
			// 每当找到一个波谷与波峰时就计算一次最大利润
			max += peak - valley;
		}
		return max;
	}

}
