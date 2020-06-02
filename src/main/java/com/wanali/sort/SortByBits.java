package com.wanali.sort;

import java.util.Arrays;
import java.util.Map;
import java.util.TreeMap;

public class SortByBits {
	private static Map<Integer, Integer> map;

	public static void main(String[] args) {
System.out.println(Arrays.toString(sortByBits(new int[]{0,1,2,3,4,5,6,7,8})));
	}

	public static int[] sortByBits(int[] arr) {
		// 将数字转化为二进制
		// map = new HashMap<Integer, Integer>();
		map = new TreeMap<Integer, Integer>();
		int[] result = new int[arr.length];
		for (int i = 0; i < arr.length; i++) {
			int count = 0;
			for (int j = arr[i]; j >= 1; j = j / 2) {
				if (j % 2 != 0) {
					count++;
				}
			}
			map.put(arr[i], count);

		}
		int i = 0;
		for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
			System.out.println(entry.getValue());
			result[i++] = entry.getValue();
		}
		return result;
	}

}
