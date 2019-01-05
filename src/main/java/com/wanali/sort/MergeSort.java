package com.wanali.sort;

import java.util.Arrays;
import java.util.Random;

/**
 * 二路归并排序 该算法是采用分治法的典型应用 平均O(nlogn),最好O(nlogn),最坏O(nlogn)
 * 采用先分割再合并的思想。我们首先把一个未排序的序列从中间分割成2部分，再把2部分分成4部分，依次分割下去，
 * 直到分割成一个一个的数据，再把这些数据两两归并到一起，使之有序，不停的归并，最后成为一个排好序的序列
 * 
 * @author wan_ys
 *
 * 2019年1月4日下午10:02:34
 */
public class MergeSort {
	/**
	 * 归并排序
	 * @param array   对数组进行归并排序
	 */
	public void sort(int[] array) {
		int[] helper = new int[array.length];// 创建辅助数组
		sort(array, 0, array.length - 1, helper);
	}

	/**
	 * 
	 * @param array  要进行归并的数组
	 * @param start  数组array第一个元素下标
	 * @param end  数组array最后一个元素下标
	 * @param helper  辅助数组
	 */
	private static void sort(int[] array, int start, int end, int[] helper) {
		if (start < end) {
			int mid = (start + end) / 2;
			sort(array, start, mid, helper);// 左边归并排序，使得左子序列有序
			sort(array, mid + 1, end, helper);// 右边归并排序，使得右子序列有序
			merge(array, start, mid, end, helper);// 归并左右子序列
		}
	}

	/**
	 * 归并的实现
	 * 
	 * @param array
	 * @param start
	 * @param mid  数组中间元素的下标
	 * @param end
	 * @param helper
	 */
	private static void merge(int[] array, int start, int mid, int end, int[] helper) {
		int left = start;// 左序列指针
		int right = mid + 1;// 右序列指针
		int current = 0;// 临时数组指针
		while (left <= mid && right <= end) {
			if (array[left] <= array[right]) {
				helper[current++] = array[left++];
			} else {
				helper[current++] = array[right++];
			}
		}
		// 将左边剩余元素填充进helper中
		while (left <= mid) {
			helper[current++] = array[left++];
		}
		// 将右序列剩余元素填充进helper中
		while (right <= end) {
			helper[current++] = array[right++];
		}
		current = 0;
		// 将helper中的元素全部拷贝到原数组中
		while (start <= end) {
			array[start++] = helper[current++];
		}
	}

	public static void main(String[] args) {
		// 定义一个长度为10的数组
		int[] a = new int[10];
		Random random = new Random();
		for (int i = 0; i < a.length; i++) {
			a[i] = random.nextInt(1000);
		}
		System.out.println("随机生成的一个数组为:");
		System.out.println(Arrays.toString(a));
		MergeSort merge1 = new MergeSort();
		merge1.sort(a);
		System.out.println("排序后的结果为:");
		System.out.println(Arrays.toString(a));
	}

}
