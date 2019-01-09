package com.wanali.string;
/**
 * 实现整数反转
 * @author wan_ys
 *
 * 2019年1月6日下午2:21:47
 */
public class Reverse {
	public static void main(String[] args) {
		System.out.println(reverse(123));
		System.out.println(reverse(-123));
		System.out.println(reverse(120));
		//2的31次方-1,最高位位符号位
		System.out.println(reverse(2147483647));
	}

	static int reverse(int x) {
		String string;
		StringBuffer stringBuffer = new StringBuffer();
		if (-2L << 31 < x && x < 2L << 31 - 1) {
			if (x >= 0) {
				string = Integer.toString(x);
				stringBuffer.append(string);
				StringBuffer reverse = stringBuffer.reverse();
				String string2 = reverse.toString();
				try {
					x=Integer.parseInt(string2);
				} catch (Exception e) {
					return 0;
				}
			} else {
				x = -x;
				string = Integer.toString(x);
				stringBuffer.append(string);
				StringBuffer reverse = stringBuffer.reverse();
				String string2 = reverse.toString();
				try {
					x = -Integer.parseInt(string2);
				} catch (Exception e) {
					return 0;
				}
				
			}
		}
		return x;

	}

}
