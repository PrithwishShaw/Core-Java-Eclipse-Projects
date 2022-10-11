package com.synchronazation;

public class MainThread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Thread1 table= new Thread1();
		MyThread1 g1= new MyThread1(table);
		MyThread2 g2= new MyThread2(table);
		
		g1.start();
		g2.start();
		
		
	}

}
