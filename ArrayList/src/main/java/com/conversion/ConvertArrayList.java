package com.conversion;

import java.util.ArrayList;

public class ConvertArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> fruits2 = new ArrayList<String>();
		fruits2.add("Mango");
		fruits2.add("Orange");
		fruits2.add("Apple");
		
		String[] fruits= fruits2.toArray(new String[fruits2.size()]);
		for(int i=0;i<=fruits.length;i++) {
			System.out.println(i);
		}
		
		
	}

}