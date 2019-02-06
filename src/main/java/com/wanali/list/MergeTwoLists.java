package com.wanali.list;

/**
 * 合并两个有序链表
 * 将两个有序链表合并为一个新的有序链表并返回。新链表是通过拼接给定的两个链表的所有节点组成的。
 * 
 * 输入：1->2->4, 1->3->4 输出：1->1->2->3->4->4
 * 
 * @author wan_ys
 *
 *         2019年2月6日上午11:23:52
 */
public class MergeTwoLists {
	public static void main(String[] args) {

	}

	/**
	 * 其实就是归并排序的合并过程
	 * 
	 * @param l1
	 * @param l2
	 * @return
	 */
	static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
		ListNode head = new ListNode(0);
		ListNode current = head;
		while (l1 != null && l2 != null) {
			if (l1.val <= l2.val) {
				current.next = l1;
				current = current.next;
				l1 = l1.next;
			} else {
				current.next = l2;
				current = current.next;
				l2 = l2.next;
			}
		}
		// 当其中的一个链表为空时，直接将另一个链表的值添加过来就可以了
		if (l1 == null) {
			current.next = l2;
		}
		if (l2 == null) {
			current.next = l1;
		}
		return head.next;
	}

}
