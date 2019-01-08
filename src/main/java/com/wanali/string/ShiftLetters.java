package com.wanali.string;

import java.util.Arrays;

/**
 * 有一个由小写字母组成的字符串 s，和一个整数数组 shifts。
 * 
 * 我们将字母表中的下一个字母称为原字母的 移位（由于字母表是环绕的， 'z' 将会变成 'a'） 对于每个 shifts[i] = x ， 我们会将 s
 * 中的前 i+1 个字母移位 x 次。
 * 
 * @author wan_ys
 *
 *         2019年1月8日下午12:08:31
 */
public class ShiftLetters {
	public static void main(String[] args) {
		String string = "abi";
		int[] shifts = new int[] { 3, 5, 19 };
		System.out.println(shiftLetters(string, shifts));

		String string2 = "mkgfzkkuxownxvfvxasy";
		int[] is = new int[] { 505870226, 437526072, 266740649, 224336793, 532917782, 311122363, 567754492, 595798950,
				81520022, 684110326, 137742843, 275267355, 856903962, 148291585, 919054234, 467541837, 622939912,
				116899933, 983296461, 536563513 };
		System.out.println(shiftLetters2(string2, is));

	}

	/**
	 * 这个函数是针对数据较小时，先对移位的数据取模变小，在利用一个数组求出真实的移位情况，因为只涉及到32以内的移位，因此，对这个求和之后的数组还要取模
	 * 如果移位位正，且不在a-z之间，利用-该正数的补数计算 同理移位位负，且不在a-z之间，利用+该负数的补数计算
	 * 
	 * @param s
	 * @param shifts
	 * @return
	 */
	static String shiftLetters(String s, int[] shifts) {
		int[] realShifts = new int[shifts.length];
		// 给新定义真实移动位数的数组赋值
		for (int i = 0; i < realShifts.length; i++) {
			for (int j = i; j < shifts.length; j++) {
				realShifts[i] += shifts[j];
			}
			// 如果要移位大于26，先取余数
			realShifts[i] = realShifts[i] % 26;
		}
		// 打印一下真实移位情况
		System.out.println("为了更直观的看到移动的位数,打印真实的移位情况:");
		System.out.println(Arrays.toString(realShifts));
		char[] cs = s.toCharArray();
		// 对于每一个shift[i],前面的i+1个元素都加shift[i]
		for (int i = 0; i < cs.length; i++) {
			// 判断是否在a-z之间,如果超过了，直接减去该数的补数(模为26)
			if (cs[i] + realShifts[i] < 'a' || cs[i] + realShifts[i] > 'z') {
				cs[i] = (char) (cs[i] - (26 - realShifts[i]));
			} else {
				cs[i] = (char) (cs[i] + realShifts[i]);
			}
		}
		StringBuffer stringBuffer = new StringBuffer();
		for (int i = 0; i < cs.length; i++) {
			stringBuffer.append(cs[i]);
		}
		String string = stringBuffer.toString();
		return string;
	}

	/**
	 * 这个函数是针对数据较大时，先对移位的数据取模变小，在利用一个数组求出真实的移位情况，因为只涉及到32以内的移位，因此，对这个求和之后的数组还要取模
	 * 如果移位位正，且不在a-z之间，利用-该正数的补数计算 同理移位位负，且不在a-z之间，利用+该负数的补数计算
	 * 
	 * @param s
	 * @param shifts
	 * @return
	 */
	static String shiftLetters2(String s, int[] shifts) {
		char[] cs = s.toCharArray();
		// 定义一个需要移动位数的真实数组
		int[] realShifts = new int[shifts.length];
		// 由于数据较大，先取模
		for (int i = 0; i < realShifts.length; i++) {
			shifts[i] = shifts[i] % 26;
		}
		// 相加之后再取模获得真实移位数组
		for (int i = 0; i < realShifts.length; i++) {
			for (int j = i; j < realShifts.length; j++) {
				realShifts[i] += shifts[i];
			}
			realShifts[i] = realShifts[i] % 26;
		}
		System.out.println("打印真实的数组:");
		System.out.println(Arrays.toString(realShifts));
		for (int i = 0; i < cs.length; i++) {
			// realShifts[i] >= 0，向后移动
			if (realShifts[i] >= 0) {
				// 不在a-z之间进减去该数的补数(模26) 26 - realShifts[i]即一个正数的模26的补数
				if (cs[i] + realShifts[i] < 'a' || cs[i] + realShifts[i] > 'z') {
					cs[i] = (char) (cs[i] - (26 - realShifts[i]));
				} else {
					cs[i] = (char) (cs[i] + realShifts[i]);
				}
			} else { // realShifts[i] < 0向前移动
				if (cs[i] + realShifts[i] < 'a' || cs[i] + realShifts[i] > 'z') {
					// 不在a-z之间，加上该数的补数(模26) 26 + realShifts[i]即一个负数的模26的补数
					cs[i] = (char) (cs[i] + (26 + realShifts[i]));
				} else {
					cs[i] = (char) (cs[i] + realShifts[i]);
				}
			}
		}
		StringBuffer stringBuffer = new StringBuffer();
		for (int i = 0; i < cs.length; i++) {
			stringBuffer.append(cs[i]);
		}
		String string = stringBuffer.toString();
		return string;
	}
}
