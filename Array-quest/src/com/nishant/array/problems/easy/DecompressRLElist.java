package com.nishant.array.problems.easy;

import java.util.ArrayList;
import java.util.List;

public class DecompressRLElist {

	public static void main(String[] args) {
		int[] arr = {1,2,3,4};
		List<Integer> list = new ArrayList<>();
		list =  decompressRLElist(arr , list , 0);
		System.out.println(list);
	}

	private static List<Integer> decompressRLElist(int[] nums , List<Integer> list , int index) {	
		int[] arr = new int[nums[index]];
		for(int i=0;i<arr.length;i++) {
			list.add(nums[index+1]);
		}
		index = index + 2;
		if(nums.length > index) {
			decompressRLElist(nums, list, index);
		}
		
		return list;   
    }
}
