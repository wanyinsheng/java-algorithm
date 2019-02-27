package com.wanali.hash_table;

import java.util.HashMap;
import java.util.Map;

/**
 * 字符串中的第一个唯一字符
 * 
 * 给定一个字符串，找到它的第一个不重复的字符，并返回它的索引。如果不存在，则返回 -1。
 * 
 * s = "leetcode" 返回 0.
 * 
 * s = "loveleetcode", 返回 2.
 * 
 * @author wan_ys
 *
 *         2019年2月27日下午8:31:18
 */
public class FirstUniqChar {
	public static void main(String[] args) {
		System.out.println(firstUniqChar("leetcode"));
		System.out.println(firstUniqChar("loveleetcode"));
	}

	static int firstUniqChar(String s) {
		Map<Integer, Character> map = new HashMap<Integer, Character>();
		for (int i = 0; i < s.length(); i++) {
			map.put(i, s.charAt(i));
		}
		// 这里有一个lastIndexOf()
		for (int i = 0; i < s.length(); i++) {
			if (i != s.lastIndexOf(s.charAt(i))) {
				map.remove(i);// 删除有重复元素的第一个元素
				map.remove(s.lastIndexOf(s.charAt(i)));// 删除有重复元素的最后一个元素
			}
		}
		if (map.isEmpty()) {// map为空，代表没有单一的元素
			return -1;
		} else {
			for (Integer j : map.keySet()) {// 不空返回map第一个元素的键值
				return j;
			}
		}
		return -1;
	}

}
