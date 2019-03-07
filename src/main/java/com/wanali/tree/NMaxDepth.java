package com.wanali.tree;

import java.util.List;

/**
 * N叉树的最大深度
 * 
 * 给定一个 N 叉树，找到其最大深度。
 * 
 * 最大深度是指从根节点到最远叶子节点的最长路径上的节点总数。
 *        1
 *      / | \
 *     3  2  4
 *    / \
 *   5   6
 *   该三叉树的组大深度为3
 * 
 * @author wan_ys
 *
 *         2019年3月7日下午11:06:25
 */
public class NMaxDepth {
	public static void main(String[] args) {

	}

	/**
	 * 递归
	 * 
	 * @param root
	 * @return
	 */
	static int maxDepth(NNode root) {
		if (root == null) {
			return 0;
		}
		int depth = 1;//有根节点，因此深度先设为1
		for (NNode node : root.children) {//依次遍历找儿子节点的最大深度
			depth = Math.max(maxDepth(node) + 1, depth);
		}
		return depth;
	}

}

class NNode {
	public NNode node;
	public int val;
	public List<NNode> children;

	public NNode() {
	}

	public NNode(int _val, List<NNode> _children) {
		val = _val;
		children = _children;
	}
}
