package com.wanali.tree;
/**
 * 965.单值二叉树
 * 如果二叉树每个节点都具有相同的值，那么该二叉树就是单值二叉树。

	只有给定的树是单值二叉树时，才返回 true；否则返回 false。
	
	输入：[1,1,1,1,1,null,1]
	输出：true
	输入：[2,2,2,5,2]
	输出：false
 * @author wanyinsheng
 *
 * @date 2019年11月21日下午11:22:11
 *
 */
public class IsUnivalTree {
	public static boolean isUnivalTree(TreeNode root) {
		//判断左孩子是否单值
		//左孩子为空，或者左孩子的值等于父节点并且左子树也是单值的
		boolean left=root.left==null||root.left.val==root.val&&(isUnivalTree(root.left));
		//判断有孩子是否单值
		//右孩子为空，或者右孩子的值与父节点的值相等并且右子树也是单值的
		boolean right=root.right==null||root.right.val==root.val&&isUnivalTree(root.right);
		//左子树与右子树都是单值树是这树才是单值树
		return left && right;

	}

	public static void main(String[] args) {
		TreeNode root = new TreeNode(2);
		TreeNode treeNode1 = new TreeNode(2);
		TreeNode treeNode2 = new TreeNode(2);
		TreeNode treeNode3 = new TreeNode(5);
		TreeNode treeNode4 = new TreeNode(2);
		root.left = treeNode1;
		root.right = treeNode2;
		treeNode1.left = treeNode3;
		treeNode1.right = treeNode4;
		System.out.println(isUnivalTree(root));
	}

}
