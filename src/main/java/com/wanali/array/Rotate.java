package com.wanali.array;

/**
 * 旋转图像
 * 给定一个 n × n 的二维矩阵表示一个图像。将图像顺时针旋转 90 度。 
 * 
 * 给定 matrix = [ [1,2,3], [4,5,6], [7,8,9] ],
 * 原地旋转输入矩阵，使其变为: [ [7,4,1], [8,5,2], [9,6,3] ]
 * 
 * @author wan_ys
 *
 * 2019年1月28日下午1:34:59
 */
public class Rotate {
	/**
	 * 
	 * @param matrix
	 */
	static void rotate(int[][] matrix) {
		int n = matrix.length;// 原始数组的行数和列数
		int[][] result = new int[n][n];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				result[i][j] = matrix[n - 1 - j][i];
			}
		}
		// 将值赋回给原数组
		for (int i = 0; i < result.length; i++) {
			for (int j = 0; j < result.length; j++) {
				matrix[i][j] = result[i][j];
			}
		}
	}

}
