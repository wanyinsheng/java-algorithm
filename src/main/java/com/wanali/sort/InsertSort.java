package com.wanali.sort;

import java.util.Arrays;
import java.util.Random;

/**
 * 有直接插入排序，二分插入排序(折半插入排序)，链表插入排序，希尔排序(缩小增量排序) 时间复杂度为O(n^2)
 * 
 * @author wan_ys
 *
 *         2019年1月4日下午3:40:14
 */
public class InsertSort {
	/**
	 * 直接插入排序 :把待排序数插入到一个已经排好序的有序序列中，直到所有的记录插入完为止 可以默认第一个是有序的，直接从第二个开始排序
	 * 平均复杂度为O(n^2),最好为O(n),最坏为O(n^2)
	 * 
	 * @param array
	 */
	public void directSort(int[] array) {
		for (int i = 1; i < array.length; i++) {// 循环比较n-1次
			int key = array[i];
			int j = i - 1;
			while (j > 0 && array[j] > key) {
				array[j + 1] = array[j];
				j--;
			}
			array[j + 1] = key;
		}

	}

	/**
	 * 折半插入排序是在直接插入的基础上多了二分查找
	 * 
	 * @param array
	 */
	public void binaryInsertSort(int[] array) {
		for (int i = 1; i < array.length; i++) {
			int low = 0;// 定义二分查找的首位
			int high = i - 1;// 定义二分查找的最后一位
			// 二分查找插入点
			while (low <= high) {
				int mid = (low + high) / 2;
				if (array[mid] < array[i]) {
					low = mid + 1;
				} else {
					high = mid - 1;
				}
			}
			for (int j = i - 1; j >= low; j--) {
				array[j++] = array[j];
			}

		}
	}

	public static void main(String[] args) {
		int[] a = new int[10];
		// 生成一个随机数组
		Random random = new Random();
		for (int i = 0; i < a.length; i++) {
			a[i] = random.nextInt(1000);
		}
		System.out.println("随机生成的一个数组为:");
		System.out.println(Arrays.toString(a));
		InsertSort insertSort = new InsertSort();
		// 直接插入排序测试
		insertSort.directSort(a);
		System.out.println("直接插入排序后结果为:");
		System.out.println(Arrays.toString(a));
		// 折半插入排序测试
		insertSort.binaryInsertSort(a);
		System.out.println("折半插入排序后的结果为:");
		System.out.println(Arrays.toString(a));
	}

}
