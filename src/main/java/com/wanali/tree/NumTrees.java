package com.wanali.tree;
/**
 * 96.不同的二叉搜索树
 * 
 * 给定一个整数 n，求以 1 ... n 为节点组成的二叉搜索树有多少种？
 * 
 * 输入：3 输出：5
 * 方法：动态规划
 * 
 * result[i]表示的是n个节点的不同二叉搜索树的个数
 * https://leetcode-cn.com/problems/unique-binary-search-trees/solution/bu-tong-de-er-cha-sou-suo-shu-by-leetcode/
 * 
 * @author wanyinsheng
 *
 * @date 2019年11月21日下午9:50:46
 *
 */
public class NumTrees {
	public static int numTrees(int n) {
		int[] result=new int[n+1];
		result[0]=1;
		result[1]=1;
		for (int i = 2; i <=n; i++) {
			for (int j = 1; j <= i; j++) {
				result[i]+=result[j-1]*result[i-j];
			}
		}
		return result[n];
	}
	public static void main(String[] args) {
		System.out.println(numTrees(3));
	}

}
