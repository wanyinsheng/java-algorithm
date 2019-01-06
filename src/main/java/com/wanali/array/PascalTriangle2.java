package com.wanali.array;

import java.util.ArrayList;
import java.util.List;

/**
 * 给定一个非负索引 k，其中 k ≤ 33，返回杨辉三角的第 k 行。 
 * 输入: 3 输出: [1,3,3,1]
 * 
 * @author wan_ys
 *
 * 2019年1月6日下午4:31:21
 */
public class PascalTriangle2 {
	public static void main(String[] args) {
		int rowIndex = 3;
		System.out.println(getRow(rowIndex));
	}

	static List<Integer> getRow(int rowIndex) {
		//定义存放该行元素的list
		List<Integer> list = new ArrayList<Integer>();
		int[][] array = new int[rowIndex + 1][rowIndex + 1];
		for (int i = 0; i <= rowIndex; i++) {
			for (int j = 0; j <= i; j++) {
				//将该数组的第一列和主对角线上的元素置为1
				if (j == 0 || j == i) {
					array[i][j] = 1;
				} else {
					//其他位置的元素为该位置左上和顶上的元素之和
					array[i][j] = array[i - 1][j - 1] + array[i - 1][j];
				}
			}
		}
		//将该行的元素添加到list
		for (int i = 0; i <= rowIndex; i++) {
			list.add(array[rowIndex][i]);
		}
		return list;
	}

}
