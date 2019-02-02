package com.wanali.array;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/**
 * 求众数2 
 * 给定一个大小为 n 的数组，找出其中所有出现超过 ⌊ n/3 ⌋ 次的元素 
 * 
 * 输入: [3,2,3] 输出: [3] 
 * 
 * 输入: [1,1,1,3,3,2,2,2] 输出: [1,2]
 * 
 * @author wan_ys
 *
 *         2019年2月2日下午2:45:16
 */
public class MajorityElement2 {
	public static void main(String[] args) {
		System.out.println(majorityElement(new int[] { 3, 2, 3 }));
		System.out.println(majorityElement(new int[] { 1, 1, 1, 3, 3, 2, 2, 2 }));
	}

	/**
	 * 利用map来求众数
	 * 
	 * @param nums
	 * @return
	 */
	static List<Integer> majorityElement(int[] nums) {
		List<Integer> list = new LinkedList<Integer>();
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		int len = nums.length;
		if (len == 0) {
			return list;
		}
		if (len == 1) {
			list.add(nums[0]);
		} else {

			for (int i = 0; i < nums.length; i++) {
				if (map.containsKey(nums[i])) {// 判断是否有nums[i]
					if (map.get(nums[i]) == len / 3) {
						list.add(nums[i]);
					}
					map.put(nums[i], map.get(nums[i]) + 1);
				} else {
					map.put(nums[i], 1);
					if (len < 3) {// 当只有两个元素时
						list.add(nums[i]);
					}
				}
			}
		}
		return list;
	}

}
