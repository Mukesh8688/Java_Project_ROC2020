package operatorpack;

public class Addition {

	private int a;
	private int b;
	
	public Addition() {
		// TODO Auto-generated constructor stub
	}
	
	
	public Addition(int a, int b) {
		this.a = a;
		this.b = b;
	}


	public int getA() {
		return a;
	}


	public void setA(int a) {
		this.a = a;
	}


	public int getB() {
		return b;
	}


	public void setB(int b) {
		this.b = b;
	}
	
	public int add() {
		return this.a + this.b;
	}
	
	
	
}
