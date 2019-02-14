package com.wanali.hash_table;

/**
 * 岛屿的周长
 * 
 * 给定一个包含 0 和 1 的二维网格地图，其中 1 表示陆地 0 表示水域。
 * 
 * 网格中的格子水平和垂直方向相连（对角线方向不相连）。整个网格被水完全包围，但其中恰好有一个岛屿（或者说，一个或多个表示陆地的格子相连组成的岛屿）。
 * 
 * 岛屿中没有“湖”（“湖” 指水域在岛屿内部且不和岛屿周围的水相连）。格子是边长为 1 的正方形。网格为长方形，且宽度和高度均不超过 100
 * 。计算这个岛屿的周长。
 * 
 * 输入: [[0,1,0,0], [1,1,1,0], [0,1,0,0], [1,1,0,0]]
 * 
 * 输出: 16
 * 
 * @author wan_ys
 *
 *         2019年2月14日下午3:55:49
 */
public class IslandPerimeter {
	public static void main(String[] args) {
		System.out.println(
				islandPerimeter(new int[][] { { 0, 1, 0, 0 }, { 1, 1, 1, 0 }, { 0, 1, 0, 0 }, { 1, 1, 0, 0 } }));
	}

	/**
	 * 因为只有一个岛屿，即所有的1之间都是连着的
	 * 
	 * @param grid
	 * @return
	 */
	static int islandPerimeter(int[][] grid) {
		int result = 0;
		for (int i = 0; i < grid.length; i++) {
			for (int j = 0; j < grid[0].length; j++) {
				if (grid[i][j] == 1) {
					result += 4;
					if (i + 1 < grid.length && grid[i + 1][j] == 1) {
						result -= 2;
					}
					if (j + 1 < grid[0].length && grid[i][j + 1] == 1) {
						result -= 2;
					}
				}
			}
		}
		return result;
	}

}
