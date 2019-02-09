package com.wanali.array;

/**
 * 翻转图像
 * 
 * 给定一个二进制矩阵 A，我们想先水平翻转图像，然后反转图像并返回结果。
 * 
 * 水平翻转图片就是将图片的每一行都进行翻转，即逆序。例如，水平翻转 [1, 1, 0] 的结果是 [0, 1, 1]。
 * 
 * 反转图片的意思是图片中的 0 全部被 1 替换， 1 全部被 0 替换。例如，反转 [0, 1, 1] 的结果是 [1, 0, 0]。
 *  输入:[[1,1,0],[1,0,1],[0,0,0]] 输出: [[1,0,0],[0,1,0],[1,1,1]] 
 *  输入:[[1,1,0,0],[1,0,0,1],[0,1,1,1],[1,0,1,0]] 
 *  输出:[[1,1,0,0],[0,1,1,0],[0,0,0,1],[1,0,1,0]]
 * 
 * @author wan_ys
 *
 *         2019年2月9日下午10:23:36
 */
public class FlipAndInvertImage {
	public static void main(String[] args) {
		int[][] A = new int[][] { { 1, 1, 0 }, { 1, 0, 1 }, { 0, 0, 0 } };
		int[][] A1 = new int[][] { { 1, 1, 0, 0 }, { 1, 0, 0, 1 }, { 0, 1, 1, 1 }, { 1, 0, 1, 0 } };
		A = flipAndInvertImage(A);
		for (int i = 0; i < A.length; i++) {
			for (int j = 0; j < A[0].length; j++) {
				System.out.print(A[i][j] + " ");
			}
			System.out.println();
		}
	}

	static int[][] flipAndInvertImage(int[][] A) {
		// 定义新的数组
		int[][] result = new int[A.length][A[0].length];
		for (int i = 0; i < A.length; i++) {
			for (int j = 0; j < A[0].length; j++) {
				result[i][j] = A[i][A[0].length - j - 1];
				// 如果该位置的数为1，将其置为0
				if (result[i][j] == 1) {
					result[i][j] = 0;
				} else {
					result[i][j] = 1;
				}
			}
		}
		return result;
	}

}
