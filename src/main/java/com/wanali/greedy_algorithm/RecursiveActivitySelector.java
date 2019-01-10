package com.wanali.greedy_algorithm;

import java.util.ArrayList;
import java.util.List;
/**
 * 活动选择问题(贪心算法-递归实现)
 * 在每一步做出当前看来最好的选择，即做出局部最优选择，该算法找到的解不一定是最优解
 * @author wan_ys
 *
 * 2019年1月10日下午3:30:16
 */
public class RecursiveActivitySelector {
	public static void main(String[] args) {
		int[] s = new int[] { 1, 3, 0, 5, 3, 5, 6, 8, 8, 2, 12 };
		int[] f = new int[] { 4, 5, 6, 7, 9, 9, 10, 11, 12, 14, 16 };
		System.out.println(acivitySelector(s, f, 0, s.length - 1));
	}
	//定义一个list用于存放已选的活动
	static List<Integer> list = new ArrayList<Integer>();
	/**
	 * 
	 * @param s 活动开始时间 
	 * @param f 活动结束时间
	 * @param i 在贪心算法选择了第i个活动之后，从第i个活动之后继续找合适的
	 * @param n 最后一个活动的下标位置
	 * @return
	 */
	static List<Integer> acivitySelector(int[] s, int[] f, int i, int n) {
		// 假设活动的结束时间已经从小到大排好
		if (i==0) {//根据贪心算法的贪心选择性质，肯定会选择第一个活动
			list.add(i+1);
		}
		//往后找f[i]<=s[j]的活动
		int j = i + 1;
		//没有找到满足f[i]<=s[j]的活动
		while (j <= n && f[i] > s[j]) {
			j++;
		}
		//找到一个满足f[i]<=s[j]的活动，添加到list
		if (j <= n) {
			list.add(j + 1);//j+1对应活动的编号
			acivitySelector(s, f, j, n);//继续向后找满足条件的活动，递归实现
		}
		return list;
	}

}
