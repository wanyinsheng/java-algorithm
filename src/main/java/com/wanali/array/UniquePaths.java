package com.wanali.array;

/**
 * 不同路径
 * 一个机器人位于一个 m x n 网格的左上角 （起始点在下图中标记为“Start” ）。
 * 
 * 机器人每次只能向下或者向右移动一步。机器人试图达到网格的右下角（在下图中标记为“Finish”）。
 * 
 * 问总共有多少条不同的路径？ 说明：m 和 n 的值均不超过 100。 
 * 输入: m = 3, n = 2 输出: 3 解释: 从左上角开始，总共有 3条路径可以到达右下角。 
 * 1. 向右 -> 向右 -> 向下 2. 向右 -> 向下 -> 向右 3. 向下 -> 向右 -> 向右
 * 输入: m = 7,n = 3 输出: 28
 * 
 * @author wan_ys
 *
 * 2019年1月28日下午3:57:04
 */
public class UniquePaths {
	public static void main(String[] args) {
		int m = 3;
		int n = 2;
		System.out.println(uniquePaths(m, n));
		int m1 = 7;
		int n1 = 3;
		System.out.println(uniquePaths(m1, n1));
	}
	static int uniquePaths(int m, int n) {
		int[][] result = new int[m][n];

        // 第一列的解
        for (int i = 0; i < m; i++) {
            result[i][0] = 1;
        }

        // 第一行的解
        for (int i = 1; i < n; i++) {
            result[0][i] = 1;
        }

        // 其它位置的解
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                result[i][j] = result[i - 1][j] + result[i][j - 1];
            }
        }

        // 所求的解
        return result[m - 1][n - 1];
	}
}
