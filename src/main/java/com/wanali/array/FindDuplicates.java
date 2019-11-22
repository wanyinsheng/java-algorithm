package com.wanali.array;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
/**
 * 442.数组中的重复数据
 * 给定一个整数数组 a，其中1 ≤ a[i] ≤ n （n为数组长度）, 其中有些元素出现两次而其他元素出现一次。

	找到所有出现两次的元素。

输入:
[4,3,2,7,8,2,3,1]
输出:
[2,3]
 * @author wanyinsheng
 *
 * @date 2019年11月22日下午9:04:55
 *
 */
public class FindDuplicates {
	/**
	 * 利用set集合的性质
	 * @param nums
	 * @return
	 */
	public static List<Integer> findDuplicates(int[] nums){
		List<Integer> list=new ArrayList<Integer>();
		Set<Integer> set=new HashSet<Integer>();
		for (int i = 0; i < nums.length; i++) {
			if (set.contains(nums[i])) {
				list.add(nums[i]);
			}else {
				set.add(nums[i]);
			}
		}
		return list;
	}
	public static void main(String[] args) {
		List<Integer> list=findDuplicates(new int[] {4,3,2,7,8,2,3,1});
		for (Integer integer : list) {
			System.out.println(integer);
		}
		
	}

}
