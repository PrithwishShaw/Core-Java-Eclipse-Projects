package com.demo;

public class DublicateWords {
	
	static void checkFrequency(String s) {
		int[] freq= new int[s.length()];
		
		char ch[]= s.toCharArray();
		
		for(int i=0;i<s.length();i++) {
			freq[i]=1;
			for(int j=i+1;j<s.length();j++) {
				
				if(ch[i]==ch[j]) {
					freq[i]++;
					ch[j] = '0';
				}
			}
		}
		for(int i=0;i<freq.length;i++) {
			if(ch[i]!= ' ' && ch[i]!= '0')
			{
				System.out.println(ch[i]+" :"+freq[i]);
			}
		}
		System.out.println("Duplicate Character are:");
		for(int i=0;i<freq.length;i++) 
		{
			if(ch[i]!= ' ' && ch[i]!= '0')
			{
				if(freq[i]>1)
					System.out.println(ch[i]+ " ");				
			}			
		}
	}
	public static void main(String[] args) {
		String st="Gooood";
		checkFrequency(st);
		// TODO Auto-generated method stub

	}

}
