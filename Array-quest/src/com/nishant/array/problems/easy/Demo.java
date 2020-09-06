package com.nishant.array.problems.easy;

import java.util.ArrayList;
import java.util.List;

public class Demo {

	public static void main(String[] args) {
		List<List<Integer>> list = new ArrayList<>();
		
		List<Integer> li = new ArrayList<>();
		List<Integer> li1 = new ArrayList<>();
		li.add(2);
		li.add(8);
		li.add(3);
		
		li1.add(2);
		li1.add(8);
		li1.add(3);
		
		if(li.get(0) == li1.get(0)) {
			System.out.println("yes");
		}else {
			System.out.println("no");
		}
	}

}
