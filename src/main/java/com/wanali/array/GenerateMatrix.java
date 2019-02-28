package com.wanali.array;
/**
 * 螺旋矩阵2
 * 
 * 给定一个正整数 n，生成一个包含 1 到 n2 所有元素，且元素按顺时针顺序螺旋排列的正方形矩阵。

输入: 3
输出:
[
 [ 1, 2, 3 ],
 [ 8, 9, 4 ],
 [ 7, 6, 5 ]
]
 * @author wan_ys
 *
 * 2019年2月28日上午10:52:53
 */
public class GenerateMatrix {
	public static void main(String[] args) {
		int[][] array=generateMatrix(3);
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length; j++) {
				System.out.print(array[i][j]+" ");
			}
			System.out.println();
		}
	}

	static int[][] generateMatrix(int n) {
		int[][] result = new int[n][n];
		int a = 1;
		int j = 0;
		while (a <= n * n) {

			for (int i = j; i < n - j; i++)
				result[j][i] = a++;
			for (int i = j + 1; i < n - j; i++)
				result[i][n - j - 1] = a++;
			for (int i = n - j - 2; i >= j; i--)
				result[n - j - 1][i] = a++;
			for (int i = n - j - 2; i > j; i--)
				result[i][j] = a++;

			j++;
		}
		return result;
	}

}
