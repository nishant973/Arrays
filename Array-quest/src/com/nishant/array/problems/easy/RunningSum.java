package com.nishant.array.problems.easy;

import java.security.SecureRandom;
import java.util.Scanner;

//O(n)
public class RunningSum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length of array : ");
		int length = sc.nextInt();
		int[] arr = new int[length];
		for(int i=0;i<arr.length;i++) {
			arr[i] = new SecureRandom().nextInt(100);
		}
		System.out.print("Array created with elements : ");
		printArray(arr);
		sc.close();
		runningSum(arr);
		
	}

	private static void runningSum(int[] arr) {
		int[] runningArr = new int[arr.length];
		int sum = 0;
		for(int i=0;i<runningArr.length;i++) {
			sum = sum + arr[i];
			runningArr[i] = sum;
		}
		System.out.print("running array is : ");
		printArray(runningArr);
	}

	private static void printArray(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]  + " ");
		}
		System.out.println();
	}
}
