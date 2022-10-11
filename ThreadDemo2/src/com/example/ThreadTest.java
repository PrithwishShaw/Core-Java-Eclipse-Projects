package com.example;

public class ThreadTest extends Thread{
	
	ThreadTest(){
		
	}
	
	ThreadTest(String name){
	super(name);	
	}
	
	public void run() {
		for(int i=0;i<5;i++)
		{
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				System.out.println(e);
			}
			System.out.println(Thread.currentThread().getName()+ " "+ i);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ThreadTest t= new ThreadTest("Ram ");
		ThreadTest t1= new ThreadTest("Laxman ");
		ThreadTest t2= new ThreadTest("Sita ");
		
		//t.run();		//no thread is created
		//t.run();		//thread will run
		//t1.run();

		
		 t.start(); // thread created 
		 
		 try {
				t.join(2500);	//
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		 
		 t1.start(); //threadStateException 
		 t2.start();
		 

	}

}
