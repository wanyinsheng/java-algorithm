package com.wanali.math;

/**
 * 	坏了的计算器
 * 
 * 在显示着数字的坏计算器上，我们可以执行以下两种操作：
 * 
 * 双倍（Double）：将显示屏上的数字乘 2； 递减（Decrement）：将显示屏上的数字减 1 。 最初，计算器显示数字 X。
 * 
 * 返回显示数字 Y 所需的最小操作数。
 * 
 * 输入：X = 2, Y = 3 输出：2 解释：先进行双倍运算，然后再进行递减运算 {2 -> 4 -> 3}. 
 * 
 * 输入：X = 5, Y = 8 输出：2 解释：先递减，再双倍 {5 -> 4 -> 8}. 
 * 
 * 输入：X = 3, Y = 10 输出：3 解释：先双倍，然后递减，再双倍 {3 -> 6 -> 5 -> 10}. 
 * 
 * 输入：X = 1024, Y = 1 输出：1023 解释：执行递减运算 1023 次
 * 
 * @author wan_ys
 *
 *         2019年3月7日下午6:01:42
 */
public class BrokenCalc {
	public static void main(String[] args) {
		System.out.println(brokenCalc(2, 3));
		System.out.println(brokenCalc(5, 8));
		System.out.println(brokenCalc(3, 10));
		System.out.println(brokenCalc(1024, 1));
	}
	/**
	 * 倒着看Y->X变形有/2和+1操作
	 * @param X
	 * @param Y
	 * @return
	 */
	static int brokenCalc(int X, int Y) {
		int result=0;
		while(X<Y) {
			if (Y%2==0) {//偶数的话就先除以2
				Y=Y/2;
				result++;
			}else {//奇数的情况先+1
				Y=Y+1;
				result++;
			}
		}
		return result+X-Y;//这里的X-Y表示这Y在某一次除以2之后变的比X小了，因此要加1操作变到X,如第二个例子
	}
}
