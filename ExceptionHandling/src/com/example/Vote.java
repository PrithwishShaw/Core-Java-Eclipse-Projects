package com.example;

public class Vote {
	
	static void validateAge(int age)
	{
		if(age<18)
			{
				throw new ArithmeticException("Percon Cannot vote");
			}
		else
			System.out.println("You can vite");

	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ageP=16;
		validateAge(ageP);
		}

	}
