package com.wanali.string;

import java.util.HashSet;
import java.util.Set;

/**
 * 每封电子邮件都由一个本地名称和一个域名组成，以 @ 符号分隔。
 * 
 * 例如，在 alice@leetcode.com中， alice 是本地名称，而 leetcode.com 是域名。
 * 
 * 除了小写字母，这些电子邮件还可能包含 ',' 或 '+'。
 * 
 * 如果本地名称中有.和没有.都表示同一个地址,+后面的本地名称会忽略 域名中的的.和+不会被忽略
 * 输入：["test.email+alex@leetcode.com","test.e.mail+bob.cathy@leetcode.com","testemail+david@lee.tcode.com"]
 * 输出：2 
 * 解释：实际收到邮件的是 "testemail@leetcode.com" 和 "testemail@lee.tcode.com"。
 * 
 * @author wan_ys
 *
 * 2019年1月7日上午10:22:24
 */
public class NumUniqueEmails {
	public static void main(String[] args) {
		String[] emails = new String[] { "test.email+alex@leetcode.com", "test.e.mail+bob.cathy@leetcode.com",
				"testemail+david@lee.tcode.com" };
		System.out.println(numUniqueEmails(emails));
	}

	static int numUniqueEmails(String[] emails) {
		String localName;
		String domainName;
		String realEmail;
		Set<String> set = new HashSet<String>();
		for (int i = 0; i < emails.length; i++) {
			// 取本地名称，即@以前的子串
			localName = emails[i].substring(0, emails[i].indexOf("@"));
			// 取域名，即@以后的子串
			domainName = emails[i].substring(emails[i].indexOf("@"));
			// 去除本地名称中的.
			localName = localName.replace(".", "");
			// 取+前面的子串
			localName = localName.substring(0, localName.indexOf("+"));
			realEmail = localName + "@" + domainName;
			set.add(realEmail);
		}
		return set.size();

	}

}
