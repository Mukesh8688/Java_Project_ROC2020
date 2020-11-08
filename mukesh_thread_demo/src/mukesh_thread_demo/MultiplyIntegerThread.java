package mukesh_thread_demo;

public class MultiplyIntegerThread extends Thread {
	
	private int num1;
	private int  num2;
	
	public MultiplyIntegerThread() {
		
	}
	
	public MultiplyIntegerThread(int num1,int num2) {
		
		this.num1 = num1;
		this.num2 = num2;
	}
	
	
	@Override
	public void run() {
		
		System.out.println("Multiply of integer:" + num1*num2);
	}

}
