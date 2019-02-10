package com.wanali.array;

/**
 * 最大连续1的个数
 * 
 * 给定一个二进制数组， 计算其中最大连续1的个数。
 * 
 * 示例 1:
 * 
 * 输入: [1,1,0,1,1,1] 输出: 3 解释: 开头的两位和最后的三位都是连续1，所以最大连续1的个数是 3.
 * 
 * @author wan_ys
 *
 *         2019年2月10日下午8:36:19
 */
public class FindMaxConsecutiveOnes {
	public static void main(String[] args) {
		System.out.println(findMaxConsecutiveOnes(new int[] { 1, 1, 0, 1, 1, 1 }));
	}

	static int findMaxConsecutiveOnes(int[] nums) {
		int max = 0;
		int count = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == 1) {
				count++;
			} else {
				// 如果为0，判断是否大于max，并且最后需要将count置为0
				if (max < count) {
					max = count;
				}
				count = 0;
			}
		}
		// 当只有一个1时，count>max时，max还没有赋值，因此这里需要返回max与count的最大值
		return Math.max(max, count);
	}

}
