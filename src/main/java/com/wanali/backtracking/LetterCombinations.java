package com.wanali.backtracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/**
 * 17.电话号码的字母组合
 * 
 * 给定一个仅包含数字 2-9 的字符串，返回所有它能表示的字母组合。
 * 
 * 给出数字到字母的映射如下（与电话按键相同）。注意 1 不对应任何字母。
 * 
 * 输入："23"
 * 
 * 输出：["ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf"].
 * 
 * @author wanyinsheng
 *
 * @date 2020年2月9日下午5:39:41
 *
 */
public class LetterCombinations {
	HashMap<String, String> map = new HashMap<String, String>() {
		{
			put("2", "abc");
			put("3", "def");
			put("4", "ghi");
			put("5", "jkl");
			put("6", "mno");
			put("7", "pqrs");
			put("8", "tuv");
			put("9", "wxyz");
		}
	};
	List<String> result = new ArrayList<String>();

	public static void main(String[] args) {
		LetterCombinations letterCombinations = new LetterCombinations();
		System.out.println(Arrays.toString(letterCombinations.letterCombinations("23").toArray()));

	}

	public List<String> letterCombinations(String digits) {
		if (digits.length() != 0) {
			backtrack("", digits);
		}
		return result;
	}

	public void backtrack(String combination, String next_digits) {
		if (next_digits.length() == 0) {
			result.add(combination);
		} else {
			// 取当前第一个数字
			String digit = next_digits.substring(0, 1);
			// 从map中取字母
			String letters = map.get(digit);
			for (int i = 0; i < letters.length(); i++) {
				String letter = letters.substring(i, i + 1);
				// 取出当前字母之后添加到结果集中
				backtrack(combination + letter, next_digits.substring(1));
			}
		}
	}

}
