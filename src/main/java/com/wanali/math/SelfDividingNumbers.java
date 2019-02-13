package com.wanali.math;

import java.util.ArrayList;
import java.util.List;

/**
 * 自除数
 * 
 * 自除数 是指可以被它包含的每一位数除尽的数。
 * 
 * 例如，128 是一个自除数，因为 128 % 1 == 0，128 % 2 == 0，128 % 8 == 0。
 * 
 * 还有，自除数不允许包含 0 。
 * 
 * 给定上边界和下边界数字，输出一个列表，列表的元素是边界（含边界）内所有的自除数。
 * 
 * 输入： 上边界left = 1, 下边界right = 22 输出： [1, 2, 3, 4, 5, 6, 7, 8, 9, 11, 12, 15,
 * 22]
 * 
 * @author wan_ys
 *
 *         2019年2月13日下午12:27:55
 */
public class SelfDividingNumbers {
	public static void main(String[] args) {
		System.out.println(selfDividingNumbers(1, 22));
	}

	static List<Integer> selfDividingNumbers(int left, int right) {
		List<Integer> list = new ArrayList<Integer>();
		int j;
		boolean flag = false;// 标记该数是否为自除数
		for (int i = left; i <= right; i++) {
			int number = i;
			while (number > 0) {
				j = number % 10;// 先求余数
				if (j == 0) {// 如果某一位是0，肯定不是自除数
					flag = false;
					break;
				}
				if (i % j == 0) {// 可以整除，继续往后判断
					number = number / 10;
					flag = true;
				} else {// 不能整除就直接返回
					flag = false;
					break;
				}
			}
			if (flag == true) {// 根据标记向列表中添加元素
				list.add(i);
			}
		}
		return list;
	}

}
