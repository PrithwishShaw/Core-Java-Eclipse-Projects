package com.example;

public class DaemonDemo extends Thread{

	public void run() {
		if(Thread.currentThread().isDaemon())
		System.out.println(Thread.currentThread()+"Daemon thread working.....");
		else
			System.out.println(Thread.currentThread()+"User Thread working.....");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		DaemonDemo d1= new DaemonDemo();
		DaemonDemo d2= new DaemonDemo();
		DaemonDemo d3= new DaemonDemo();
		
		d1.setDaemon(true);
		d2.setDaemon(true);
		d1.start();
		d2.start();
		d3.start();
		
	}

}
