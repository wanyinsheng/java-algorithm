package com.wanali.array;

/**
 * 递增的三元子序列
 * 
 * 给定一个未排序的数组，判断这个数组中是否存在长度为 3 的递增子序列。
 * 
 * 数学表达式如下:
 * 
 * 如果存在这样的 i, j, k, 且满足 0 ≤ i < j < k ≤ n-1， 使得 arr[i] < arr[j] < arr[k] ，返回
 * true ; 否则返回 false 。 说明: 要求算法的时间复杂度为 O(n)，空间复杂度为 O(1) 。
 * 
 * 输入: [1,2,3,4,5] 输出: true 
 * 
 * 输入: [5,4,3,2,1] 输出: false
 * 
 * @author wan_ys
 *
 *         2019年3月4日上午11:39:34
 */
public class IncreasingTriplet {
	public static void main(String[] args) {
		System.out.println(increasingTriplet(new int[] { 1, 2, 3, 4, 5 }));
		System.out.println(increasingTriplet(new int[] { 5, 4, 3, 2, 1 }));
	}

	static boolean increasingTriplet(int[] nums) {
		int min = Integer.MAX_VALUE;
        int middle = Integer.MAX_VALUE;
        for (int i = 0; i < nums.length; i++) {
        	//先找第一个值，如果找到了第一个值，就不可能在去找中间值
            if (nums[i] <= min) {
                min = nums[i];
                
            } else if (nums[i] <= middle) {//比第一个数大时，考虑将其看作第二个数
                middle = nums[i];
            } else {//比前面的两个数都大那就说明找到三元子序列
                return true;
            }
        }
        return false;
	}

}
