package com.wanali.array;

import java.util.LinkedList;
import java.util.List;

public class Subsets {
	public static void main(String[] args) {
		
	}
	static List<List<Integer>> subsets(int[] nums){
		List<List<Integer>> result=new LinkedList<List<Integer>>();
		for (int i = 0; i < nums.length; i++) {
			List<Integer> list=new LinkedList<Integer>();
			for (int j = i+1; j < nums.length; j++) {
				
			}
		}
		
		return result;
	}

}
