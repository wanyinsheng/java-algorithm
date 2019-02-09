package com.wanali.array;

/**
 * 重塑矩阵
 * 
 * 在MATLAB中，有一个非常有用的函数 reshape，它可以将一个矩阵重塑为另一个大小不同的新矩阵，但保留其原始数据。
 * 
 * 给出一个由二维数组表示的矩阵，以及两个正整数r和c，分别表示想要的重构的矩阵的行数和列数。
 * 
 * 重构后的矩阵需要将原始矩阵的所有元素以相同的行遍历顺序填充。
 * 
 * 如果具有给定参数的reshape操作是可行且合理的，则输出新的重塑矩阵；否则，输出原始矩阵。 
 * 
 * 输入: nums = [[1,2], [3,4]] r =1, c = 4 输出: [[1,2,3,4]] 
 * 输入: nums = [[1,2], [3,4]] r = 2, c = 4 输出: [[1,2],[3,4]]
 * 
 * @author wan_ys
 *
 *         2019年2月9日下午11:15:18
 */
public class MatrixReshape {

	public static void main(String[] args) {
		int[][] nums = new int[][] { { 1, 2 }, { 3, 4 } };
		nums = matrixReshape(nums, 1, 4);
		for (int i = 0; i < nums.length; i++) {
			for (int j = 0; j < nums[0].length; j++) {
				System.out.print(nums[i][j] + " ");
			}
			System.out.println();
		}
	}

	static int[][] matrixReshape(int[][] nums, int r, int c) {
		//如果矩阵大小不一样，就不能重塑
		if (nums.length * nums[0].length != r * c) {
			return nums;
		}
		int[][] result = new int[r][c];
		int row = 0;
		int col = 0;
		for (int i = 0; i < result.length; i++) {
			for (int j = 0; j < result[0].length; j++) {
				//如果nums矩阵的一行遍历完了，就换第二行继续遍历
				result[i][j] = nums[row][col++];
				if (col == nums[0].length) {//注意这里是col == nums[0].length
					row++;
					col = 0;
				}
			}
		}
		return result;
	}

}
