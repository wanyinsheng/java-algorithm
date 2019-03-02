package com.wanali.hash_table;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 两个数组的交集2
 * 
 * 给定两个数组，编写一个函数来计算它们的交集。
 * 
 * 输入: nums1 = [1,2,2,1], nums2 = [2,2] 输出: [2,2] 
 * 
 * 输入: nums1 = [4,9,5], nums2 = [9,4,9,8,4] 输出: [4,9]
 * 
 * @author wan_ys
 *
 *         2019年3月2日下午11:46:11
 */
public class Intersect {
	public static void main(String[] args) {
		System.out.println(Arrays.toString(intersect(new int[] { 1, 2, 2, 1 }, new int[] { 2, 2 })));
		System.out.println(Arrays.toString(intersect(new int[] { 4, 9, 5 }, new int[] { 9, 4, 9, 8, 4 })));
	}

	static int[] intersect(int[] nums1, int[] nums2) {
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		// 将nums2中的数字放入map中，键为数组中的数字，值为对应数字的个数
		for (int i : nums2) {
			if (map.containsKey(i)) {
				map.put(i, map.get(i) + 1);
			} else {
				map.put(i, 1);
			}
		}
		// 因为不知道交集数组的大小，因此需要设一个list先存放交集，最后再转为int数组
		List<Integer> list = new ArrayList<Integer>();
		for (Integer integer : nums1) {
			if (map.containsKey(integer)) {
				list.add(integer);// 将map中的键放进去，并且还需要对map该键对应的值减1
				map.put(integer, map.get(integer) - 1);
				// 如果某个键对应的值为0，应该将该键值对删除
				if (map.get(integer) == 0) {
					map.remove(integer);
				}
			}
		}
		int[] result = new int[list.size()];
		for (int i = 0; i < result.length; i++) {
			result[i] = list.get(i);
		}
		return result;
	}

}
