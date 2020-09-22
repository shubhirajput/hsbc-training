package com.demo.threads;

public class ThreadMain1 {

	public static void main(String[] args) throws InterruptedException {
		System.out.println("Main thread starts");
		Thread.currentThread().setPriority(8);
		MyThread t1=new MyThread();
		t1.start();
		t1.join(); // will wait until it is finished.
		System.out.println(t1);
		System.out.println(Thread.currentThread());
		
		System.out.println("Main thread dead..");

	}

}
