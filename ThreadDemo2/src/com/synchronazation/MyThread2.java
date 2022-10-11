package com.synchronazation;

public class MyThread2 extends Thread {

	Thread1 t;
	
	MyThread2(){
		
	}
	
	MyThread2(Thread1 t){
		this.t=t;
	}
	
	public void run() {
		
		t.printTable(9);
	}
}
