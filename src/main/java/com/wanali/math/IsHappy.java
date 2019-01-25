package com.wanali.math;

/**
 * 快乐数 编写一个算法来判断一个数是不是“快乐数”。
 * 
 * 一个“快乐数”定义为：对于一个正整数，每一次将该数替换为它每个位置上的数字的平方和，然后重复这个过程直到这个数变为 1，也可能是无限循环但始终变不到
 * 1。如果可以变为 1，那么这个数就是快乐数。
 * 输入: 19 输出: true
 * @author wan_ys
 *
 * 2019年1月25日上午8:30:16
 */
public class IsHappy {
	public static void main(String[] args) {
		int n = 2;
		System.out.println(isHappy(n));
	}

	/**
	 * 判断当和是一位数时的情况，可知当出现4时，就永远不会变为1 1会无限循环下去
	 * 2->4->16->37->58->89->145->42->20->4无线循环,有4的循环
	 * 3->9->81->65->61-37-58->89跟2相同，陷入4的循环 4->16跟2相同,陷入4的循环
	 * 5->25->29->85->89跟2相同，陷入循环 6->36->45->41->37跟2相同，陷入4的循环
	 * 7->49-97->130->10->1跟1相同，陷入1循环 8->64->52->29->85->89跟2相同，陷入4循环
	 * 9->81->65->61->37->58跟2相同，陷入4的循环
	 * 
	 * @param n
	 * @return
	 */
	static boolean isHappy(int n) {
		int sum = 0;
		// 求各位数字平方之和
		while (n > 0) {
			int i = n % 10;
			sum += i * i;
			n = n / 10;
		}
		// 如果各位数字的平方和是两位数，继续递归
		if (sum >= 10) {
			return isHappy(sum);

		}
		if (sum == 4) {
			return false;
		}
		if (sum < 10 && sum != 1) {
			return isHappy(sum);
		}
		// 如果是1 则为快乐数
		if (sum == 1) {
			return true;
		}

		return false;
	}

}
