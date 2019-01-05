package com.wanali.sort;

import java.util.Arrays;
import java.util.Random;
/**
 * 冒泡排序法 比较相邻的元素，第一次实现n-1次比较，确定第一个元素为最小值
 * 接着从第二个元素往后比较，确定第二个元素的值，依次，总共进行n(n-1)/2次比较 最坏情况和平均情况都是O(n^2)
 * @author wan_ys
 *
 * 2019年1月5日下午2:18:30
 */
public class BubbleSort {
	/**
	 * 若前面的数大于后面的，实现交换
	 * 
	 * @param array
	 */
	public void sort(int[] array) {
		for (int i = 0; i < array.length - 1; i++) {
			for (int j = 0; j < array.length - 1 - i; j++) {
				if (array[j] > array[j + 1]) {
					//交换两个数
					int temp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = temp;
				}
			}
		}
	}

	public static void main(String[] args) {
		int[] a = new int[10];
		// 生成随机数组
		Random random = new Random();
		for (int i = 0; i < 10; i++) {
			a[i] = random.nextInt(1000);// 1000表示数组值得范围
		}
		System.out.println("原始数组为:");
		System.out.println(Arrays.toString(a));
		BubbleSort bubbleSort = new BubbleSort();
		bubbleSort.sort(a);
		System.out.println("排序后的结果为:");
		System.out.println(Arrays.toString(a));
		//数组默认的排序方法
		Arrays.sort(a);
		System.out.println(Arrays.toString(a));

		
	}

}
