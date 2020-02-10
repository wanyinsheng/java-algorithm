package com.wanali.recursion;

/**
 * 1137.第N个泰波那契数
 * 
 * 泰波那契序列 Tn 定义如下： 
 * 
 * T0 = 0, T1 = 1, T2 = 1, 且在 n >= 0 的条件下 Tn+3 = Tn + Tn+1 + Tn+2
 * 
 * 给你整数 n，请返回第 n 个泰波那契数 Tn 的值。
 * 
 * 示例 1：
 * 
 * 输入：n = 4 输出：4
 * 
 * 解释： T_3 = 0 + 1 + 1 = 2 T_4 = 1 + 1 + 2 = 4
 * 
 * 示例 2：
 * 
 * 输入：n = 25 输出：1389537
 * 
 * @author wanyinsheng
 *
 * @date 2020年2月10日下午2:14:38
 *
 */
public class Tribonacci {
	private int n = 38;
	// 记忆数组
	public int[] nums = new int[n];

	public static void main(String[] args) {
		System.out.println(tribonacci1(4));
		System.out.println(tribonacci1(25));
		System.out.println(tribonacci2(4));
		System.out.println(tribonacci2(25));
		System.out.println(tribonacci3(4));
		System.out.println(tribonacci3(25));
	}

	/**
	 * 动态计算
	 * 
	 * @param n
	 * @return
	 */
	static int tribonacci1(int n) {
		if (n < 3)
			return n == 0 ? 0 : 1;
		int x = 0, y = 1, z = 1;
		int temp;
		for (int i = 3; i <= n; i++) {
			temp = x + y + z;
			x = y;
			y = z;
			z = temp;
		}
		return z;
	}

	/**
	 * 带记忆递归
	 * 
	 * @param n
	 * @return
	 */
	int helper(int n) {
		nums[0] = 0;
		nums[1] = 1;
		nums[2] = 1;
		if (n >= 3)
			nums[n] = helper(n - 1) + helper(n - 2) + helper(n - 3);
		return nums[n];
	}

	static int tribonacci2(int n) {
		return new Tribonacci().helper(n);
	}

	static int tribonacci3(int n) {

		return new Tri().nums[n];

	}

}

class Tri {
	private int n = 38;
	public int[] nums = new int[n];

	public Tri() {
		nums[0] = 0;
		nums[1] = 1;
		nums[2] = 1;
		for (int i = 3; i < n; i++) {
			nums[i] = nums[i - 1] + nums[i - 2] + nums[i - 3];
		}
	}

}
