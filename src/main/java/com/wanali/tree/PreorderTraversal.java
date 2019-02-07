package com.wanali.tree;

import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
/**
 * 二叉树的前序遍历
 * 
 * 给定一个二叉树，返回它的 前序 遍历
 * 输入: [1,null,2,3]  
   1
    \
     2
    /
   3 

输出: [1,2,3]
 * @author wan_ys
 *
 * 2019年2月7日下午2:41:58
 */
public class PreorderTraversal {
	public static void main(String[] args) {
		TreeNode n1 = new TreeNode(1);
        TreeNode n2 = new TreeNode(2);
        TreeNode n3 = new TreeNode(3);

        n1.left = n2;
        n1.right = n3;
        System.out.println(preorderTraversal(n1));
	}
	static List<Integer> preorderTraversal(TreeNode root){
		 List<Integer> result = new LinkedList<Integer>();

	        if (root != null) {
	            Deque<TreeNode> stack = new LinkedList<TreeNode>();
	            stack.add(root);

	            while (!stack.isEmpty()) {
	                TreeNode node = stack.removeLast();
	                result.add(node.val);

	                if (node.right != null) {
	                    stack.add(node.right);
	                }
	                if (node.left != null) {
	                    stack.add(node.left);
	                }
	            }
	        }

	        return result;
	}
	

}
