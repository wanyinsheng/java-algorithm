package com.wanali.divided;
/**
 * 搜索二维矩阵2
 * 
 * 编写一个高效的算法来搜索 m x n 矩阵 matrix 中的一个目标值 target。该矩阵具有以下特性：

每行的元素从左到右升序排列。
每列的元素从上到下升序排列。
示例:

现有矩阵 matrix 如下：

[
  [1,   4,  7, 11, 15],
  [2,   5,  8, 12, 19],
  [3,   6,  9, 16, 22],
  [10, 13, 14, 17, 24],
  [18, 21, 23, 26, 30]
]
给定 target = 5，返回 true。

给定 target = 20，返回 false。
 * @author wan_ys
 *
 * 2019年3月3日上午12:09:48
 */
public class SearchMatrix {
	public static void main(String[] args) {
		int[][] matrix = new int[][] { { 1, 4, 7, 11, 15 }, { 2, 5, 8, 12, 19 }, { 3, 6, 9, 16, 22 },
				{ 10, 13, 14, 17, 24 }, { 18, 21, 23, 26, 30 } };
		System.out.println(searchMatrix(matrix, 5));
		System.out.println(searchMatrix(matrix, 20));
	}

	/**
	 * 该方法还可以进一步优化，如果在某行找到了target所在的(j,j+1)的区间里边，换行之后不用从头开始找，可以判断(i+1,j)处的值与target的关系，向左或向右递归
	 * @param matrix
	 * @param target
	 * @return
	 */
	static boolean searchMatrix(int[][] matrix, int target) {
		int col = matrix[0].length;
		if (matrix.length==0) {
			return false;
		}
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[0].length - 1; j++) {
				//如果在该行找到两个数，target位于这两个数之间，就直换到下一行搜索
				if (j + 1 < col && matrix[i][j] < target && matrix[i][j + 1] > target) {
					break;
				}
				if (matrix[i][j] == target) {
					return true;
				}
			}
		}
		return false;
	}

}
