package com.wanali.tree;

import java.util.LinkedList;
import java.util.List;
import java.util.Stack;
/**
 * 二叉树的中序遍历
 * 给定一个二叉树，返回它的中序 遍历。
 *  输入: [1,null,2,3]
   1
    \
     2
    /
   3

输出: [1,3,2]
 * @author wan_ys
 *
 * 2019年2月7日下午1:03:49
 */
public class InorderTraversal {
	public static void main(String[] args) {
		TreeNode n1 = new TreeNode(1);
        TreeNode n2 = new TreeNode(2);
        TreeNode n3 = new TreeNode(3);

        n1.left = n2;
        n1.right = n3;
        
        System.err.println(inorderTraversal(n1));
	}

	static List<Integer> inorderTraversal(TreeNode root) {
		List<Integer> list = new LinkedList<Integer>();
		Stack<TreeNode> stack = new Stack<TreeNode>();
		while (root != null || !stack.isEmpty()) {//节点不为空或者栈不为空
			if (root != null) {
				stack.push(root);
				root = root.left;
			} else {
				root = stack.pop();
				list.add(root.val);
				root = root.right;
			}
		}
		return list;
	}
}
