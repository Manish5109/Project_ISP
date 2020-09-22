package com.study.amdoc;

public class Fibonacci {

	static int fib(int n) {
		int preNumber = 0;
		int nextNumber = 1;
		int sum;
		if (n == 0)
			return preNumber;
		for (int i = 2; i <= n; i++) {
			sum = preNumber + nextNumber;
			preNumber = nextNumber;
			nextNumber = sum;
		}
		return nextNumber;
	}

	public static void main(String args[]) {
		int n = 9;
		System.out.println(fib(n));
	}
}
