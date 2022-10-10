package com.example1;

public class Thread1 extends Thread{
	
	Thread1(){
		
	}
	
	Thread1(String name){
		super(name);
	}
	
	@Override
	public void run(){
		
		System.out.println("Thread is running");
		
	}
	
	public static void main(String []args) {
	
		Thread1 t1= new Thread1();
		t1.start();
		Thread1 t2= new Thread1("Prithwish");
		//t2.setName("Prithwish");
		System.out.println("Name: "+t2.getName());
	}
}
