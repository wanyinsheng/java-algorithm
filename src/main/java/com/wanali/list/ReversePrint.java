package com.wanali.list;

import java.util.Arrays;
import java.util.Stack;

/**
 * 面试题06. 从尾到头打印链表
 * 
 * 输入一个链表的头节点，从尾到头反过来返回每个节点的值（用数组返回）。
 * 
 * 示例 1：
 * 
 * 输入：head = [1,3,2]
 * 
 * 输出：[2,3,1]
 * 
 * @author wanyinsheng
 *
 * @date 2020年4月9日下午11:18:05
 *
 */
public class ReversePrint {
	public static void main(String[] args) {
		ListNode head = new ListNode(1);
		head.next = new ListNode(3);
		head.next.next = new ListNode(2);
		System.out.println(Arrays.toString(reversePrint(head)));// [2,3,1]
	}

	static int[] reversePrint(ListNode head) {
		if (head == null) {
			return new int[0];
		}
		// 使用栈实现倒序
		Stack<ListNode> stack = new Stack<>();
		// 先将头入栈
		stack.push(head);
		int count = 1;
		// 链表不为空，继续入栈
		while (head.next != null) {
			head = head.next;
			stack.push(head);
			count++;
		}
		int[] result = new int[count];
		int i = 0;
		// 依次从栈中弹出放入数组
		while (!stack.isEmpty()) {
			result[i++] = stack.pop().val;
		}
		return result;
	}
}
