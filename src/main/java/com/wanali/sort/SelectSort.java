package com.wanali.sort;

import java.util.Arrays;
import java.util.Random;
/**
 * 选择排序 在要排序的数组中，先选出最小的一个与第一个数交换位置，然后从剩下的数中找最小的与第二个数交换位置，
 * 外层需要循环n-1次，内层在进行(length-1-i)次比较
 * @author wan_ys
 *
 * 2019年1月5日下午2:36:27
 */
public class SelectSort {
	/**
	 * 
	 * @param array
	 */
	public void sort(int[] array) {
		for (int i = 0; i < array.length - 1; i++) {
			int min = array[i];// 进行第i次比较时，设定第i个元素为最小值
			for (int j = i + 1; j < array.length; j++) {
				// 将第i个元素与后面的元素都进行比较，找到最小的元素，并赋值给第i个元素
				if (array[j] < min) {
					int temp = array[j];
					array[j] = min;
					min = temp;

				}
				array[i] = min;// 找到最小值后将最小值赋给第i个元素array[i]
			}
		}
	}

	public static void main(String[] args) {
		int[] a = new int[10];
		// 随机生成数组中的元素
		Random random = new Random();
		for (int i = 0; i < a.length; i++) {
			a[i] = random.nextInt(1000);
		}
		System.out.println("随机生成的数组为:");
		System.out.println(Arrays.toString(a));
		SelectSort selectSort = new SelectSort();
		selectSort.sort(a);
		System.out.println("排序后的结果为:");
		System.out.println(Arrays.toString(a));
	}

}
