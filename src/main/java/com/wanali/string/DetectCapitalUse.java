package com.wanali.string;

/**
 * 检测大写字母
 * 
 * 给定一个单词，你需要判断单词的大写使用是否正确。
 * 
 * 我们定义，在以下情况时，单词的大写用法是正确的：
 * 
 * 全部字母都是大写，比如"USA"。 单词中所有字母都不是大写，比如"leetcode"。 如果单词不只含有一个字母，只有首字母大写， 比如
 * "Google"。 否则，我们定义这个单词没有正确使用大写字母。
 * 
 * 输入: "USA" 输出: True 
 * 
 * 输入: "FlaG" 输出: False
 * 
 * @author wan_ys
 *
 *         2019年2月21日下午3:29:51
 */
public class DetectCapitalUse {
	public static void main(String[] args) {
		System.out.println(detectCapitalUse("USA"));
		System.out.println(detectCapitalUse("FlaG"));
	}

	static boolean detectCapitalUse(String word) {
		// 只有一个字母时
		if (word.length() == 1) {
			return true;
		}
		// 首字母小写
		int len = word.length();
		if (word.charAt(0) >= 'a' && word.charAt(0) <= 'z') {
			for (int i = 1; i < len; i++) {// 从第二个字母开始判断出现大写字母，若出现，返回false
				if (word.charAt(i) >= 'A' && word.charAt(i) <= 'Z') {
					return false;
				}
			}
		}
		// 首字母大写
		if (word.charAt(0) >= 'A' && word.charAt(0) <= 'Z') {
			// 第二个字母也是大写，因此后面的字母也只能是大写
			if (word.charAt(1) >= 'A' && word.charAt(1) <= 'Z') {
				for (int i = 2; i < len; i++) {
					if (word.charAt(i) >= 'a' && word.charAt(i) <= 'z') {// 从第三个字母开始出现了小写字母
						return false;
					}
				}
			} else {// 第二个字母是小写
				for (int i = 2; i < len; i++) {
					if (word.charAt(i) >= 'A' && word.charAt(i) <= 'Z') {// 如果从第三个来时出现了大写字母返回false
						return false;
					}
				}
			}

		}
		return true;
	}

}
