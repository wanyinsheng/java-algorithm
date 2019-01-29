package com.wanali.math;

import java.util.Arrays;

/**
 * 加一
 * 
 * 给定一个由整数组成的非空数组所表示的非负整数，在该数的基础上加一。
 * 
 * 最高位数字存放在数组的首位， 数组中每个元素只存储一个数字。
 * 
 * 你可以假设除了整数 0 之外，这个整数不会以零开头。 
 * 
 * 输入: [1,2,3] 输出: [1,2,4] 解释: 输入数组表示数字 123。
 * 
 * 输入: [4,3,2,1] 输出: [4,3,2,2] 解释: 输入数组表示数字 4321。
 * 
 * @author wan_ys
 *
 *         2019年1月29日上午10:51:35
 */
public class PlusOne {
	public static void main(String[] args) {
		System.out.println(Arrays.toString(plusOne(new int[] { 9, 8, 9 })));
		System.out.println(Arrays.toString(plusOne(new int[] { 9, 9, 9, 9 })));
	}

	static int[] plusOne(int[] digits) {
		if (digits[digits.length - 1] < 9) {
			digits[digits.length - 1] = digits[digits.length - 1] + 1;
		} else {
			// 从倒数第1位开始判断该位是否为9，如果是，将该位置位0，并继续往前找不等于9的，如果第一位为9，就需要增加一位
			for (int i = digits.length - 1; i >= 0; i--) {
				if (digits[i] == 9) {
					digits[i] = 0;
					if (i == 0) {// 上面已经判断该位为9.因此这里只需判断是否为首位即可
						digits = new int[digits.length + 1];
						digits[0] = 1;
						return digits;
					}

				}
				// 如果该位不是9，直接加1
				else {
					digits[i] += 1;
					break;
				}
			}
		}
		return digits;
	}

}
