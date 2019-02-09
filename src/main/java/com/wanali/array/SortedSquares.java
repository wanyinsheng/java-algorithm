package com.wanali.array;

import java.util.Arrays;

public class SortedSquares {
	public static void main(String[] args) {
		System.out.println(Arrays.toString(sortedSquares(new int[] {-4,-1,0,3,10})));
		System.out.println(Arrays.toString(sortedSquares(new int[] {-7,-3,2,3,11})));
	}
	static int[] sortedSquares(int[] A) {
		for (int i = 0; i < A.length; i++) {
			A[i]=A[i]*A[i];
		}
		Arrays.sort(A);
		return A;
	}

}
