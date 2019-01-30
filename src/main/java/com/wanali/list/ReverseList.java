package com.wanali.list;

/**
 * 反转链表 
 * 反转一个单链表。 
 * 输入: 1->2->3->4->5->NULL 
 * 输出: 5->4->3->2->1->NULL
 */
public class ReverseList {
	public static void main(String[] args) {
		
	}

	static ListNode reverseList(ListNode head) {
		if (head == null || head.next == null) {
			return head;
		}
		ListNode pListNode = head.next;
		ListNode reverseList = reverseList(pListNode);
		head.next = null;
		pListNode.next = head;
		return reverseList;
	}
}

class ListNode {
	int val;
	ListNode next;

	ListNode(int x) {
		val = x;
	}
}
