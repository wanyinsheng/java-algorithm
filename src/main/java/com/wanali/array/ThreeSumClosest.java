package com.wanali.array;

import java.util.Arrays;
/**
 * 16.最接近的三数之和
 * 给定一个包括 n 个整数的数组 nums 和 一个目标值 target。找出 nums 中的三个整数，使得它们的和与 target 最接近。返回这三个数的和。假定每组输入只存在唯一答案。

例如，给定数组 nums = [-1，2，1，-4], 和 target = 1.

与 target 最接近的三个数的和为 2. (-1 + 2 + 1 = 2).


 * @author wanyinsheng
 *
 * @date 2019年11月22日下午7:38:28
 *
 */
public class ThreeSumClosest {
	/**
	 * 找最接近有两种可能，三个数之和刚好与target相等，另一种是三个数之和与target的距离最小（通过设置距离变量来求）
	 * @param nums
	 * @param target
	 * @return
	 */
	public static int threeSumClosest(int[] nums, int target) {
		// 先排序，不知道还有没有其他的方法
		Arrays.sort(nums);
		// 使用双指针遍历
		int sum = 0;
		int len = nums.length - 1;
		int result=0;
		int min=Integer.MAX_VALUE;//target与三个数之和的最小距离
		for (int i = 0; i < nums.length; i++) {
			int left = i + 1;
			int right = len;
			while (left < right) {
				sum = nums[i] + nums[left] + nums[right];
				//如果三个数的和与target的距离比之前的小，就更新最短的距离，并设此时可能的结果为sum
				if (Math.abs(sum-target)<min) {
					min=Math.abs(sum-target);
					result=sum;
				}
				if (sum < target) {// 和小于目标值，左指针右移
					left++;
				} else if (sum > target) {// 和大于目标值，右指针左移
					right--;
				} else {// 相等的情况
					return sum;
				}
			}

		}
		return result;
	}

	public static void main(String[] args) {
		int[] nums = new int[] {-1,2,1,-4};
		System.out.println(threeSumClosest(nums, 2));

	}

}
