package mukesh_thread_Runnable_Demo;

public class RunnableClass implements Runnable {
	
	

	@Override
	public void run() {
		
     System.out.println("My Runnable Class Message 1" + Thread.currentThread() );
     System.out.println("My Runnable Class Message 2" +  Thread.currentThread());
     
     System.out.println("My Runnable Class Message 3" + Thread.currentThread() );
		
	}

}
