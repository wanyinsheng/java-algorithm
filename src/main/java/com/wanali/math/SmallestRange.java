package com.wanali.math;

import java.util.Arrays;

/**
 * 最小差值
 * 
 * 给定一个整数数组 A，对于每个整数 A[i]，我们可以选择任意 x 满足 -K <= x <= K，并将 x 加到 A[i] 中。
 * 
 * 在此过程之后，我们得到一些数组 B。
 * 
 * 返回 B 的最大值和 B 的最小值之间可能存在的最小差值。
 * 
 * 
 * 输入：A = [1], K = 0 输出：0 解释：B = [1] 
 * 
 * 输入：A = [0,10], K = 2 输出：6 解释：B = [2,8] 
 * 
 * 输入：A = [1,3,6], K = 3 输出：0 解释：B = [3,3,3] 或 B = [4,4,4]
 * 
 * @author wan_ys
 *
 *         2019年2月20日下午3:06:25
 */
public class SmallestRange {
	public static void main(String[] args) {
		System.out.println(smallestRange(new int[] { 1 }, 0));
		System.out.println(smallestRange(new int[] { 0, 10 }, 2));
		System.out.println(smallestRange(new int[] { 1, 3, 6 }, 3));
	}

	static int smallestRange(int[] A, int k) {
		// 数组A中只有一个数时，不论k的情况，怎样变化最大值和最小值都一样
		if (A.length == 1) {
			return 0;
		}
		
//		Arrays.sort(A);可以不用排序找最大值和最小值，节省大量时间
//		int min = A[0];
//		int max = A[A.length - 1];
		int min=A[0];
		int max=A[0];
		for (int i = 0; i < A.length; i++) {
			if (A[i]<min) {
				min=A[i];
				continue;
			}
			if (A[i]>max) {
				max=A[i];
				
			}
			
		}
		
		// 讨论极端情况就是min+k和max-k之后min<max或min>max,对第二种情况来看就会有始终存在一个k满足最大和和最小和的差为0
		if (max - min < 2 * k) {
			return 0;
		} else {
			return max - min - 2 * k;
		}
	}

}
