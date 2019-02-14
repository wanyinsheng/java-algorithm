package com.wanali.hash_table;

import java.util.HashMap;
import java.util.Map;

/**
 * 同构字符串
 * 
 * 给定两个字符串 s 和 t，判断它们是否是同构的。
 * 
 * 如果 s 中的字符可以被替换得到 t ，那么这两个字符串是同构的。
 * 
 * 所有出现的字符都必须用另一个字符替换，同时保留字符的顺序。两个字符不能映射到同一个字符上，但字符可以映射自己本身。
 * 
 * 输入: s = "egg", t = "add" 输出: true 
 * 
 * 输入: s = "foo", t = "bar" 输出: false 
 * 
 * 输入: s = "paper", t = "title" 输出: true
 * 
 * s和t具有相同的长度
 * 
 * @author wan_ys
 *
 *         2019年2月14日下午4:46:58
 */
public class IsIsomorphic {
	public static void main(String[] args) {
		System.out.println(isIsomorphic("egg", "add"));
		System.out.println(isIsomorphic("foo", "bar"));
		System.out.println(isIsomorphic("paper", "title"));
	}

	static boolean isIsomorphic(String s, String t) {
		Map<Character, Character> sMap = new HashMap<Character, Character>();
		Map<Character, Character> tMap = new HashMap<Character, Character>();
		for (int i = 0; i < s.length(); i++) {
			char sKey = s.charAt(i);// 获取该位置的键或值
			char tKey = t.charAt(i);
			// 如果键还没有映射，就添加映射，s的键作为t的值，t的键作为s的值
			if (sMap.get(sKey) == null ) {
				if (tMap.containsKey(tKey)) {//sMap的键为空，但tMap的键不为空，表示没有一一对应
					return false;
				}
				sMap.put(sKey, tKey);
				tMap.put(tKey, sKey);
			} else if (sMap.get(sKey) != tKey || tMap.get(tKey) != sKey) {// 对前面已有的映射检查，是否满足该对应的映射
				return false;
			}
		}
		return true;
	}

}
