package com.wanali.sort;

import java.util.Arrays;
import java.util.Random;
/**
 * 堆排序 堆有大顶堆和小顶堆，大顶堆是父节点大于两个子节点，小顶堆是福节点小于两个子节点
 * 首先创建一个堆，在提出堆顶个元素之后，将子节点的最后一个元素放在堆顶，并对堆进行调整使其成为大定堆或小顶堆
 * @author wan_ys
 *
 * 2019年1月5日下午2:12:19
 */
public class HeapSort {

	/**
	 * 创建堆，每次提取堆顶元素之后都要进行堆调整
	 * 
	 * @param array
	 */
	public static void sort(int[] array) {
		// 1.构建大顶堆,从最后一个叶子节点的父节点开始调整
		for (int i = array.length / 2; i >= 0; i--) {
			// 从第一个非叶子结点从下至上，从右至左调整结构
			adjustHeap(array, i, array.length);
		}
		// 2.调整堆结构+交换堆顶元素与末尾元素(递归实现)
		for (int j = array.length - 1; j > 0; j--) {
			swap(array, 0, j);// 将堆顶元素与末尾元素进行交换
			adjustHeap(array, 0, j);// 重新对堆进行调整
		}

	}

	/**
	 * 调整大顶堆（仅是调整过程，建立在大顶堆已构建的基础上）
	 * 
	 * @param array
	 * @param i 
	 * @param length
	 */
	public static void adjustHeap(int[] array, int i, int length) {
		int temp = array[i];// 先取出当前元素i
		for (int k = i * 2 + 1; k < length; k = k * 2 + 1) {// 从i结点的左子结点开始，也就是2i+1处开始
			if (k + 1 < length && array[k] < array[k + 1]) {// 如果左子结点小于右子结点，k指向右子结点
				k++;
			}
			if (array[k] > temp) {// 如果子节点大于父节点，将子节点值赋给父节点（不用进行交换）
//				array[i] = array[k];  //不实现交换，只是把值赋给父节点，并且把k处的节点做为新的父节点向下比较
//				i = k;
				swap(array, i, k);//父节点与该子节点交换，子节点作为新的父节点
				i = k;
			} else {
				break;
			}
		}
		array[i] = temp;// 将temp值放到最终的位置
	}

	/**
	 * 交换元素
	 * 
	 * @param array
	 * @param a
	 * @param b
	 */
	public static void swap(int[] array, int i, int j) {
		int temp = array[i];
		array[i] = array[j];
		array[j] = temp;
	}

	public static void main(String[] args) {
		int[] a = new int[10];
		Random random = new Random();
		for (int i = 0; i < a.length; i++) {
			a[i] = random.nextInt(100);
		}
		System.out.println("随机生成的一个数组为:");
		System.out.println(Arrays.toString(a));
		sort(a);
		System.out.println("排序之后的结果为:");
		System.out.println(Arrays.toString(a));
	}

}
