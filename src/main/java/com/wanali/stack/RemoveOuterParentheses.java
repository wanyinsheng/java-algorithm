package com.wanali.stack;

import java.util.Stack;

/**
 * 1021.删除最外层的括号
 * 
 * 有效括号字符串为空 ("")、"(" + A + ")" 或 A + B，其中 A
 * 和 B 都是有效的括号字符串，+ 代表字符串的连接。例如，""，"()"，"(())()" 和 "(()(()))" 都是有效的括号字符串。
 * 
 * 如果有效字符串 S 非空，且不存在将其拆分为 S = A+B 的方法，我们称其为原语（primitive），其中 A 和 B 都是非空有效括号字符串。
 * 
 * 给出一个非空有效字符串 S，考虑将其进行原语化分解，使得：S = P_1 + P_2 + ... + P_k，其中 P_i 是有效括号字符串原语。
 * 
 * 对 S 进行原语化分解，删除分解中每个原语字符串的最外层括号，返回 S 。
 * 
 * 输入："(()())(())" 输出："()()()" 解释： 输入字符串为 "(()())(())"，原语化分解得到 "(()())" +
 * "(())"， 删除每个部分中的最外层括号后得到 "()()" + "()" = "()()()"。
 *
 * 
 * 输入："(()())(())(()(()))" 输出："()()()()(())" 解释： 输入字符串为
 * "(()())(())(()(()))"，原语化分解得到 "(()())" + "(())" + "(()(()))"， 删除每隔部分中的最外层括号后得到
 * "()()" + "()" + "()(())" = "()()()()(())"。
 * 
 * 输入："()()" 输出："" 解释： 输入字符串为 "()()"，原语化分解得到 "()" + "()"， 删除每个部分中的最外层括号后得到 "" +
 * "" = ""。
 * 
 * @author wan_ys
 *
 * @date 2019年8月16日下午3:10:00
 *
 */
public class RemoveOuterParentheses {
	public static void main(String[] args) {
		String s1 = "(()())(())";
		System.out.println(removeOuterParentheses(s1));
		String s2 = "(()())(())(()(()))";
		System.out.println(removeOuterParentheses(s2));
		String s3 = "()()";
		System.out.println(removeOuterParentheses(s3));
	}

	static String removeOuterParentheses(String S) {
		char[] bytes = S.toCharArray();
		Stack<Character> stack = new Stack<Character>();
		String part = "";
		String result = "";
		for (int i = 0; i < S.length(); i++) {
			if (bytes[i] == '(') {// 左括号
				stack.push(bytes[i]);
				part += bytes[i];
			} else {// 右括号
				part += bytes[i];
				stack.pop();
			}

			if (stack.isEmpty()) {// 栈空,这是分解的一部分,需要将最外层的括号去掉
				part = part.substring(1, part.length() - 1);
				result += part;
				part = "";
			}

		}
		return result;
	}

}
