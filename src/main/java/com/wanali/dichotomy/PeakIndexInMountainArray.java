package com.wanali.dichotomy;

/**
 * 山脉数组的峰顶索引
 * 
 * 我们把符合下列属性的数组 A 称作山脉：
 * 
 * A.length >= 3 存在 0 < i < A.length - 1 使得A[0] < A[1] < ... A[i-1] < A[i] >
 * A[i+1] > ... > A[A.length - 1] 给定一个确定为山脉的数组，返回任何满足 A[0] < A[1] < ... A[i-1] <
 * A[i] > A[i+1] > ... > A[A.length - 1] 的 i 的值。
 * 
 * 
 * 输入：[0,1,0] 输出：1 
 * 
 * 输入：[0,2,1,0] 输出：1
 * 
 * @author wan_ys
 *
 *         2019年2月20日下午3:42:26
 */
public class PeakIndexInMountainArray {
	public static void main(String[] args) {
		System.out.println(peakIndexInMountainArray(new int[] { 0, 1, 0 }));
		System.out.println(peakIndexInMountainArray(new int[] { 0, 2, 1, 0 }));
	}
	/**
	 * 二分法找最大值的索引，也可以遍历找最大值的索引
	 * @param A
	 * @return
	 */
	static int peakIndexInMountainArray(int[] A) {

		return peakIndexInMountainArray(A, 0, A.length - 1);
	}

	static int peakIndexInMountainArray(int[] A, int left, int right) {
		int mid = (left + right) / 2;
		if (A[mid] > A[mid + 1]) {// 峰大于右边的数，如果不满足，说明最大值在右边
			if (A[mid] > A[mid - 1]) {// 峰大于左边的数，不满足该条件，最大值在左边
				return mid;
			} else {
				return peakIndexInMountainArray(A, left, mid - 1);
			}
		} else {
			return peakIndexInMountainArray(A, mid + 1, right);
		}
	}

}
