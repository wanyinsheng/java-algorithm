package com.wanali.greedy_algorithm;

/**
 * 删列造序
 * 
 * 给定由 N 个小写字母字符串组成的数组 A，其中每个字符串长度相等。
 * 
 * 选取一个删除索引序列，对于 A 中的每个字符串，删除对应每个索引处的字符。 所余下的字符串行从上往下读形成列。
 * 
 * 比如，有 A = ["abcdef", "uvwxyz"]，删除索引序列 {0, 2, 3}，删除后 A 为["bef", "vyz"]， A
 * 的列分别为["b","v"], ["e","y"], ["f","z"]。（形式上，第 n 列为 [A[0][n], A[1][n], ...,
 * A[A.length-1][n]]）。
 * 
 * 假设，我们选择了一组删除索引 D，那么在执行删除操作之后，A 中所剩余的每一列都必须是 非降序 排列的，然后请你返回 D.length 的最小可能值。
 * 
 * 输入：["cba", "daf", "ghi"] 输出：1 解释： 当选择 D = {1}，删除后 A 的列为：["c","d","g"] 和
 * ["a","f","i"]，均为非降序排列。 若选择 D = {}，那么 A 的列 ["b","a","h"] 就不是非降序排列了。 
 * 
 * 输入：["a", "b"] 输出：0 解释：D = {} 
 * 
 * 输入：["zyx", "wvu", "tsr"] 输出：3 解释：D = {0, 1, 2}
 * 
 * @author wan_ys
 *
 *         2019年2月19日下午9:39:20
 */
public class MinDeletionSize {
	public static void main(String[] args) {
		System.out.println(minDeletionSize(new String[] { "cba", "daf", "ghi" }));
		System.out.println(minDeletionSize(new String[] { "a", "b" }));
		System.out.println(minDeletionSize(new String[] { "zyx", "wvu", "tsr" }));
	}

	static int minDeletionSize(String[] A) {
		int count = 0;// 计算需要删除的列
		int len = A[0].length();// 每个字符串的长度,每个字符串的长度是相等的
		for (int i = 0; i < len; i++) {//第i个索引
			for (int j = 0; j < A.length - 1; j++) {//第j个数组
				if (A[j].charAt(i) > A[j + 1].charAt(i)) {//第j和第j+1个数组的第i个索引为降序的时候，这一列就应该删除，因此count+1
					count++;
					break;
				}
			}
		}
		return count;
	}

}
