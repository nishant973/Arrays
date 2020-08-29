package com.nishant.array.problems;

import java.util.Scanner;

public class ArrayRotation {

	public static void main(String[] args) {
		int[] arr = new int[]{1,3,6,43,65,12,76,4,90};
		System.out.println("Enter the number for the rotation");
		Scanner scanner = new Scanner(System.in);
		int rotationBy = scanner.nextInt();
		arr = rotateArray(arr , rotationBy);
		printArray(arr);
		scanner.close();
	}

	private static int[] rotateArray(int[] arr, int rotationBy) {
		// TODO Auto-generated method stub
		int temp = arr[0];
		int i =0;
		for(i=0;i<arr.length-1;i++) {
			arr[i] = arr[i+1];
		}
		arr[i] = temp;
		rotationBy--;
		if(rotationBy >= 1) {
			rotateArray(arr, rotationBy);
		}
		return arr;
	}
	
	private static void printArray(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]  + " ");
		}
		System.out.println();
	}

}