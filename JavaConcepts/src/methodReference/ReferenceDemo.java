package methodReference;

public class ReferenceDemo {
	public static void main(String[] args) {
		System.out.println("------------Method Reference--------");
		
		//Provide implementation of WorkInterface with lambda
		WorkInterface wi = () -> System.out.println("implementation of doWork()");
		wi.doWork();
		
		
		// Using Method reference operator(::)
		// Here we are referring implementation of doTask not calling doTask
		// Here we have used STATIC method reference
		// ClassName::methodName;
		
		// here we are implementing the method doWork() of WorkInterface class by referring doTask() method of Task Class
		// Argument type  and number of arguments of both methods should be same doWork() and doTask()
		// return type can be different 
		WorkInterface wi1 = Task::doTask; 
		wi1.doWork();
		
		
		//Creating runnable interface reference and providing run() definition using lambda expression
		Runnable rbl = () -> System.out.println("Runnable run() method implementation using lambda");
		Thread t1 = new Thread(rbl);
		t1.start();
		
		
		//Using method reference of Task class threadClass
		// Here we have used STATIC method reference
		// ClassName::methodName;
		Runnable rbl1 = Task::threadTask1;
		Thread t2 = new Thread(rbl1);
		t2.start();
		
		System.out.println("------------Instance Reference (NON STATIC METHODS)--------");
		//Referring non-static method using object of that class
		// Object::methodName
		Task task = new Task();
		Runnable rbl2 = task::threadTask2;
		Thread t3 = new Thread(rbl2);
		t3.start();
		
		
		
		System.out.println("------------Constructor Reference--------");
	}
}
