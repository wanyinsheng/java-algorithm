package com.wanali.array;

/**
 * 面试题04. 二维数组中的查找
 * 
 * 在一个 n * m
 * 的二维数组中，每一行都按照从左到右递增的顺序排序，每一列都按照从上到下递增的顺序排序。请完成一个函数，输入这样的一个二维数组和一个整数，判断数组中是否含有该整数。
 * 
 *  现有矩阵 matrix 如下：

[
  [1,   4,  7, 11, 15],
  [2,   5,  8, 12, 19],
  [3,   6,  9, 16, 22],
  [10, 13, 14, 17, 24],
  [18, 21, 23, 26, 30]
]

 * 
 * 给定 target = 5，返回 true。
 * 
 * 给定 target = 20，返回 false。
 * 
 * @author wanyinsheng
 *
 * @date 2020年4月9日下午11:01:10
 *
 */
public class FindNumberIn2DArray {
	public static void main(String[] args) {
		int[][] matrix = new int[][] { { 1, 4, 7, 11, 15 }, { 2, 5, 8, 12, 19 }, { 3, 6, 9, 16, 22 },
				{ 10, 13, 14, 17, 24 }, { 18, 21, 23, 26, 30 } };
		System.out.println(findNumberIn2DArray(matrix, 5));// true
		System.out.println(findNumberIn2DArray(matrix, 20));// false
	}

	static boolean findNumberIn2DArray(int[][] matrix, int target) {
		if (matrix.length == 0) {
			return false;
		}
		int rows = matrix.length;
		int cols = matrix[0].length;
		// 从右上角开始向左下角移动，如果该位置的元素等于target则结束；
		// 该位置的元素大于target，则，该列都会大于target，直接删除最后一列；
		// 该位置元素小于target，则该行都小于target，删除该行
		int row = 0;
		int col = cols - 1;
		while (row >= 0 && row < rows && col >= 0 && col < cols) {// 确保在数组中找
			if (matrix[row][col] == target) {
				return true;
			} else if (matrix[row][col] > target) {
				col--;// 表示删除该列，向左移动
			} else {
				row++;// 删除该行，向下移动
			}
		}
		return false;
	}

}
