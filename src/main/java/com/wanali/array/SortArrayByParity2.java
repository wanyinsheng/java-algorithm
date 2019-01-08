package com.wanali.array;

import java.util.Arrays;
/**
 * 给定一个非负整数数组 A， A 中一半整数是奇数，一半整数是偶数。
 * 对数组进行排序，以便当 A[i] 为奇数时，i 也是奇数；当 A[i] 为偶数时， i 也是偶数。
 * @author wan_ys
 *
 * 2019年1月8日下午1:49:40
 */
public class SortArrayByParity2 {
	public static void main(String[] args) {
		int[] A=new int[] {4,2,5,3};
		int[] ASort=sortArrayByParity(A);
		System.out.println(Arrays.toString(ASort));
	}

	static int[] sortArrayByParity(int[] A) {
		//题目已经说明是2n个数字
		int len = A.length;
		//新定义一个存放奇数和偶数的数组
		int[] oddNum = new int[len / 2];
		int[] evenNum = new int[len / 2];
		int even = 0;
		int odd = 0;
		for (int i = 0; i < A.length; i++) {
			if (i % 2 == 0) {
				evenNum[even++] = A[i];
			} else {
				oddNum[odd++] = A[i];
			}
		}
		
		System.out.println(Arrays.toString(evenNum));
		System.out.println(Arrays.toString(oddNum));
		for (int i = 0; i < A.length; i++) {
			if(i%2==0) {
				//倒着把该数组赋回A[i],比如偶数的数组为2,则最后一个元素的索引为2-1，故使用--even
				A[i]=evenNum[--even];
			}else {
				A[i]=oddNum[--odd];
			}
		}
		return A;
	}

}
