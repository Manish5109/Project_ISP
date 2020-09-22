package com.study.amdoc;

public class ReverseString {

	public static void reverse(String str) {

		String revString = "";

		for (int i = str.length() - 1; i >= 0; --i) {
			revString += str.charAt(i);
		}
		System.out.println(revString);
	}

	public static void main(String[] args) {
		reverse("manish");
	}
}
