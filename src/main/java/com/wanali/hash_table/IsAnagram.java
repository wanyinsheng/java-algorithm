package com.wanali.hash_table;

import java.util.HashMap;

/**
 * 有效的字母异位词
 * 
 * 给定两个字符串 s 和 t ，编写一个函数来判断 t 是否是 s 的一个字母异位词。
 * 
 * 输入: s = "anagram", t = "nagaram" 输出: true 
 * 
 * 输入: s = "rat", t = "car" 输出: false 说明: 你可以假设字符串只包含小写字母。
 * 
 * @author wan_ys
 *
 *         2019年2月19日下午4:31:53
 */
public class IsAnagram {
	public static void main(String[] args) {
		System.out.println(isAnagram("anagram", "nagaram"));
		System.out.println(isAnagram("rat", "car"));
	}

	static boolean isAnagram(String s, String t) {
		if (s.length() != t.length()) {// 长度不相等肯定不是有效的字母异位词
			return false;
		}
		HashMap<Character, Integer> hashMap = new HashMap<Character, Integer>();
		for (int i = 0; i < s.length(); i++) {
			if (hashMap.containsKey(s.charAt(i))) {
				hashMap.put(s.charAt(i), hashMap.get(s.charAt(i)) + 1);// 统计各个字母的个数
			} else {
				hashMap.put(s.charAt(i), 1);// 只出现一次
			}
		}
		for (int i = 0; i < t.length(); i++) {
			if (hashMap.containsKey(t.charAt(i))) {
				hashMap.put(t.charAt(i), hashMap.get(t.charAt(i)) - 1);
				// 如果减到0，即该字母在两个字符串中出现的次数相等
				if (hashMap.get(t.charAt(i)) == 0) {
					hashMap.remove(t.charAt(i));

				}
			} else {
				return false;
			}
		}
		return true;
	}

}
