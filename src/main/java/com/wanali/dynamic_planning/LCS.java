package com.wanali.dynamic_planning;
/**
 * 最长公共自序列LCS(动态规划求解)
 * @author wan_ys
 *
 * 2019年1月10日上午8:43:34
 */
public class LCS {
	public static void main(String[] args) {
		String[] x = new String[] { "A", "B", "C", "B", "D", "A", "B" };
		String[] y = new String[] { "B", "D", "C", "A", "B", "A" };
		getLCSLength(x, y);

	}
	/**
	 * 计算LCS的长度
	 * @param x 
	 * @param y
	 */
	static void getLCSLength(String[] x, String[] y) {
		int m = x.length + 1;
		int n = y.length + 1;
		int[][] b = new int[m][n];//定义LCS长度数组
		String[][] c = new String[m][n]; //记录回溯方向，方便找公共子序列
		//初始化第一列为0
		for (int i = 0; i < m; i++) {
			b[i][0] = 0;
		}
		//初始化第一行为0
		for (int j = 0; j < n; j++) {
			b[0][j] = 0;
		}
		/*从(1,1)开始往后比较x[i]==y[j],b[i][j]=c[i-1][j-1]+1;
		 * b[i-1][j]>=b[i][j-1],则该位置的箭头向上指
		 * b[i][j-1]>b[i-1][j],则该位置的箭头向左指
		*/
		for (int i = 1; i < m; i++) {
			for (int j = 1; j < n; j++) {
				//注意这里应该是x[i-1]和y[j-1]
				if (x[i - 1] == y[j - 1]) {
					b[i][j] = b[i - 1][j - 1] + 1;
					c[i][j] = "upleft";
				} else if (b[i - 1][j] >= b[i][j - 1]) {//上边位置大于等于左边位置
					b[i][j] = b[i - 1][j];
					c[i][j] = "up";
				} else {//左边位置大于上边位置
					b[i][j] = b[i][j - 1];
					c[i][j] = "left";
				}
			}

		}
		//打印公共子序列的长度
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(b[i][j] + "\t");
			}
			System.out.println();
		}
		//打印回溯方向
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(c[i][j] + "\t");
			}
			System.out.println();
		}
		System.out.println("一个最长公共自序列为:");
		//注意这里是m-1,n-1
		getLCS(c, x, m-1, n-1);
	}

	static void getLCS(String[][] c, String[] x, int i, int j) {
		if (i == 0 || j == 0) {
			return;
		} 
		if (c[i][j] == "upleft") {
			getLCS(c, x, i - 1, j - 1);
			System.out.print(x[i - 1]);
		} else if (c[i][j] == "up") {
			getLCS(c, x, i - 1, j);
		} else {
			getLCS(c, x, i, j - 1);
		}
	}

}
