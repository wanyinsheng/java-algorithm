package com.wanali.array;

import java.util.HashSet;
import java.util.Set;
/**
 * 1252.奇数值单元格数目
 * 给你一个 n 行 m 列的矩阵，最开始的时候，每个单元格中的值都是 0。

另有一个索引数组 indices，indices[i] = [ri, ci] 中的 ri 和 ci 分别表示指定的行和列（从 0 开始编号）。

你需要将每对 [ri, ci] 指定的行和列上的所有单元格的值加 1。

请你在执行完所有 indices 指定的增量操作后，返回矩阵中 「奇数值单元格」 的数目。

输入：n = 2, m = 3, indices = [[0,1],[1,1]]
输出：6
解释：最开始的矩阵是 [[0,0,0],[0,0,0]]。
第一次增量操作后得到 [[1,2,1],[0,1,0]]。
最后的矩阵是 [[1,3,1],[1,3,1]]，里面有 6 个奇数

输入：n = 2, m = 2, indices = [[1,1],[0,0]]
输出：0
解释：最后的矩阵是 [[2,2],[2,2]]，里面没有奇数。
 * @author wanyinsheng
 *
 * @date 2019年11月22日下午10:05:16
 *
 */
public class OddCells {
	public static int oddCells(int n, int m, int[][] indices) {
		Set<Integer> rowSet=new HashSet<Integer>();
		Set<Integer> colSet=new HashSet<Integer>();
		//计算有效操作的行数
		for (int i = 0; i < indices.length; i++) {
			if (rowSet.contains(indices[i][0])) {
				rowSet.remove(indices[i][0]);//该对应的行号已经出现过一次了，这次出现又变成了偶数
			}else {
				rowSet.add(indices[i][0]);
			}
			
		}
		//计算有效操作的列数
		for (int i = 0; i < indices.length; i++) {
			if (colSet.contains(indices[i][1])) {
				colSet.remove(indices[i][1]);//该对应的列号已经出现过一次了，这次出现又变成了偶数
			}else {
				colSet.add(indices[i][1]);
			}
			
		}
		int row=rowSet.size();
		int col=colSet.size();
		//System.out.println(row+"  "+col);//实际有效变化的行数与列数
		return row*m+col*n-2*row*col;//行与列都发生变化的位置除外，这些位置都是偶次变化
		
	}
	public static void main(String[] args) {
		System.out.println(oddCells(2, 3, new int[][] {{0,1},{1,1}}));
		System.out.println(oddCells(2, 2, new int[][] {{1,1},{0,0}}));
		
	}

}
