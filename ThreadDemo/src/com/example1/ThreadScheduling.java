package com.example1;

public class ThreadScheduling implements Runnable{
	
	public static void main(String []args) {
		
		Runnable nr= new ThreadScheduling();
		Thread t1= new Thread(nr, "Mitul");
		Thread t2= new Thread(nr, "Payal");
		Thread t3= new Thread(nr, "Prithwish");
		t1.start();
		t2.start();
		t3.start();
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=0;i<3;i++)
		System.out.println(Thread.currentThread().getName());
	}
	

}
