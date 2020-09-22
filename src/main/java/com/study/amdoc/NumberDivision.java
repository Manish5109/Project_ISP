package com.study.amdoc;

public class NumberDivision {
	
	public static void divide(int limit, int[] ary) {
		for (int num = 0; num < limit; num++) {
			if (num % ary[0] == 0 && num % ary[1] == 0)
				System.out.println(num + " ");
		}
	}


	public static void main(String[] args) {
		int limit = 100;
		int[] ary= {3,5};
		divide(limit, ary);
	}
}
