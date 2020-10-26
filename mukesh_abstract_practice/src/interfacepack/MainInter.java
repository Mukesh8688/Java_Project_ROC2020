package interfacepack;

public class MainInter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.out.println("Accessing MyInterface1 methods");
		
		Myinter1 i1 = new Implementor();
		
		i1.method1();
		i1.method2();
		i1.common();
		
		
        
		System.out.println();
        System.out.println("Accessing MyInterface2 methods");
		
		Myinter2 i2 = new Implementor();
		
		i2.hello1();		
		i2.hello2();
		i2.common();
		i2.methoddefault();
		
		
		System.out.println();
		System.out.println("This is inner interface method");
		Myinter1.InnerInterface i3 = new Implementor();
		
		i3.innermethod();

	}

}
