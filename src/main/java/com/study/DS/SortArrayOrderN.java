package com.study.DS;

public class SortArrayOrderN {

	public static void printArray(int arr[], int N) {

		for (int i = 0; i < N; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	public static void sortArray(int arr[], int N) {

		for (int i = 0; i < N;) {
			if (arr[i] == i + 1) {
				i++;
			} else {
				int temp1 = arr[i];
				int temp2 = arr[arr[i] - 1];
				arr[i] = temp2;
				arr[temp1 - 1] = temp1;
			}
		}
	}

	public static void main(String[] args) {
		int arr[] = { 2, 1, 5, 3, 4 ,11,22,22,33};
		int N = arr.length;

		// Function call to sort the array
		sortArray(arr, N);

		// Function call to print the array
		printArray(arr, N);
	}

}
