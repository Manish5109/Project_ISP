package com.study.DS;

public class BubbleSort {
	
	public static void bubbleSort(int[] arr) {
		int n = arr.length;
		int temp = 0;
		for (int i = 0; i < n; i++) {
			for (int j = 1; j < (n - i); j++) {
				if (arr[j - 1] > arr[j]) {
					// swap elements
					temp = arr[j - 1];
					arr[j - 1] = arr[j];
					arr[j] = temp;
				}
			}
			
		}
		for(int i=0; i<n; i++) {
			System.out.println(arr[i]);
		}
	}

	public static void main(String[] args) {
		int[] ary= {1,4,7,2,9,11,56,33,4};
		bubbleSort(ary);
	}
}
