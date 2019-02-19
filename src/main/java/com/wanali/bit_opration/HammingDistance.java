package com.wanali.bit_opration;

/**
 * 汉明距离
 * 
 * 两个整数之间的汉明距离指的是这两个数字对应二进制位不同的位置的数目。
 * 
 * 给出两个整数 x 和 y，计算它们之间的汉明距离。
 * 
 * 注意： 0 ≤ x, y < 231.
 * 
 * 输入: x = 1, y = 4
 * 
 * 输出: 2
 * 
 * 解释: 1 (0 0 0 1) 
 * 		4 (0 1 0 0) 
 * 
 * @author wan_ys
 *
 *         2019年2月19日下午8:42:51
 */
public class HammingDistance {
	public static void main(String[] args) {
		System.out.println(hammingDistance(1, 4));
	}

	static int hammingDistance(int x, int y) {
		int xor = x ^ y;
		int count = 0;
		while (xor != 0) {
			xor = xor & (xor - 1);
			count++;
		}
		return count;

	}

}
