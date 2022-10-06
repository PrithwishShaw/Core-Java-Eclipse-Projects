package com.demo;

import java.util.Scanner;
public class Pallindrom {
	
	static boolean checkPalindrome(String str) {
		boolean status;
		char ch[]= str.toCharArray();
		String revstrString= "";
		for(int i=ch.length-1;i>=0;i--) {
			revstrString+=ch[i];
		}
		int flag = str.compareTo(revstrString);
		if(flag==0)
			status = true;
		else 
			status = false;
		return status;
	}

	public static void main(String []args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String: ");
		String s=sc.next();
		boolean check = checkPalindrome(s);
		if(check) {
			System.out.println("---The String is a Palindrome---");
		}
		else
			System.out.println("---The String is not a Palindrome---");
		sc.close();
		}
	}

