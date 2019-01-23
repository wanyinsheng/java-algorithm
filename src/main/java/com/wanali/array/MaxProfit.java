package com.wanali.array;

/**
 *
 * 给定一个数组，它的第 i 个元素是一支给定股票第 i 天的价格。
 * 如果你最多只允许完成一笔交易（即买入和卖出一支股票），设计一个算法来计算你所能获取的最大利润。
 * 输入: [7,1,5,3,6,4]
 * 输出: 5
 * @author wan_ys
 *
 * 2019年1月20日下午7:19:16
 */
public class MaxProfit {
	public static void main(String[] args) {
		int[] prices = new int[] { 7, 1, 5, 3, 6, 4 };
		System.out.println(maxProfit(prices));
	}

	static int maxProfit(int[] prices) {
		// 定义一个最大初始值
		int max = 0;
		for (int i = 0; i < prices.length - 1; i++) {
			for (int j = i + 1; j < prices.length; j++) {
				if (prices[j] - prices[i] > max) {
					max = prices[j] - prices[i];
				}
			}
		}
		return max;

	}

}
