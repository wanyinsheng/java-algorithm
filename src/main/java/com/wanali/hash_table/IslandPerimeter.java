package com.wanali.hash_table;

public class IslandPerimeter {
	public static void main(String[] args) {
		System.out.println(
				islandPerimeter(new int[][] { { 0, 1, 0, 0 }, { 1, 1, 1, 0 }, { 0, 1, 0, 0 }, { 1, 1, 0, 0 } }));
	}
	/**
	 * 因为只有一个岛屿，即所有的1之间都是连着的
	 * @param grid
	 * @return
	 */
	static int islandPerimeter(int[][] grid) {
		int result=0;
		for (int i = 0; i < grid.length; i++) {
			for (int j = 0; j < grid[0].length; j++) {
				if (grid[i][j]==1) {
					result+=4;
					if (i+1<grid.length&&grid[i+1][j]==1) {
						result-=2;
					}if (j+1<grid[0].length&&grid[i][j+1]==1) {
						result-=2;
					}
				}
			}
		}
		return result;
	}

}
