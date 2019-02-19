package com.wanali.string;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * 唯一摩尔斯密码词
 * 
 * 国际摩尔斯密码定义一种标准编码方式，将每个字母对应于一个由一系列点和短线组成的字符串， 比如: "a" 对应 ".-", "b" 对应 "-...",
 * "c" 对应 "-.-.", 等等。
 * 
 * 为了方便，所有26个英文字母对应摩尔斯密码表如下：
 * 
 * [".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."]
 * 给定一个单词列表，每个单词可以写成每个字母对应摩尔斯密码的组合。例如，"cab" 可以写成 "-.-..--..."，(即 "-.-." + "-..."
 * + ".-"字符串的结合)。我们将这样一个连接过程称作单词翻译。
 * 
 * 返回我们可以获得所有词不同单词翻译的数量。
 * 
 * 输入: words = ["gin", "zen", "gig", "msg"] 输出: 2 解释: 各单词翻译如下: "gin" ->
 * "--...-." "zen" -> "--...-." "gig" -> "--...--." "msg" -> "--...--."
 * 
 * 共有 2 种不同翻译, "--...-." 和 "--...--.".
 * 
 * @author wan_ys
 *
 *         2019年2月19日下午8:02:07
 */
public class UniqueMorseRepresentations {
	public static void main(String[] args) {
		System.out.println(uniqueMorseRepresentations(new String[] { "gin", "zen", "gig", "msg" }));
	}

	static int uniqueMorseRepresentations(String[] words) {
		Set<String> set = new HashSet<String>();// 利用Set的性质求不同翻译的数量
		String[] strings = { ".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..", "--",
				"-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--.." };
		char[] cs = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's',
				't', 'u', 'v', 'w', 'x', 'y', 'z' };
		Map<Character, String> map = new HashMap<Character, String>();
		for (int i = 0; i < cs.length; i++) {
			map.put(cs[i], strings[i]);
		}
		int len = 0;// words中每个单词的大小
		for (int i = 0; i < words.length; i++) {// 遍历words中的每个单词
			len = words[i].length();
			String string = null;
			for (int j = 0; j < len; j++) {// 遍历单词的第j个字符
				string += map.get(words[i].charAt(j));// 从map中找到对应的摩尔斯密码
			}
			set.add(string);// 求不同密码的个数
		}
		return set.size();
	}

}
