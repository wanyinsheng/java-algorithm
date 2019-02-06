package com.wanali.list;

/**
 * 环形链表
 * 
 * 给定一个链表，判断链表中是否有环。
 * 
 * 为了表示给定链表中的环，我们使用整数 pos 来表示链表尾连接到链表中的位置（索引从 0 开始）。 如果 pos 是 -1，则在该链表中没有环。
 * 
 * 输入：head = [3,2,0,-4], pos = 1 输出：true 
 * 输入：head = [1,2], pos = 0 输出：true
 * 输入：head = [1], pos = -1 输出：false
 * 
 * @author wan_ys
 *
 *         2019年2月6日上午11:52:39
 */
public class HasCycle {
	public static void main(String[] args) {

	}

	/**
	 * 双指针法 
	 * 定义快慢指针，如果快指针追上慢指针就说明有环
	 * 
	 * @param head
	 * @return
	 */
	static boolean hasCycle(ListNode head) {
		if (head == null || head.next == null) {
			return false;
		}
		// 定义两个快满足指针
		ListNode slow = head;
		ListNode fast = head.next;
		while (slow != fast) {
			// 快指针走的快，如果快指针为空或者没有后继元素则就没有环
			if (fast == null || fast.next == null) {
				return false;
			}
			slow = slow.next;// 慢指针走一步
			fast = fast.next.next;// 块指针走两步
		}
		return true;

	}

}
