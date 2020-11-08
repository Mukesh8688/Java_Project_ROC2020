package mukesh_thread_demo;

public class MythreadClass extends Thread {
	
	@Override
	public void run() {
		
		System.out.println("Mukesh of thread object "+Thread.currentThread().getName() +" of threadid " + Thread.currentThread().getId());
		System.out.println("Preet of thread object " +Thread.currentThread().getName() + " of ThreadId" + Thread.currentThread().getId());
		
		
//		System.out.println(Thread.currentThread());
//		System.out.println( "ID = " + Thread.currentThread().getId());
//		System.out.println(" NAME = " + Thread.currentThread().getName());
//		System.out.println(" priority = " + Thread.currentThread().getPriority());
//		
		
		
//		System.out.println("This is MyThreadClass !!!");
//		
//		double x = Math.sqrt(2);
//		
//		
//		System.out.println("square of x :" + x);
//		
//		
//		System.out.println("MyThreadClass Message 2");
//		
//
//		System.out.println("MyThreadClass Message 3");
//		
	}
	

}
