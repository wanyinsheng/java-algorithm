package com.wanali.tree;

/**
 * 相同的树
 * 给定两个二叉树，编写一个函数来检验它们是否相同。
 * 
 * 如果两个树在结构上相同，并且节点具有相同的值，则认为它们是相同的。
 * 		1          1
 *     / \        / \ 
 *    2   3      2   3
 * 返回true
 *      1          1
 *     / \        / \
 *    2   1      2   1
 * 返回false
 * @author wan_ys
 *
 *         2019年2月6日下午6:56:41
 */
public class IsSameTree {
	public static void main(String[] args) {

	}

	/**
	 * 递归实现
	 * 
	 * @param p
	 * @param q
	 * @return
	 */
	static boolean isSameTree(TreeNode p, TreeNode q) {
		if (p == null && q == null) {
			return true;
		}
		if (p == null && q != null) {
			return false;
		}
		if (p != null && q == null) {
			return false;
		}
		return p.val == q.val && isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
	}

}
