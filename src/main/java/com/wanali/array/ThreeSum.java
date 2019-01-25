package com.wanali.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 三数之和
 * 给定一个包含 n 个整数的数组 nums，判断 nums 中是否存在三个元素 a，b，c ，使得 a + b + c = 0
 * 找出所有满足条件且不重复的三元组。 例如, 给定数组 nums = [-1, 0, 1, 2, -1, -4]，满足要求的三元组集合为： 
 * [ [-1,0, 1], [-1, -1, 2] ]
 * 
 * @author wan_ys
 *
 * 2019年1月25日下午3:07:06
 */
public class ThreeSum {
	public static void main(String[] args) {
		int[] nums = new int[] { -1, 0, 1, 2, -1, -4 };
		int[] num=new int[] {0,0,0};
		System.out.println(threeSum(nums));
		System.out.println(threeSum(num));
	}
	/**
	 * 三数之和转化为两数之和a+b+c=0 ->-a=b+c
	 * @param nums
	 * @return
	 */
	static List<List<Integer>> threeSum(int[] nums) {
		List<List<Integer>> result = new ArrayList<List<Integer>>();
		// 对数组进行排序
		Arrays.sort(nums);
		// 第i个数的范围
		for (int i = 0; i < nums.length - 2; i++) {
			// 第2个数从左边找
			int j = i + 1;
			// 第3个数从右边找
			int k = nums.length - 1;
			while (j < k) {
				// 找到满足条件的数
				if (nums[j] + nums[k] == -nums[i]) {
					List<Integer> list = new ArrayList<Integer>();
					list.add(nums[i]);
					list.add(nums[j]);
					list.add(nums[k]);
					result.add(list);
					j++;
					k--;
					// 如果有相同的数，就往前或往后继续遍历
					while (j < k && nums[j] == nums[j - 1]) { // 往后继续遍历
						j++;
					}
					while (j < k && nums[k] == nums[k + 1]) { // 往前继续遍历
						k--;
					}

				} else if (nums[j] + nums[k] > -nums[i]) { // 如果和大于0
					k--;
					while(nums[k]==nums[k+1]) {
						k--;
					}
				} else {// 如果和小于0
					j++;
					while(nums[j]==nums[j-1]) {
						j++;
					}
				}
			}
			// 当第一个当前数与后面的数相同时，i+1直接跳过
			while (i<=nums.length-2&&nums[i + 1] == nums[i]) {
				i++;
			}
		}

		return result;
	}

}
