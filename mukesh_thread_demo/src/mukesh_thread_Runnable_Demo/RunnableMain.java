package mukesh_thread_Runnable_Demo;

public class RunnableMain {

	public static void main(String[] args) {
		
		Runnable run1 = new RunnableClass();
		Thread thread1 = new Thread(run1);
		
		thread1.start();


	}

}
