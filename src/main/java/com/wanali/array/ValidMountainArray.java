package com.wanali.array;

/**
 * 有效的山脉数组
 * 
 * 给定一个整数数组 A，如果它是有效的山脉数组就返回 true，否则返回 false。
 * 
 * 让我们回顾一下，如果 A 满足下述条件，那么它是一个山脉数组：
 * 
 * A.length >= 3 在 0 < i < A.length - 1 条件下，存在 i 使得： A[0] < A[1] < ... A[i-1] <
 * A[i] A[i] > A[i+1] > ... > A[B.length - 1]
 * 
 * 
 * 输入：[2,1] 输出：false 
 * 
 * 输入：[3,5,5] 输出：false
 * 
 * 输入：[0,3,2,1] 输出：true
 * 
 * @author wan_ys
 *
 *         2019年2月11日下午9:04:46
 */
public class ValidMountainArray {
	public static void main(String[] args) {
		System.out.println(validMountainArray(new int[] { 2, 1 }));
		System.out.println(validMountainArray(new int[] { 3, 5, 5 }));
		System.out.println(validMountainArray(new int[] { 0, 3, 2, 1 }));
	}

	static boolean validMountainArray(int[] A) {
		// 长度小于三不构成山脉
		if (A.length < 3) {
			return false;
		}
		int index = 0;
		for (int i = 0; i < A.length - 1; i++) {
			// 如果前面的数出现了大于等于后面数的情况，前面那个数就认为是山峰
			if (i != 0 && A[i] >= A[i + 1]) {
				index = i;// index即山峰
				// System.out.println(index);//山峰的位置
				break;
			} else if (i == 0 && A[i] >= A[i + 1]) {// 如果该山峰位置位于第一个位置，也不算是山峰
				return false;
			}
		}
		// 前面的遍历找到了山峰，这里继续判断后面的数是否都依次递减
		for (int i = index; i < A.length - 1; i++) {
			if (A[i] <= A[i + 1]) {// 相等的情况也不算是山峰，最大的数只能有一个
				return false;
			}
		}
		return true;
	}

}
