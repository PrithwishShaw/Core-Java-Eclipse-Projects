package com.comparison;

import java.util.ArrayList;

public class CompareArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> fruits2 = new ArrayList<String>();
		fruits2.add("Mango");
		fruits2.add("Orange");
		fruits2.add("Apple");
		
		System.out.println(fruits2);
		
		ArrayList<String> fruits = new ArrayList<String>();
		fruits.add("Mango");
		fruits.add("Orange");
		fruits.add("Apple");
		
		System.out.println(fruits);
		
		boolean status = fruits.equals(fruits2);
		System.out.println(status);
		
		fruits2.add("Peaches");
		boolean status2 = fruits.equals(fruits2);
		System.out.println(status2);
		
		
	}

}
