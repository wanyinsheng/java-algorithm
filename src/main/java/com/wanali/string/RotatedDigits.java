package com.wanali.string;

/**
 * 788.旋转数字
 * 
 * 我们称一个数 X 为好数, 如果它的每位数字逐个地被旋转 180 度后，我们仍可以得到一个有效的，且和 X 不同的数。要求每位数字都要被旋转。
 * 
 * 如果一个数的每位数字被旋转以后仍然还是一个数字， 则这个数是有效的。0, 1, 和 8 被旋转后仍然是它们自己；2 和 5 可以互相旋转成对方；6 和 9
 * 同理，除了这些以外其他的数字旋转以后都不再是有效的数字。
 * 
 * 现在我们有一个正整数 N, 计算从 1 到 N 中有多少个数 X 是好数？
 * 
 * 示例:
 * 
 * 输入: 10 输出: 4
 * 
 * 解释: 在[1, 10]中有四个好数： 2, 5, 6, 9。 注意 1 和 10 不是好数, 因为他们在旋转之后不变。
 * 
 * 
 * @author wanyinsheng
 *
 * @date 2020年2月10日下午1:09:41
 *
 */
public class RotatedDigits {
	public static void main(String[] args) {
		System.out.println(rotatedDigits(10));
	}

	static int rotatedDigits(int N) {
		int result = 0;
		for (int i = 1; i <= N; i++) {
			if (good(i, false))

				result++;
		}

		return result;
	}

	static boolean good(int i, boolean flag) {
		if (i == 0)
			return flag;
		int d = i % 10;// 取数字的每一位
		if (d == 3 || d == 4 | d == 7)
			return false;
		if (d == 0 || d == 1 || d == 8)
			return good(i / 10, flag);
		return good(i / 10, true);
	}

}
