package com.wanali.array;

import java.util.LinkedList;
import java.util.List;
/**
 * 子集
 * 
 * 给定一组不含重复元素的整数数组 nums，返回该数组所有可能的子集（幂集）。

说明：解集不能包含重复的子集。

示例:

输入: nums = [1,2,3]
输出:
[
  [3],
  [1],
  [2],
  [1,2,3],
  [1,3],
  [2,3],
  [1,2],
  []
]
 * @author wan_ys
 *
 * 2019年2月22日上午8:34:00
 */
public class Subsets {
	public static void main(String[] args) {
		System.out.println(subsets(new int[] { 1, 2, 3 }));
	}

	static List<List<Integer>> subsets(int[] nums) {
		List<List<Integer>> result = new LinkedList<List<Integer>>();
		result.add(new LinkedList<Integer>());// 添加空集
		for (int i = 0; i < nums.length; i++) {
			int size = result.size();
			for (int j = 0; j < size; j++) {
				List<Integer> list = new LinkedList<Integer>(result.get(j));
				list.add(nums[i]);
				result.add(list);
			}
		}
		return result;
	}

}
