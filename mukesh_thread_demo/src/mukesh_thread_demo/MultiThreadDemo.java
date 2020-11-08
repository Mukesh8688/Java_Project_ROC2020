package mukesh_thread_demo;

public class MultiThreadDemo {

	public static void main(String[] args) {
	
		
		System.out.println(Thread.currentThread());
		
		Thread thread = Thread.currentThread();
		//thread.setPriority(8);
		thread.setName("MukeshBusinessThreads");

		
		
		for(int i = 0 ;i < 4 ; i ++){
	
		
		System.out.println(Thread.currentThread());
		
		}
		
		
		MythreadClass myThreadClass_1 = new MythreadClass();
		myThreadClass_1.setName("myClassThread_1");
		myThreadClass_1.start();
		
		MythreadClass myThreadClass_2 = new MythreadClass();
		myThreadClass_2.setName("myClassThread_2");
		myThreadClass_2.start();
		
		
		
		MultiplyIntegerThread multiplyThread = new MultiplyIntegerThread(2, 3);
		
		multiplyThread.setName("MultiplyThread");
		multiplyThread.setPriority(10);
		//multiplyThread.setDaemon(true);
		multiplyThread.start();
		
		//System.out.println(Thread.currentThread());

	}

}
