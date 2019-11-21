package com.wanali.tree;
/**
 * 101.对称二叉树
 * 给定一个二叉树，检查它是否是镜像对称的。
 *  1
   / \
  2   2
 / \ / \
3  4 4  3
是镜像对称的
 *  1
   / \
  2   2
   \   \
   3    3
   不是镜像对称的
 * @author wanyinsheng
 *
 * @date 2019年11月21日下午7:00:13
 *
 */
public class IsSymmetric {
	public static boolean isSymmetric(TreeNode root) {
		
		return isMirrors(root, root);
	}
	public static boolean isMirrors(TreeNode p1,TreeNode p2) {
		//根节点有相同的值
		if (p1==null&&p2==null) //两个子树都为空
			return true;
		if (p1==null||p2==null)//有一个为空是不可能对称的
			return false;
		//两个子树的左右子树相互对称
		return  p1.val==p2.val &&isMirrors(p1.left, p2.right) && isMirrors(p1.right, p2.left);//递归使用两个节点的值相同，并且两个树的左右子树分别是也是镜像对称的
			
		
	}
	public static void main(String[] args) {
		TreeNode root=new TreeNode(1);
		TreeNode treeNode1=new TreeNode(2);
		TreeNode treeNode2=new TreeNode(2);
		TreeNode treeNode3=new TreeNode(3);
		TreeNode treeNode4=new TreeNode(4);
		TreeNode treeNode5=new TreeNode(4);
		TreeNode treeNode6=new TreeNode(3);
		root.left=treeNode1;
		root.right=treeNode2;
		treeNode1.left=treeNode3;
		treeNode1.right=treeNode4;
		treeNode2.left=treeNode5;
		treeNode2.right=treeNode6;
		System.out.println(isSymmetric(root));
		
		TreeNode root1=root;
		root1.left=treeNode1;
		root.right=treeNode2;
		treeNode1.right=treeNode3;
		treeNode2.right=treeNode6;
		System.out.println(isSymmetric(root));

	}

}
