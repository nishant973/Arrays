package com.nishant.array.problems.easy;

import java.util.ArrayList;
import java.util.List;

// O(n)
public class KidsWithCandies {

	public static void main(String[] args) {
		int[] candies = {2,3,5,1,3};
		int extraCandies = 3;
		kidsWithextraCandies(candies , extraCandies);
	}

	private static void kidsWithextraCandies(int[] candies, int extraCandies) {
		List<Boolean> list = new ArrayList<>();
		int max = Integer.MIN_VALUE;
		
		for(int i=0;i<candies.length;i++) {
			if(candies[i] > max) {
				max = candies[i];
			}
		}
		
		for(int i=0;i<candies.length;i++) {
			if(candies[i] + extraCandies >= max) {
				list.add(true);
			}else {
				list.add(false);
			}
		}
		System.out.println(list);
	}

}
