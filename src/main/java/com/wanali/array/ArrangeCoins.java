package com.wanali.array;

/**
 * 排列硬币
 * 你总共有 n 枚硬币，你需要将它们摆成一个阶梯形状，第 k 行就必须正好有 k 枚硬币。
 * 给定一个数字 n，找出可形成完整阶梯行的总行数。
 * n = 5，返回2
 * @author wan_ys
 *
 *         2019年1月19日下午5:16:38
 */
public class ArrangeCoins {
	public static void main(String[] args) {
		int n = 1804289383;
		System.out.println(arrangeCoins(n));
	}

	static int arrangeCoins(int n) {
		return (int) (Math.sqrt((long) 2 * n + 0.25) - 0.5);
	}

}
