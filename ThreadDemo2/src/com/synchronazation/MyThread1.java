package com.synchronazation;

public class MyThread1 extends Thread{

	Thread1 t;
	
	MyThread1(){
		
	}
	
	MyThread1(Thread1 t){
		this.t=t;
	}
	
	public void run() {
		
		t.printTable(7);
	}
}
