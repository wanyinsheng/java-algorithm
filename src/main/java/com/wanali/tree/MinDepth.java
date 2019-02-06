package com.wanali.tree;

/**
 * 二叉树的最小深度 
 * 给定一个二叉树，找出其最小深度。
 * 
 * 最小深度是从根节点到最近叶子节点的最短路径上的节点数量。
 * 
 * 说明: 叶子节点是指没有子节点的节点。 
 *  3
   / \
  9  20
    /  \
   15   7
 * 
 * @author wan_ys
 *
 *         2019年2月6日下午7:24:34
 */
public class MinDepth {
	public static void main(String[] args) {

	}

	/**
	 * 递归实现
	 * 最小深度一定在飞空子树中产生，如果左子树为空，就将左子树的最小深度置为无穷
	 * 
	 * @param root
	 * @return
	 */
	static int minDepth(TreeNode root) {
		if (root == null) {
			return 0;
		}
		if (root.left == null && root.right == null) {
			return 1;
		}
		int left;//定义左子树的深度
		if (root.left != null) {
			left = minDepth(root.left);
		} else {
			left = Integer.MAX_VALUE;
		}
		int right;//定义右子树的深度
		if (root.right != null) {
			right = minDepth(root.right);
		} else {
			right = Integer.MAX_VALUE;
		}

		return Math.min(left, right) + 1;
	}

}
