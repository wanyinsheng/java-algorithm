package com.wanali.sort;

import java.util.Arrays;
import java.util.Random;
/**
 * 快速排序
 * 选数组左边的为主元，先从右边开始找小于主元的数，下标为j，将其赋值给主元，接着从左边找大于主元的数，下标为i，放在j的位置，
 * 接着继续从右边开始找小于主元的数，放在i的位置，左右逼近直至相遇，将最后置为空的位置用主元替换
 * @author wan_ys
 *
 * 2019年1月5日下午1:35:02
 */
public class QuickSort {
	/**
	 * 不断的划分子数组，最终确定每个元素的位置
	 * @param array
	 * @param left
	 * @param right
	 */
	public static void sort(int array[], int left, int right) {
		//定义一个划分点，即左边的数都小于这个数，右边的数都大于这个数
		int point;
		if (left < right) {
			point = partition(array, left, right);
			sort(array, left, point - 1);
			sort(array, point + 1, right);
		}
	}
/**
 * 实现划分，并找出划分点
 * @param array
 * @param left
 * @param right
 * @return
 */
	public static int partition(int array[], int left, int right) {
		int pivot = array[left];//pivot为基准点
		while (left < right) {
			//从右边开始找小于该基准的数，放在基准所在的位置
			while (left < right && array[right] > pivot)
				right--;
			if (left < right)
				array[left++] = array[right];
			//从左边找大于该基准的数，放在基准所在的位置
			while (left < right && array[left] < pivot)
				left++;
			if (left < right)
				array[right--] = array[left];
		}
		//返回基准所在位置
		array[left] = pivot;
		return left;
	}

	public static void main(String[] args) {
		int[] a = new int[10];
		// 生成随机数组
		Random raarraydom = new Random();
		for (int i = 0; i < a.length; i++) {
			a[i] = raarraydom.nextInt(100);
		}
		System.out.println("原始数组为:");
		System.out.println(Arrays.toString(a));
		sort(a, 0, a.length - 1);
		System.out.println("排序后的结果为:");
		System.out.println(Arrays.toString(a));
	}

}
