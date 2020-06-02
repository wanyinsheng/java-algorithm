package com.wanali.dynamic_planning;

//三步问题。有个小孩正在上楼梯，楼梯有n阶台阶，小孩一次可以上1阶、2阶或3阶。实现一种方法，计算小孩有多少种上楼梯的方式。结果可能很大，你需要对结果模100
//0000007。 
//
//示例1: 
//
//
//输入：n = 3 
//输出：4
//说明: 有四种走法
//
//
//示例2: 
//
//
//输入：n = 5
//输出：13
//
//
//提示: 
//
//
//n范围在[1, 1000000]之间 
//
//Related Topics 动态规划

//leetcode submit region begin(Prohibit modification and deletion)
public class WaysToStep {
	public static int waysToStep(int n) {
		if (n <= 2)
			return n;

		int[] dp = new int[n + 1];
		dp[0] = 1;// 一级
		dp[1] = 2;// 二级
		dp[2] = 4;// 三级
		for (int i = 3; i < n; i++) {
			dp[i] = ((dp[i - 1] + dp[i - 2]) % 1000000007 + dp[i - 3]) % 1000000007;// 如果对三个数分别取余，三个数的余数都是较大值，但和会大于模值
		}
		return dp[n - 1];

	}

	public static void main(String[] args) {
		System.out.println(waysToStep(3));
	}
}
// leetcode submit region end(Prohibit modification and deletion)
