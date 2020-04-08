package com.wanali.array;

/**
 * 1395. 统计作战单位数
 * 
 * n 名士兵站成一排。每个士兵都有一个 独一无二 的评分 rating 。
 * 
 * 每 3 个士兵可以组成一个作战单位，分组规则如下：
 * 
 * 从队伍中选出下标分别为 i、j、k 的 3 名士兵，他们的评分分别为 rating[i]、rating[j]、rating[k] 作战单位需满足：
 * rating[i] < rating[j] < rating[k] 或者 rating[i] > rating[j] > rating[k] ，其中 
 * 0 <= i < j < k < n
 * 
 * 示例1：
 * 
 * 输入：rating = [2,5,3,4,1] 输出：3 解释：我们可以组建三个作战单位 (2,3,4)、(5,4,1)、(5,3,1) 。
 * 
 * 示例2：
 * 
 * 输入：rating = [2,1,3] 输出：0 解释：根据题目条件，我们无法组建作战单位。
 * 
 * 示例3：
 * 
 * 输入：rating = [1,2,3,4] 输出：4
 * 
 * @author wanyinsheng
 *
 * @date 2020年4月8日下午11:25:34
 *
 */
public class NumTeams {
	public static void main(String[] args) {
		System.out.println(numTeams(new int[] { 2, 5, 3, 4, 1 }));// 3
		System.out.println(numTeams(new int[] { 2, 1, 3 }));// 0
		System.out.println(numTeams(new int[] { 1, 2, 3, 4 }));// 4

	}

	static int numTeams(int[] rating) {
		int count = 0;
		// 分为两种情况：1.从大到小；2.从小到大
		for (int j = 1; j < rating.length - 1; j++) {// 中间士兵从1到len-2
			for (int i = 0; i < j; i++) {
				// i的数大于j的数，则k的数应小于j的数
				if (rating[i] > rating[j]) {
					for (int k = rating.length - 1; k > j; k--) {
						if (rating[j] > rating[k]) {
							count++;
						}
					}
				} else if (rating[i] < rating[j]) {// i的数小于j的数，则k的数大于j的数
					for (int k = rating.length - 1; k > j; k--) {
						if (rating[j] < rating[k]) {
							count++;
						}
					}
				}

			}
		}
		return count;
	}
}
