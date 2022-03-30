package javaConcepts.AnonymousLambda;

//LAMBDA ONLY WORKS WITH FUNCTIONAL INTERFACE -> AN INTERFACE HAVING ONLY ONE ABSTRACT METHOD, can have multiple default and static methods

// IF THERE ARE MORA THAN ONE ABSTRACT MEHTOD IN INTERFACE THEN WE NEED TO USE ANONYMOUS CLASS 

public class ThreadDemoLambda {
	public static void main(String[] args) {
		
		//First Thread:- Thread JOHN
		Runnable thread1 = () -> {
			//this is body of thread
			//Stuff
				try {
					for(int i=1; i<=10; i++) {
						System.out.println("Value of i is "+ i);
						Thread.sleep(2000);
					}
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		};
		
		Thread t1 = new Thread(thread1);
		t1.setName("JOHN");
		t1.start();
		
		Runnable thread2 = () -> {
			try { 
				for(int i=1; i<=10; i++) {
					System.out.println(i*2);
					Thread.sleep(1000);
				}
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		};
		
		Thread t2 = new Thread(thread2);
		t2.start();
	}
}
