package com.wanali.array;

import java.util.Arrays;
/**
 * 将每个元素替换为右侧最大元素
 * 
 * 给你一个数组 arr ，请你将每个元素用它右边最大的元素替换，如果是最后一个元素，用 -1 替换。

完成所有替换操作后，请你返回这个数组。

 

示例：

输入：arr = [17,18,5,4,6,1]
输出：[18,6,6,6,1,-1]
 * @author wanyinsheng
 *
 * @date 2020年1月6日下午6:39:55
 *
 */
public class ReplaceElements {
	public static int[] replaceElements(int[] arr) {
		int[] result=new int[arr.length];
		result[result.length-1]=-1;//给最后一个元素赋值-1
		int max=Integer.MIN_VALUE;
		for (int i = result.length-1; i >0; i--) {//这里的i为arr的下标
			if (arr[i]>max) {
				max=arr[i];
				result[i-1]=max;
			}else {
				result[i-1]=max;
			}
		}
		return result;
	}
	public static void main(String[] args) {
		System.out.println(Arrays.toString(replaceElements(new int[] {17,18,5,4,6,1})));
	}

}
