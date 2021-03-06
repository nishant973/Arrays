package com.nishant.array.searching;

import java.security.SecureRandom;
import java.util.Scanner;

// Best Case  : O(1)
// Worst Case : O(n)

public class LinearSearch {

	//private static Logger logger = Logger.getLogger("com.nishant.array.searching.LinearSearch");
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the size of array...");
		int size = scanner.nextInt();
		int[] arr = new int[size];
		for(int i=0;i<arr.length;i++) {
			arr[i] = new SecureRandom().nextInt(100);
		}
		System.out.println("array is created with size: " + size +  " and limited to 100...");
		printArray(arr);
		System.out.println("Enter the number to be sarched...");
		int number = scanner.nextInt();
		int index = 0;
		index = linearSearch(arr, number, index);
		if(index == 0) {
			System.out.println("number is not prsent in array...");
		}else {
			System.out.println("number is present at index : " + index);
		}
		scanner.close();
	}

	private static int linearSearch(int[] arr, int number, int index) {
		for(int i=0;i<arr.length;i++) {
			if(arr[i] == number) {
				index = i;
			}
		}
		return index;
	}

	private static void printArray(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]  + " ");
		}
		System.out.println();
	}
}