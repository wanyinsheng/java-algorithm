package com.wanali.dynamic_planning;
/**
 * 矩阵链乘(A的列数等于B的行数时,才能相乘,A是p*q的矩阵,B是q*r的矩阵,乘积C是p*r的矩阵)
 * 1、最优括号方案的结构特征
 * 2、一个递归求解的方案
 * 3、计算最优代价
 * 4、构造最优解
 * @author wan_ys
 *
 * 2019年1月9日下午9:59:17
 */
public class MatrixMul {
	public static void main(String[] args) {
		int[] p = new int[] { 30, 35, 15, 5, 10, 20, 25 };
		int[][] m = new int[p.length][p.length];
		int[][] s = new int[p.length][p.length];
		matrixChain(p, m, s);
		System.out.println("最优方案如下:");
		matrixChainOrder(s, 1, p.length - 1);
	}

	/**
	 * 计算最优代价
	 * 
	 * @param p
	 * @param m
	 * @param s
	 */
	static void matrixChain(int[] p, int[][] m, int[][] s) {
		int n = p.length - 1;
		// 将对角线元素置为0,因为涉及到矩阵Ai，故下标从1开始
		for (int i = 1; i <= n; i++) {
			m[i][i] = 0;
		}
		for (int l = 2; l <= n; l++) { // l为链的长度
			for (int i = 1; i <= n - l + 1; i++) { // 第i行
				int j = i + l - 1; // 第j列
				m[i][j] = m[i][i] + m[i + 1][j] + p[i - 1] * p[i] * p[j]; // 先定义一个默认值，并且默认是从i的位置分开
				s[i][j] = i; // 默认分割的位置
				for (int k = i + 1; k <= j - 1; k++) {
					int min = m[i][k] + m[k + 1][j] + p[i - 1] * p[k] * p[j];
					// 如果找待了小于该默认值的m[i][j],将该值赋给m[i][j],并且修改分割的位置s[i][j]
					if (min < m[i][j]) {
						m[i][j] = min;
						s[i][j] = k;
					}

				}
			}
		}

		matrixChainResult(m, s);
	}

	/**
	 * 打印最优代价矩阵m和断点位置矩阵s
	 * 
	 * @param m
	 * @param s
	 */
	static void matrixChainResult(int[][] m, int[][] s) {
		// 打印m矩阵
		System.out.println("最优代价矩阵如下:");
		for (int i = 1; i < m.length; i++) {
			for (int j = 1; j < m.length; j++) {
				System.out.print(m[i][j] + "\t");
			}
			System.out.println();
		}
		System.out.println("断点矩阵如下:");
		for (int i = 1; i < s.length; i++) {
			for (int j = 1; j < s.length; j++) {
				System.out.print(s[i][j] + "\t");
			}
			System.out.println();
		}
	}

	/**
	 * 递归构造最优解
	 * 
	 * @param s
	 * @param i
	 * @param j
	 */
	static void matrixChainOrder(int[][] s, int i, int j) {
		if (i == j) {
			System.out.print("A" + i);
		} else {
			System.out.print("(");
			matrixChainOrder(s, i, s[i][j]);
			matrixChainOrder(s, s[i][j] + 1, j);
			System.out.print(")");

		}
	}

}
