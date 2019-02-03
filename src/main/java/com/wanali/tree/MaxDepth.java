package com.wanali.tree;

/**
 * 二叉树的最大深度
 * 给定一个二叉树，找出其最大深度。
 * 
 * 二叉树的深度为根节点到最远叶子节点的最长路径上的节点数。
 * 
 * 说明: 叶子节点是指没有子节点的节点。
 * 
 * 给定二叉树 [3,9,20,null,null,15,7]，
 *        3
 *       / \
 *      9  20
 *         / \
 *        15  7
 * 返回它的最大深度 3 。
 * 
 * @author wan_ys
 *
 *         2019年2月3日下午10:10:29
 */
public class MaxDepth {
	public static void main(String[] args) {
		TreeNode treeNode = new TreeNode(3);
		treeNode.left = new TreeNode(9);
		treeNode.right = new TreeNode(20);
		treeNode.right.left = new TreeNode(15);
		treeNode.right.right = new TreeNode(7);
		TreeNode root = treeNode;
		System.out.println(maxDepth(root));
	}

	/**
	 * 递归(深度优先搜索)
	 * 
	 * @param root
	 * @return
	 */
	static int maxDepth(TreeNode root) {
		if (root == null) {
			return 0;
		} else {
			int leftHeight = maxDepth(root.left);
			int rightHeight = maxDepth(root.right);
			return Math.max(leftHeight, rightHeight) + 1;
		}
	}

}

class TreeNode {
	int val;
	TreeNode left;
	TreeNode right;
	TreeNode(int x) {
		val = x;
	}
}
