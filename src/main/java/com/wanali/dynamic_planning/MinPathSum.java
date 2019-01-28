package com.wanali.dynamic_planning;

/**
 * 最小路径和 
 * 给定一个包含非负整数的 m x n 网格，请找出一条从左上角到右下角的路径，使得路径上的数字总和为最小。 
 * 输入: [ [1,3,1],[1,5,1], [4,2,1] ] 输出: 7 解释: 因为路径 1→3→1→1→1 的总和最小。
 * 
 * @author wan_ys
 *
 * 2019年1月28日下午2:52:35
 */
public class MinPathSum {
	public static void main(String[] args) {
		int[][] grid = new int[][] { { 1, 3, 1 }, { 1, 5, 1 }, { 4, 2, 1 } };// 7
		System.out.println(minPathSum(grid));
	}

	static int minPathSum(int[][] grid) {
		int m = grid.length;
		int n = grid[0].length;
		int[][] dp = new int[m][n];
		// dp数组的初始位置
		dp[0][0] = grid[0][0];
		// 在求dp数组第一列或第一行时，累计前i行或前j列的值
		int sum = grid[0][0];
		// 将dp数组第一列都置位0
		for (int i = 1; i < m; i++) {
			sum += grid[i][0];
			dp[i][0] = sum;
		}
		// 需要将sum置位grid[0][0]
		sum = grid[0][0];
		// 将dp数组第一行置位0
		for (int j = 1; j < n; j++) {
			sum += grid[0][j];
			dp[0][j] = sum;
		}
		for (int i = 1; i < m; i++) {
			for (int j = 1; j < n; j++) {
				// 如果(i,j)位置上边元素小于等于左边元素,(i,j)位置的最短路径应该经过(i-1,j)
				if (dp[i - 1][j] <= dp[i][j - 1]) {
					dp[i][j] = dp[i - 1][j] + grid[i][j];
				} else {// (i,j)位置左边元素小于上班元素,(i,j)位置的最短路径经过(i,j-1)
					dp[i][j] = dp[i][j - 1] + grid[i][j];
				}
			}
		}
		return dp[m - 1][n - 1];
	}

}
