package com.wanali.array;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
/**
 * 杨辉三角
 * 
 * 给定一个非负整数 numRows，生成杨辉三角的前 numRows 行。
 * 输入: 5
输出:
[
     [1],
    [1,1],
   [1,2,1],
  [1,3,3,1],
 [1,4,6,4,1]
]
 * @author wan_ys
 *
 * 2019年2月20日下午5:23:11
 */
public class Generate {
	public static void main(String[] args) {
		System.out.println(generate(5));
	}

	static List<List<Integer>> generate(int numRows) {
		List<List<Integer>> result = new ArrayList<List<Integer>>();

		if (numRows == 0)
			return result;

		List<Integer> list = new ArrayList<Integer>();

		list.add(1);

		result.add(list);
		if (numRows == 1)
			return result;

		list = new ArrayList<Integer>();

		list.add(1);
		list.add(1);

		result.add(list);

		if (numRows == 2)
			return result;

		// 从第三行开始即可
		for (int i = 2; i < numRows; i++) {

			// 构造每一行，第n行的个数是n,第一个和最后一个数字都是1

			List<Integer> current = new ArrayList<Integer>();

			// 每一行第一个元素
			current.add(1);
			//获取上一行元素的列表
			List<Integer> last = result.get(i - 1);

			// 第i行的个数是i-1个
			for (int j = 1; j < i; j++) {
				current.add(last.get(j - 1) + last.get(j));// 这一行第i个数为上一行第i-1和第i个数的和
			}

			// 每一行的最后为1
			current.add(1);

			result.add(current);
		}

		return result;
	}

}
