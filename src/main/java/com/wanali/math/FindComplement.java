package com.wanali.math;

/**
 * 数字的补数 给定一个正整数，输出它的补数。补数是对该数的二进制表示取反。 
 * 输入: 5 输出: 
 * 2 输入: 1 输出: 0
 * 
 * @author wan_ys
 *
 * 2019年1月26日上午9:07:20
 */
public class FindComplement {
	public static void main(String[] args) {
		int num = 5;
		int num1 = 1;
		System.out.println(findComplement(num));
		System.out.println(findComplement(num1));
	}

	/**
	 * 先将十进制数转换为二进制字符串，利用字符数组取反之后再转换为十进制数
	 * 
	 * @param num
	 * @return
	 */
	static int findComplement(int num) {
		String binaryString = Integer.toBinaryString(num);
		StringBuffer stringBuffer = new StringBuffer();
		char[] cs = binaryString.toCharArray();
		// 利用字符数组进行取反操作
		for (int i = 0; i < cs.length; i++) {
			if (cs[i] == '1') {
				cs[i] = '0';
			} else {
				cs[i] = '1';
			}
			stringBuffer.append(cs[i]);
		}
		int result = Integer.parseInt(stringBuffer.toString(), 2);// 将2进制的数转换为10进制数
		return result;
	}

}
