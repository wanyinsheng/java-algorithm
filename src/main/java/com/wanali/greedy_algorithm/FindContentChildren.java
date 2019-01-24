package com.wanali.greedy_algorithm;

import java.util.Arrays;

/**
 * 分发饼干 
 * 假设你是一位很棒的家长，想要给你的孩子们一些小饼干。但是，每个孩子最多只能给一块饼干。对每个孩子 i ，都有一个胃口值 gi
 * ，这是能让孩子们满足胃口的饼干的最小尺寸；并且每块饼干 j ，都有一个尺寸 sj 。如果 sj >= gi ，我们可以将这个饼干 j 分配给孩子 i
 * ，这个孩子会得到满足。你的目标是尽可能满足越多数量的孩子，并输出这个最大数值。
 * 输入: [1,2,3], [1,1]  输出: 1
 * 输入: [1,2], [1,2,3] 输出: 2
 * @author wan_ys
 *
 *  2019年1月24日下午6:36:42
 */
public class FindContentChildren {
	public static void main(String[] args) {
		int[] g = new int[] { 1, 2, 3 };
		int[] s = new int[] { 1, 1 };
		System.out.println(findContentChildren(g, s));
		int[] g1 = new int[] { 1, 2 };
		int[] s1 = new int[] { 1, 2, 3 };
		System.out.println(findContentChildren(g1, s1));
	}

	/**
	 * 贪心算法，用尽量小的饼干满足胃口较小的孩子
	 * @param g
	 * @param s
	 * @return
	 */
	static int findContentChildren(int[] g, int[] s) {
		// 对孩子和饼干从小到大排序
		Arrays.sort(g);
		Arrays.sort(s);
		int child = 0;
		int cookie = 0;
		// 当所有孩子都分发到饼干或者所有的饼干都分发完就结束遍历
		while (child < g.length && cookie < s.length) {
			// 如果孩子的胃口小于饼干大小，就分发给该孩子，否则，该饼干无法满足该孩子之后的所有孩子
			if (g[child] <= s[cookie]) {
				child++;
			}
			cookie++;
		}
		return child;
	}

}
