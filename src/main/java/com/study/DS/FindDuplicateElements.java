package com.study.DS;

import java.util.HashSet;
import java.util.Set;

public class FindDuplicateElements {
	
	public static void duplicateFindBySet() {
		Set<Integer> set = new HashSet<Integer>();
		int[] value= {11,22,33,44,55,22,33};
		for(int val : value) {
			if(set.add(val) == false) {
				System.out.println(val);
			}
		}
	}
	
	/**
	 * order(n*n)
	 */
	public static void findDuplicateByLoop() {
		int[] value= {11,22,33,44,55,22,33};
		
		for(int i=0; i<value.length; i++) {
			for(int j=i+1; j <value.length; j++) {
				if(value[i] == value[j]) {
					System.out.println(value[i]);
				}
			}
		}
	}
	
	
	/**
	 * order(n)
	 */
	public static void findDuplicate() {
		int ary[] = { 4, 2, 4, 5, 2, 3, 1,5,1 };
		int[] countArray = new int[ary.length];
		for(int i=0; i<ary.length; i++) {
			if(countArray[ary[i]] ==1) {
				System.out.println(ary[i]);
			}else {
				countArray[ary[i]]++;
			}
		}
	}

	public static void main(String[] args) {
		// duplicateFindBySet();
		// findDuplicateByLoop();
		//findDuplicate();
		
		findDuplicate();
	}
}
