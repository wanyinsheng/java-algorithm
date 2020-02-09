package com.wanali.stack;

import java.util.HashMap;
import java.util.Stack;
/**
 * 有效的括号
 * 
 * 给定一个只包括 '('，')'，'{'，'}'，'['，']' 的字符串，判断字符串是否有效。

有效字符串需满足：

左括号必须用相同类型的右括号闭合。
左括号必须以正确的顺序闭合。
注意空字符串可被认为是有效字符串。

示例 1:

输入: "()"
输出: true
示例 2:

输入: "()[]{}"
输出: true
示例 3:

输入: "(]"
输出: false
示例 4:

输入: "([)]"
输出: false
示例 5:

输入: "{[]}"
输出: true

 * @author wanyinsheng
 *
 * @date 2020年1月7日下午8:36:18
 *
 */
public class IsValid {
	public static boolean isValid(String s) {
		//空串返回true
		if (s == null || "".equals(s)) {
			return true;
		}
		Stack<Character> stack = new Stack<Character>();
		//将(),[],{}做键值对存储在map
		HashMap<Character, Character> hashMap = new HashMap<Character,Character>();
		hashMap.put('(', ')');
		hashMap.put('[', ']');
		hashMap.put('{', '}');
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			//字符是map的键，即使括号的左半部分
			if (hashMap.containsKey(c)) {
				stack.add(c);
			}else {
				//先判断栈是否为空，如果为空直接返回true
				if (stack.empty()) {
					return false;
				}
				//取出栈顶元素
				char peak=stack.pop();
				if (hashMap.get(peak)!=c) {
					return false;
				}
				
			}
			
		}
		//最后判断栈是否为空才是正解，如果左括号多余右括号是返回false
		return stack.empty();
	}

	public static void main(String[] args) {
		String s1 = new String("()");
		String s2 = new String("()[]{}");
		String s3 = new String("(]");
		String s4 = new String("([)]");
		String s5 = new String("{[]}");
		System.out.println(isValid(s1));
		System.out.println(isValid(s2));
		System.out.println(isValid(s3));
		System.out.println(isValid(s4));
		System.out.println(isValid(s5));
		
		

	}

}
