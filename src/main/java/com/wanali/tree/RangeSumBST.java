package com.wanali.tree;

/**
 * 二叉搜索树的范围和
 * 
 * 给定二叉搜索树的根结点 root，返回 L 和 R（含）之间的所有结点的值的和。
 * 
 * 二叉搜索树保证具有唯一的值。
 * 
 * 输入：root = [10,5,15,3,7,null,18], L = 7, R = 15 输出：32 
 * 
 * 输入：root = [10,5,15,3,7,13,18,1,null,6], L = 6, R = 10 输出：23
 * 
 * @author wan_ys
 *
 *         2019年2月25日上午10:23:56
 */
public class RangeSumBST {
	public static void main(String[] args) {
		TreeNode root = new TreeNode(10);
		root.left = new TreeNode(5);
		root.right = new TreeNode(15);
		root.left.left = new TreeNode(3);
		root.left.right = new TreeNode(7);
		root.right.right = new TreeNode(18);
		System.out.println(rangeSumBST(root, 7, 15));
	}

	/**
	 * 递归
	 * 
	 * @param root
	 * @param L
	 * @param R
	 * @return
	 */
	static int rangeSumBST(TreeNode root, int L, int R) {
		if (root == null) {
			return 0;
		}
		int sum = 0;
		if (root.val > L)// 递归左节点
			sum += rangeSumBST(root.left, L, R);
		if (root.val < R)// 递归右节点
			sum += rangeSumBST(root.right, L, R);
		if (root.val >= L && root.val <= R)// 取节点值
			sum += root.val;//
		return sum;
	}

}
