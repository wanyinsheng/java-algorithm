package com.wanali.array;

import java.util.Arrays;
/**
 * 给定一个非负整数数组 A，返回一个由 A 的所有偶数元素组成的数组，后面跟 A 的所有奇数元素。
 * @author wan_ys
 *
 * 2019年1月8日下午2:28:35
 */
public class SortArrayByParity {
	public static void main(String[] args) {
		int[] A=new int[] {3,0,7,8,1,2,4,5,10};
		System.out.println(Arrays.toString(sortArrayByParity(A)));
	}
	static int[] sortArrayByParity(int[] A) {
		//用i和j两个指针，左边找奇数，右边找偶数，交换，直到i与j相遇退出
		for (int i = 0; i < A.length; i++) {
			for (int j = A.length-1; j >i; j--) {
				if(A[i]%2!=0&&A[j]%2==0) {
					int temp=A[i];
					A[i]=A[j];
					A[j]=temp;
				}
			}
		}
		return A;
		
	}

}
