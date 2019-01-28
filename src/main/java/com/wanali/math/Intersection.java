package com.wanali.math;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * 两个数组的交集 
 * 给定两个数组，编写一个函数来计算它们的交集。
 * 输入: nums1 = [1,2,2,1], nums2 = [2,2] 输出: [2]
 * 输入: nums1 = [4,9,5], nums2 = [9,4,9,8,4] 输出: [9,4]
 * 
 * @author wan_ys
 *
 * 2019年1月28日上午11:38:15
 */
public class Intersection {
	public static void main(String[] args) {
		int[] nums1 = new int[] { 1, 2, 2, 1 };
		int[] nums2 = new int[] { 2, 2 };
		System.out.println(Arrays.toString(intersectionSet(nums1, nums2)));
		int[] nums3 = new int[] { 4, 9, 5 };
		int[] nums4 = new int[] { 9, 4, 9, 8, 4 };
		System.out.println(Arrays.toString(intersectionSet(nums3, nums4)));
	}

	/**
	 * 利用set求交集
	 * 
	 * @param nums1
	 * @param nums2
	 * @return
	 */
	static int[] intersectionSet(int[] nums1, int[] nums2) {
		Set<Integer> set = new HashSet<Integer>();
		Set<Integer> result = new HashSet<Integer>();
		// 去除nums1中重复元素
		for (int i = 0; i < nums1.length; i++) {
			set.add(nums1[i]);
		}
		for (int i = 0; i < nums2.length; i++) {
			if (set.contains(nums2[i])) { // 求交集并放入新的集合
				result.add(nums2[i]);
			}
		}
		// 将集合转换为int数组
		int[] nums = new int[result.size()];
		int index = 0;
		Iterator<Integer> iterator = result.iterator();
		while (iterator.hasNext()) {
			nums[index++] = (Integer) iterator.next();
		}
		return nums;
	}
}
