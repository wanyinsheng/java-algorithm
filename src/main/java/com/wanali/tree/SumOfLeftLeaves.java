package com.wanali.tree;
/**
 * 404.左叶子之和
 * 计算给定二叉树的所有左叶子之和
 *  3
   / \
  9  20
    /  \
   15   7
   在这个二叉树中，有两个左叶子，分别是 9 和 15，所以返回 24
 * @author wanyinsheng
 *
 * @date 2019年11月22日下午8:27:28
 *
 */
public class SumOfLeftLeaves {
	public static int sumOfLeftLeaves(TreeNode root) {
		if (root==null) {
			return 0;
		}
		int sum=0;
		TreeNode node=root;
		//加左分支
		if (isLeaves(node.left)) {//如果是叶子节点
			sum+=node.left.val;
		}else {
			sum+=sumOfLeftLeaves(node.left);
		}
		//加右分支
		sum+=sumOfLeftLeaves(node.right);
		return sum;
	}
	//判断是否是叶子节点
	public static boolean isLeaves(TreeNode node) {
		return node!=null&&node.left==null&&node.right==null;//该节点为空，并没有左右孩子
	}
	public static void main(String[] args) {
		TreeNode root=new TreeNode(3);
		TreeNode treeNode1=new TreeNode(9);
		TreeNode treeNode2 = new TreeNode(20);
		TreeNode treeNode3 = new TreeNode(15);
	    TreeNode treeNode4 = new TreeNode(7);
	    root.left=treeNode1;
	    root.right=treeNode2;
	    treeNode2.left=treeNode3;
	    treeNode2.right=treeNode4;
	    System.out.println(sumOfLeftLeaves(root));
	}

}
