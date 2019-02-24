package com.wanali.math;

import java.util.Arrays;

/**
 * 矩形面积
 * 
 * 在二维平面上计算出两个由直线构成的矩形重叠后形成的总面积。 
 * 输入: -3, 0, 3, 4, 0, -1, 9, 2 输出: 45
 * 
 * @author wan_ys
 *
 *         2019年2月24日下午10:41:13
 */
public class ComputeArea {
	public static void main(String[] args) {
		System.out.println(computeArea(-3, 0, 3, 4, 0, -1, 9, 2));
	}

	static int computeArea(int A, int B, int C, int D, int E, int F, int G, int H) {
		int width = 0;
		int height = 0;
		// 求公共面积
		int overArea = 0;
		if (E > C || A > G || B > H || F > D) {// 右边一个矩形的左边>左边矩形的右边||上边矩形的下边>下边矩形的上边,这两种情况下没有交集
			overArea = width * height;
		} else {
			int[] allWidth = new int[] { A, C, E, G };
			int[] allHeight = new int[] { B, D, F, H };
			Arrays.sort(allWidth);
			Arrays.sort(allHeight);
			// 有交集的情况就是对所有的x，y分别排序后取中间两个元素的差作为宽和高
			width = allWidth[2] - allWidth[1];
			height = allHeight[2] - allHeight[1];
			overArea = width * height;
		}
		int[] allWidth = new int[] { A, C, E, G };
		int[] allHeight = new int[] { B, D, F, H };
		Arrays.sort(allWidth);
		Arrays.sort(allHeight);
		width = allWidth[2] - allWidth[1];
		height = allHeight[2] - allHeight[1];
		int aArea = Math.abs(A - C) * Math.abs(B - D);// 第一个矩形的面积
		int bArea = Math.abs(E - G) * Math.abs(F - H);// 第二个矩形的面积
		// 所求面积之和（先减去重叠部分的，防止溢出）
		return aArea - overArea + bArea;
	}

}
