package com.wanali.array;

public class HeightChecker {
	static int heightChecker(int[] heights) {
		// 每次从剩余的元素中找最大的
		int count = 0;
		for (int i = 0; i < heights.length - 1; i++) {
			int max = heights[i];
			int temp=0;
			for (int j = i + 1; j < heights.length; j++) {
				if (heights[j] > max) {
					max = heights[j];
					temp = j;// 记录当前最大值的下标
				}
				

			}
			heights[temp] = heights[i];
			
			count++;

		}

		return count;

	}

	public static void main(String[] args) {
		System.out.println(heightChecker(new int[] { 1, 1, 4, 2, 1, 3 }));
	}

}
