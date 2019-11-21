package com.wanali.tree;
/**
 * 226.翻转二叉树
 * 翻转一棵二叉树
  输入：
     4
   /   \
  2     7
 / \   / \
1   3 6   9
输出：
	 4
   /   \
  7     2
 / \   / \
9   6 3   1
 * 
 * @author wanyinsheng
 *
 * @date 2019年11月21日下午10:27:23
 *
 */
public class InvertTree {
	public static TreeNode invertTree(TreeNode root) {
		if (root==null) {
			return null;
		}
		//反转左右子树
		TreeNode left=invertTree(root.left);
		TreeNode right=invertTree(root.right);
		//交换左右子树
		root.left=right;
		root.right=left;
		return root;
	}
	public static void main(String[] args) {
		
	}

}
