package com.wanali.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 四数之和 给定一个包含 n 个整数的数组 nums 和一个目标值 target，判断 nums 中是否存在四个元素 a，b，c 和 d ，使得
 *  a + b + c + d 的值与 target 相等？找出所有满足条件且不重复的四元组。 
 * 给定数组 nums = [1, 0, -1, 0, -2, 2]，和target = 0。
 * 满足要求的四元组集合为： [ [-1, 0, 0, 1], [-2, -1, 1, 2], [-2, 0, 0, 2] ]
 * 
 * @author wan_ys
 *
 * 2019年1月25日下午4:32:46
 */
public class FourSum {
	public static void main(String[] args) {
		int[] nums = new int[] { 1, 0, -1, 0, -2, 2 };
		int[] nums1 = new int[] { 0, 0, 0, 0 };
		int target = 0;
		int target1=1;
		System.out.println(fourSum(nums, target));
		System.out.println(fourSum(nums1, target1));
	}
	/**
	 * 四数之和转化为两数之和，先确定两个数，剩下两个数之和为target减先确定的两个数之和
	 * @param nums
	 * @param target
	 * @return
	 */
	static List<List<Integer>> fourSum(int[] nums, int target) {
		List<List<Integer>> result = new ArrayList<List<Integer>>();
		// 如果为空数组或数组的长度小于4，直接返回空列表
		if (nums == null || nums.length < 4) {
			return result;
		}
		// 对数组进行排序
		Arrays.sort(nums);

		for (int i = 0; i < nums.length - 3; i++) {// i表示第一个加数
			// 当第一个数与之前的数重复时，继续向后遍历
			if (i > 0 && nums[i] == nums[i - 1]) {
				continue; // 因为这里使用的时if，所以要用continue,也可以用while语句
			}
			for (int j = nums.length - 1; j > i + 2; j--) {// j表示第四个加数
				// 第四个数与之前的数有重复时，向前继续遍历
				if (j < nums.length - 1 && nums[j] == nums[j + 1]) {
					continue; // 这也应该用continue
				}
				// 确定了第一个和第四个数之后
				int two = i + 1; // 第二个数
				int three = j - 1; // 第三个数
				int n = target - nums[i] - nums[j]; // 确定第二个数跟第三个数的和
				while (two < three) {
					if (nums[two] + nums[three] == n) {
						List<Integer> list = new ArrayList<Integer>();
						list.add(nums[i]);
						list.add(nums[two]);
						list.add(nums[three]);
						list.add(nums[j]);
						// 将该列表添加到result列表中
						result.add(list);
						two++;
						// 判断第二个数不重复
						while (two < three && nums[two] == nums[two - 1]) {
							two++;
						}
						three--;
						// 判断第三个数不重复
						while (two < three && nums[three] == nums[three + 1]) {
							three--;
						}
					} else if (nums[two] + nums[three] < n) {
						two++;
						// 继续向后找不重复的第二个数字
						while (two < three && nums[two] == nums[two - 1]) {
							two++;
						}
					} else {
						three--;
						// 继续向前找不重复的第三个数字
						while (two < three && nums[three] == nums[three + 1]) {
							three--;
						}
					}
				}
			}
		}

		return result;
	}

}
