package com.example;

public class ThreadPriority extends Thread {
	
	ThreadPriority(){
		
	}
	
	ThreadPriority(String name){
		
		super(name);
	}
	
	@Override
	public void run() {
		for(int i=0;i<5;i++)
		{
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				System.out.println(e);
			}
			System.out.println(Thread.currentThread().getName()+"Current Priority "+ Thread.currentThread().getPriority());
		}
	}
	
	public static void main(String []args) {
		
		ThreadPriority t1= new ThreadPriority("Ram ");
		ThreadPriority t2= new ThreadPriority("Raavan ");
		ThreadPriority t3= new ThreadPriority("Laxman ");
		
		t1.setPriority(MAX_PRIORITY);
		t2.setPriority(MIN_PRIORITY);
		t3.setPriority(9);
		
		t1.start();
		 try {
				t1.join(2500);	//
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		t3.start();
		try {
			t3.join(2500);	//
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		t2.start();
		
		
	}

}
