package com.wanali.tree;
/**
 * 235.二叉搜索树的最近公共祖先
 * 给定一个二叉搜索树, 找到该树中两个指定节点的最近公共祖先。

百度百科中最近公共祖先的定义为：“对于有根树 T 的两个结点 p、q，最近公共祖先表示为一个结点 x，满足 x 是 p、q 的祖先且 x 的深度尽可能大（一个节点也可以是它自己的祖先）。”

例如，给定如下二叉搜索树:  root = [6,2,8,0,4,7,9,null,null,3,5]


 *              6
 *             / \
 *            2   8
 *           / \ / \
 *          0  4 7 9
 *            / \
 *           3   5
 *        
 * 输入: root = [6,2,8,0,4,7,9,null,null,3,5], p = 2, q = 8
       输出: 6 
       解释: 节点 2 和节点 8 的最近公共祖先是 6。

       输入: root = [6,2,8,0,4,7,9,null,null,3,5], p = 2, q = 4
      输出: 2
      解释: 节点 2 和节点 4 的最近公共祖先是 2, 因为根据定义最近公共祖先节点可以为节点本身。


 * @author wanyinsheng
 *
 * @date 2019年11月20日下午8:18:58
 *
 */
public class LowestCommonAncestor {
	public static TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
		if (root==null) {
			return root;
		}
		if (root.val>p.val&&root.val>q.val) {//根节点比这两个节点的值都大
			return lowestCommonAncestor(root.left, p, q);
		}
		if (root.val<p.val&&root.val<q.val) {
			return lowestCommonAncestor(root.right, p, q);
		}
		return root;
	}
	public static void main(String[] args) {
		TreeNode root=new TreeNode(6);
		TreeNode treeNode1=new TreeNode(2);
		TreeNode treeNode2=new TreeNode(8);
		TreeNode treeNode3 =new TreeNode(0);
		TreeNode treeNode4 =new TreeNode(4);
		TreeNode treeNode5 =new TreeNode(7);
		TreeNode treeNode6 =new TreeNode(9);
		TreeNode treeNode7 =new TreeNode(3);
		TreeNode treeNode8 =new TreeNode(5);
		root.left=treeNode1;
		root.right=treeNode2;
		treeNode1.left=treeNode3;
		treeNode1.right=treeNode4;
		treeNode2.left=treeNode5;
		treeNode2.right=treeNode6;
		treeNode4.left=treeNode7;
		treeNode4.right=treeNode8;
		TreeNode p=treeNode1;
		TreeNode q=treeNode2;
		System.out.println(lowestCommonAncestor(root, p, q).val);
		
		TreeNode p1=treeNode1;
		TreeNode q1=treeNode4;
		System.out.println(lowestCommonAncestor(root, p1, q1).val);
		
	}
	

}
