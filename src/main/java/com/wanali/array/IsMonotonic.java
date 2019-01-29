package com.wanali.array;

/**
 * 单调数列
 * 如果数组是单调递增或单调递减的，那么它是单调的。
 * 如果对于所有 i <= j，A[i] <= A[j]，那么数组 A 是单调递增的。 如果对于所有 i <= j，A[i]> = A[j]，那么数组 A
 * 是单调递减的。
 * 当给定的数组 A 是单调数组时返回 true，否则返回 false。
 * 
 * 输入：[1,2,2,3] 输出：true 
 * 输入：[6,5,4,4] 输出：true 
 * 输入：[1,3,2] 输出：false 
 * 输入：[1,2,4,5] 输出：true 
 * 输入：[1,1,1] 输出：true
 * 
 * @author wan_ys
 *
 *         2019年1月29日下午9:32:50
 */
public class IsMonotonic {
	public static void main(String[] args) {
		System.out.println(isMonotonic(new int[] { 1, 2, 2, 3 }));
		System.out.println(isMonotonic(new int[] { 6, 5, 4, 4 }));
		System.out.println(isMonotonic(new int[] { 1, 3, 2 }));
		System.out.println(isMonotonic(new int[] { 1, 2, 4, 5 }));
		System.out.println(isMonotonic(new int[] { 1, 1, 1 }));
	}

	static boolean isMonotonic(int[] A) {
		return increasing(A) || decreasing(A);
	}

	static boolean increasing(int[] A) {
		for (int i = 0; i < A.length - 1; ++i)
			if (A[i] > A[i + 1])
				return false;
		return true;
	}

	static boolean decreasing(int[] A) {
		for (int i = 0; i < A.length - 1; ++i)
			if (A[i] < A[i + 1])
				return false;
		return true;
	}

}
