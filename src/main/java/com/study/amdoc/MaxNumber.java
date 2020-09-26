package com.study.amdoc;

public class MaxNumber {

	public static void findMaxNumber(int[] ary) {
		int max = ary[0];

		for (int i = 1; i < ary.length; i++)
			if (ary[i] > max) {
				max = ary[i];
			}
				

		System.out.println(max);
	}

	public static void main(String[] args) {
		int ary[] = { 1000, 324, 45, 90, 98 };
		findMaxNumber(ary);
	}
}
