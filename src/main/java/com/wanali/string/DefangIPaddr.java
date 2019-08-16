package com.wanali.string;

/**
 * 1108.IP地址无效化
 * 
 *  给你一个有效的 IPv4 地址 address，返回这个 IP 地址的无效化版本。
 *  所谓无效化 IP 地址，其实就是用 "[.]" 代替了每个 "."。
 *  
 *  输入：address = "1.1.1.1"  输出："1[.]1[.]1[.]1"
 *  
 *  输入：address = "255.100.50.0"  输出："255[.]100[.]50[.]0"
 * 
 * @author wan_ys
 *
 * @date 2019年8月16日下午12:19:43
 *
 */
public class DefangIPaddr {
	public static void main(String[] args) {
		String address1 = "1.1.1.1";
		String address2 = "255.100.50.0";
		System.out.println(defangIPaddr(address1));
		System.out.println(defangIPaddr(address2));
	}

	/**
	 * 直接调用字符串的replace函数
	 * 
	 * @param address
	 * @return
	 */
	static String defangIPaddr(String address) {
		return address.replace(".", "[.]");

	}

}
