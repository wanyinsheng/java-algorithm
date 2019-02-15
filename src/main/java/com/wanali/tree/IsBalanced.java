package com.wanali.tree;
/**
 * 平衡二叉树
 * 
 * 给定一个二叉树，判断它是否是高度平衡的二叉树。

本题中，一棵高度平衡二叉树定义为：

一个二叉树每个节点 的左右两个子树的高度差的绝对值不超过1。

示例 1:

给定二叉树 [3,9,20,null,null,15,7]

    3
   / \
  9  20
    /  \
   15   7
返回 true 。

示例 2:

给定二叉树 [1,2,2,3,3,null,null,4,4]

       1
      / \
     2   2
    / \
   3   3
  / \
 4   4
返回 false 。
 * @author wan_ys
 *
 * 2019年2月15日下午11:03:36
 */
public class IsBalanced {
	public static void main(String[] args) {
		TreeNode treeNode1=new TreeNode(3);
		TreeNode treeNode2=new TreeNode(9);
		TreeNode treeNode3=new TreeNode(20);
		TreeNode treeNode4=new TreeNode(15);
		TreeNode treeNode5=new TreeNode(7);
		treeNode1.left=treeNode2;
		treeNode1.right=treeNode3;
		treeNode3.left=treeNode4;
		treeNode3.right=treeNode5;
		System.out.println(isBalanced(treeNode1));
		
	}
	static boolean isBalanced(TreeNode root) {
		if (root==null) {//空树是平衡树
			return true;
		}
		if (Math.abs(high(root.left)-high(root.right))>1) {
			return false;
		}else {
			return isBalanced(root.left)&&isBalanced(root.right);
		}
	}
	/**
	 * 计算树高
	 * @param root
	 * @return
	 */
	static int high(TreeNode root) {
		if (root==null) {
			return 0;
		}
		int left=high(root.left);
		int right=high(root.right);
		return Math.max(left, right)+1;
	}

}
