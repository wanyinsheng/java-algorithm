package com.wanali.math;

import java.util.Arrays;

/**
 * 我们有一个由平面上的点组成的列表 points。需要从中找出 K 个距离原点 (0, 0) 最近的点。
 * 
 * （这里，平面上两点之间的距离是欧几里德距离。）
 * 
 * 你可以按任何顺序返回答案。除了点坐标的顺序之外，答案确保是唯一的。
 * 
 * 输入：points = [[1,3],[-2,2]], K = 1 输出：[[-2,2]] 解释： (1, 3) 和原点之间的距离为 sqrt(10)，
 * (-2, 2) 和原点之间的距离为 sqrt(8)， 由于 sqrt(8) < sqrt(10)，(-2, 2) 离原点更近。 我们只需要距离原点最近的
 * K = 1 个点，所以答案就是 [[-2,2]]。
 * 
 * 输入：points = [[3,3],[5,-1],[-2,4]], K = 2 输出：[[3,3],[-2,4]] （答案 [[-2,4],[3,3]]
 * 也会被接受。）
 * 
 * @author wan_ys
 *
 *         2019年2月20日下午2:29:58
 */
public class KClosest {
	public static void main(String[] args) {
		
	}

	static int[][] kClosest(int[][] points, int k) {
		int[][] result = new int[k][2];// 存放k个点的矩阵
		int[] dis = new int[points.length];// 对应points各个点的距离
		// 求每个点距离原点的平方和
		for (int i = 0; i < dis.length; i++) {
			dis[i] = distance(points[i]);
		}
		Arrays.sort(dis);
		int dist = dis[k - 1];// 第k个点的距离平方和
		int count = 0;
		// 将小于dist的都添加到result数组中
		for (int i = 0; i < dis.length; i++) {
			if (distance(points[i]) <= dist) {
				result[count++] = points[i];
			}
		}
		return result;
	}

	/**
	 * 求该点到原点的平方和
	 * 
	 * @param point
	 * @return
	 */
	static int distance(int[] point) {
		return point[0] * point[0] + point[1] * point[1];

	}

}
