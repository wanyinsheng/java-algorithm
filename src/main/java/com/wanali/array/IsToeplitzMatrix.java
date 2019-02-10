package com.wanali.array;

/**
 * 托普利茨矩阵
 * 
 * 如果一个矩阵的每一方向由左上到右下的对角线上具有相同元素，那么这个矩阵是托普利茨矩阵。
 * 
 * 给定一个 M x N 的矩阵，当且仅当它是托普利茨矩阵时返回 True。
 * 
 * 示例 1:
 * 
 * 输入: matrix = [ [1,2,3,4], [5,1,2,3], [9,5,1,2] ] 输出: True 解释: 在上述矩阵中, 其对角线为:
 * "[9]", "[5, 5]", "[1, 1, 1]", "[2, 2, 2]", "[3, 3]", "[4]"。 各条对角线上的所有元素均相同,
 * 因此答案是True。
 * 
 * 输入: matrix = [ [1,2], [2,2] ] 输出: False 解释: 对角线"[1, 2]"上的元素不同。
 * 
 * @author wan_ys
 *
 *         2019年2月10日下午6:49:28
 */
public class IsToeplitzMatrix {
	public static void main(String[] args) {

		int[][] matrix = new int[][] { { 1, 2, 3, 4 }, { 5, 1, 2, 3 }, { 9, 5, 1, 2 } };
		int[][] matrix1 = new int[][] { { 1, 2 }, { 2, 2 } };
		System.out.println(isToeplitzMatrix(matrix));
		System.out.println(isToeplitzMatrix(matrix1));
	}

	static boolean isToeplitzMatrix(int[][] matrix) {
		int m = matrix.length;// 矩阵行数
		int n = matrix[0].length;// 矩阵列数
		// 如果只有一行或一列的矩阵肯定托普利茨矩阵
		if (m == 1 || n == 1) {
			return true;
		}
		// 从第二行第二列开始判断该位置的元素是否与左上角的元素相等
		for (int i = 1; i < m; i++) {
			for (int j = 1; j < n; j++) {
				if (matrix[i][j] != matrix[i - 1][j - 1]) {
					return false;
				}
			}
		}
		return true;
	}

}
