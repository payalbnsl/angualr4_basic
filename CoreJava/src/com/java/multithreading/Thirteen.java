package com.java.multithreading;

import java.util.ArrayList;
import java.util.List;

//Thread interleaving problem: Changing methods to be synchronized. Problem solved but time to execute doubled
//To solve time problem, use  object class Lock. Faster.
public class Thirteen implements Runnable {
	
	List<Integer> list1= new ArrayList<>();
	List<Integer> list2= new ArrayList<>();
	Object obj1= new Object();
	Object obj2= new Object();
	String str1=new String();
	String str2= new String();
	
	public static void main(String[] args) throws InterruptedException {
		Thirteen obj = new Thirteen();
		Thread t1= new Thread(obj);
		Thread t2= new Thread(obj);
		t1.start();
		t2.start();
		t1.join();
		t2.join();
		System.out.println(obj.list1.size()+ "-"+ obj.list2.size());
	}

	public void run() {
		task1();
		task2();
	}

	private  void task1() {
		synchronized(str1){
		for (int i = 0; i < 1000; i++)
			list1.add(i);
		}
	}
	private  void task2() {
		synchronized(str2){
		for (int i = 0; i < 1000; i++)
			list2.add(i);
		}
	}

	
}

/*o/p: 
	Exception in thread "Thread-0" java.lang.ArrayIndexOutOfBoundsException: 15
	at java.util.ArrayList.add(ArrayList.java:459)
	at com.java.multithreading.Ten.task1(Ten.java:30)
	at com.java.multithreading.Ten.run(Ten.java:24)
	at java.lang.Thread.run(Thread.java:745)
1006-1000
*/
