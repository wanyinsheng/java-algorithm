package com.wanali.array;

/**
 * 盛最多水的容器
 * 给定 n 个非负整数 a1，a2，...，an，每个数代表坐标中的一个点 (i, ai) 。在坐标内画 n 条垂直线，垂直线 i 的两个端点分别为 (i,
 * ai) 和 (i, 0)。找出其中的两条线，使得它们与 x 轴共同构成的容器可以容纳最多的水。 说明：你不能倾斜容器，且 n 的值至少为 2。
 * 
 * 输入: [1,8,6,2,5,4,8,3,7] 输出: 49
 * 
 * @author wan_ys
 *
 *         2019年1月30日下午10:15:22
 */
public class MaxArea {
	public static void main(String[] args) {
		System.out.println(maxArea_A(new int[] { 1, 8, 6, 2, 5, 4, 8, 3, 7 }));
		System.out.println(maxArea_B(new int[] { 1, 8, 6, 2, 5, 4, 8, 3, 7 }));
	}

	/**
	 * 暴力法
	 * 
	 * @param height
	 * @return
	 */
	static int maxArea_A(int[] height) {
		int area = 0;
		for (int i = 0; i < height.length - 1; i++) {
			for (int j = i + 1; j < height.length; j++) {
				if (area < Math.min(height[i], height[j]) * (j - i)) {
					area = Math.min(height[i], height[j]) * (j - i);
				}
			}
		}
		return area;
	}

	/**
	 * 双指针
	 * 
	 * @param height
	 * @return
	 */
	static int maxArea_B(int[] height) {
		int area = 0;
		int left = 0;// 左指针
		int right = height.length - 1;// 右指针
		while (left < right) {
			if (area < Math.min(height[left], height[right]) * (right - left)) {
				area = Math.min(height[left], height[right]) * (right - left);
			}
			// 如果左边的高度小于右边的高度，就保留右边的，继续遍历左边的，否则，遍历右边的
			if (height[left] < height[right]) {
				left++;
			} else {
				right--;
			}
		}
		return area;

	}

}
