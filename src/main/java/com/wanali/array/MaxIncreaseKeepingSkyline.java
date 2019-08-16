package com.wanali.array;

import java.util.Arrays;

/**
 * 807.保持城市天际线
 * 
 * 在二维数组grid中，grid[i][j]代表位于某处的建筑物的高度。 我们被允许增加任何数量（不同建筑物的数量可能不同）的建筑物的高度。 高度 0
 * 也被认为是建筑物。
 * 
 * 最后，从新数组的所有四个方向（即顶部，底部，左侧和右侧）观看的“天际线”必须与原始数组的天际线相同。
 * 城市的天际线是从远处观看时，由所有建筑物形成的矩形的外部轮廓。 请看下面的例子。
 * 
 * 建筑物高度可以增加的最大总和是多少？
 * 
 * 例子： 输入： grid = [[3,0,8,4],[2,4,5,7],[9,2,6,3],[0,3,1,0]] 
 * 输出： 35
 * 
 * 解释： 
The grid is:
[ [3, 0, 8, 4], 
  [2, 4, 5, 7],
  [9, 2, 6, 3],
  [0, 3, 1, 0] ]

从数组竖直方向（即顶部，底部）看“天际线”是：[9, 4, 8, 7]
从水平水平方向（即左侧，右侧）看“天际线”是：[8, 7, 9, 3]

在不影响天际线的情况下对建筑物进行增高后，新数组如下：

gridNew = [ [8, 4, 8, 7],
            [7, 4, 7, 7],
            [9, 4, 8, 7],
            [3, 3, 3, 3] ]

 * 
 * 1 < grid.length = grid[0].length <= 50
 * 
 * @author wan_ys
 *
 * @date 2019年8月16日下午1:27:31
 *
 */
public class MaxIncreaseKeepingSkyline {
	public static void main(String[] args) {
		int[][] grid = new int[][] { { 3, 0, 8, 4 }, { 2, 4, 5, 7 }, { 9, 2, 6, 3 }, { 0, 3, 1, 0 } };
		System.out.println(maxIncreaseKeepingSkyline(grid));
	}

	static int maxIncreaseKeepingSkyline(int[][] grid) {
		int n = grid.length;
		int[] horizontal = new int[n];
		int[] verticality = new int[n];
		// 找竖直方向的天际线
		int count = 0;
		for (int i = 0; i < n; i++) {// 列
			verticality[count] = grid[0][i];
			for (int j = 0; j < n; j++) {// 行
				if (grid[j][i] > verticality[count]) {
					verticality[count] = grid[j][i];
				}
			}
			count++;
		}
		// System.out.println(Arrays.toString(verticality));
		// 找水平方向的天际线
		count = 0;
		for (int i = 0; i < n; i++) {// 行
			horizontal[count] = grid[i][0];
			for (int j = 0; j < n; j++) {// 列
				if (grid[i][j] > horizontal[count]) {
					horizontal[count] = grid[i][j];
				}
			}
			count++;
		}
		// System.out.println(Arrays.toString(horizontal));
		// 找建筑物可以增加的最大高度
		int max = 0;
		for (int i = 0; i < n; i++) {// 一行一行计算
			int j = 0;
			while (j < n) {
				if (horizontal[i] <= verticality[j]) {// 水平方向的数小时,可以将该(i,j)位置的建筑物增加到horizontal[i]
					max += horizontal[i] - grid[i][j];
				} else {
					max += verticality[j] - grid[i][j];
				}
				j++;
			}

		}
		return max;

	}

}
