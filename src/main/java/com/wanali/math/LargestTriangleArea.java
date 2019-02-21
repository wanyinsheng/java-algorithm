package com.wanali.math;

/**
 * 最大三角形面积
 * 
 * 给定包含多个点的集合，从其中取三个点组成三角形，返回能组成的最大三角形的面积。
 * 
 * 输入: points = [[0,0],[0,1],[1,0],[0,2],[2,0]] 输出: 2 解释:
 * 这五个点如下图所示。组成的橙色三角形是最大的，面积为2。
 * 
 * @author wan_ys
 *
 *         2019年2月21日下午2:59:18
 */
public class LargestTriangleArea {
	public static void main(String[] args) {
		System.out.println(largestTriangleArea(new int[][] { { 0, 0 }, { 0, 1 }, { 1, 0 }, { 0, 2 }, { 2, 0 } }));
	}

	/**
	 * | 1  1  1 | 
	 * | x1 x2 x3| 
	 * | y1 y2 y3| 
	 * 面积=主对角线元素的乘积-负对角线元素的乘积
	 * 
	 * @param points
	 * @return
	 */
	static double largestTriangleArea(int[][] points) {
		float max = 0;
		float cur = 0;
		for (int i = 0; i < points.length; i++) {
			for (int j = 1; j < points.length; j++) {
				for (int k = 2; k < points.length; k++) {
					cur = points[i][0] * points[j][1] + points[j][0] * points[k][1] + points[k][0] * points[i][1]
							- points[k][0] * points[j][1] - points[j][0] * points[i][1] - points[i][0] * points[k][1];
					// 这里面积可能会算出来负数，即面积的相反数
					cur = Math.abs(cur);
					if (max < cur) {
						max = cur;
					}
				}
			}

		}
		return max / 2;
	}

}
