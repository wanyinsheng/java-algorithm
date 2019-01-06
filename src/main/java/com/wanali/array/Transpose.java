package com.wanali.array;

/**
 * 实现矩阵转置
 * @author wan_ys
 *
 * 2019年1月6日下午10:05:49
 */
public class Transpose {
	public static void main(String[] args) {
		int[][] A = new int[][] { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		int[][] B = new int[][] { { 1, 2, 3 }, { 4, 5, 6 } };
		A = transpose(A);
		B = transpose(B);
		// 打印A转置的结果
		System.out.println("A转置为:");
		for (int i = 0; i < A.length; i++) {
			for (int j = 0; j < A[0].length; j++) {
				System.out.print(A[i][j] + " ");
				if (j == A[0].length - 1) {
					System.out.println();
				}
			}
		}
		// 打印B转置的结果
		System.out.println("B转置为:");
		for (int i = 0; i < B.length; i++) {
			for (int j = 0; j < B[0].length; j++) {
				System.out.print(B[i][j] + " ");
				if (j == B[0].length - 1) {
					System.out.println();
				}
			}
		}
	}

	static int[][] transpose(int[][] A) {
		int row = A.length;
		int column = A[0].length;
		int[][] T = new int[column][row];
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < column; j++) {
				T[j][i] = A[i][j];
			}
		}
		return T;

	}

}
