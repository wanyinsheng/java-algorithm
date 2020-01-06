package com.wanali.array;

import java.util.Arrays;
/**
 * 比特位计数
 * 
 * 给定一个非负整数 num。对于 0 ≤ i ≤ num 范围中的每个数字 i ，计算其二进制数中的 1 的数目并将它们作为数组返回。

示例 1:

输入: 2
输出: [0,1,1]
示例 2:

输入: 5
输出: [0,1,1,2,1,2]

 * @author wanyinsheng
 *
 * @date 2020年1月6日下午6:17:35
 *
 */
public class CountBits {
	public static int[] countBits(int num) {
		int[] result = new int[num+1];
		result[0]=0;
		for (int i = 1; i < result.length; i++) {
			//使用地推公式,
//0 => 0
//1 => 1
//2 => 10
//3 => 11
//4 => 100
//5 => 101
//6 => 110
//7 => 111
//8 => 1000
			if (i%2==0) {
				result[i]=result[i/2];
			}else {
				result[i]=result[i-1]+1;
			}
		}
		return result;
	}

	public static void main(String[] args) {
		System.out.println(Arrays.toString(countBits(2)));
		System.out.println(Arrays.toString(countBits(5)));;

	}

}
