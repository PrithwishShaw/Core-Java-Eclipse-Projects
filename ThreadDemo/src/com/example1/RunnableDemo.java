package com.example1;

public class RunnableDemo implements Runnable {

	public static void main(String []args) {
		
		RunnableDemo r1= new RunnableDemo();
//		Thread t1= new Thread(r1);
//		t1.start();
		r1.run();  // direct 
		System.out.println();
	}
	
	public void run() {
		
		System.out.println("Thread is running");
	}
}
