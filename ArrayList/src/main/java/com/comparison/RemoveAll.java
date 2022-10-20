package com.comparison;

import java.util.ArrayList;

public class RemoveAll {
	
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
		fruits.add("Peaches");
		
		System.out.println(fruits);
		
		//fruits2.removeAll(fruits);
		//System.out.println(fruits2);
		
		fruits2.retainAll(fruits);
		System.out.println(fruits2);
		
		
		
	}

}
