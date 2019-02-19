package com.wanali.math;

import java.util.Arrays;

/**
 * 增减字符串匹配
 * 
 * 给定只含 "I"（增大）或 "D"（减小）的字符串 S ，令 N = S.length。
 * 
 * 返回 [0, 1, ..., N] 的任意排列 A 使得对于所有 i = 0, ..., N-1，都有：
 * 
 * 如果 S[i] == "I"，那么 A[i] < A[i+1] 如果 S[i] == "D"，那么 A[i] > A[i+1]
 * 
 * 
 * 输出："IDID" 输出：[0,4,1,3,2] 
 * 
 * 输出："III" 输出：[0,1,2,3] 
 * 
 * 输出："DDI" 输出：[3,2,0,1]
 * 
 * @author wan_ys
 *
 *         2019年2月19日下午7:12:17
 */
public class DiStringMatch {
	public static void main(String[] args) {
		System.out.println(Arrays.toString(diStringMatch("IDID")));
		System.out.println(Arrays.toString(diStringMatch("III")));
	}

	/**
	 * 遍历遇到I填最小元素，遇到D填最大元素，最后补充最后剩下的一个元素
	 * 
	 * @param S
	 * @return
	 */
	static int[] diStringMatch(String S) {
		int[] result = new int[S.length() + 1];
		int min = 0;// 定义A数组最小的数
		int max = S.length();// 定义A数组最大的数
		for (int i = 0; i < S.length(); i++) {
			// 遇到I填一个最小的元素
			if (S.charAt(i) == 'I') {
				result[i] = min;
				min++;
			} else {// 遇到D填一个最大的元素
				result[i] = max;
				max--;
			}
		}
		result[S.length()] = min;// 补充最后剩余的元素
		return result;
	}

}
