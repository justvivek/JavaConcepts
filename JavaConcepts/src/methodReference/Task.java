package methodReference;

import java.time.LocalDate;

public class Task {
	public static void doTask() {
		System.out.println("doing assigned task");
		LocalDate now = LocalDate.now();
		System.out.println(now.toString());
	}
	
	public static void threadTask1() {
		System.out.println("threadTask() execution");
	
		try {
			for(int i=0; i<10; i++) {
				System.out.println("Task1 Thread execution:- " + i);
				Thread.sleep(1000);
			}
		}catch(Exception e) {e.printStackTrace();}
	}
	
	//Non-static method
	public void threadTask2() {
		System.out.println("threadTask() execution");
	
		try {
			for(int i=0; i<10; i++) {
				System.out.println("Task2 Thread execution :- " + 10*i);
				Thread.sleep(2000);
			}
		}catch(Exception e) {e.printStackTrace();}
	}
}
