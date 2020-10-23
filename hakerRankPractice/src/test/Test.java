package test;


import java.util.*;


public class Test {
	
	public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter howmany series:");
        int t=in.nextInt();
        
        
        for(int i=0;i<t;i++){
        	 System.out.println("Enter Values of a,b,c :");
             int a = in.nextInt();
             int b = in.nextInt();
             int n = in.nextInt();
             
             
             // print out your values
             
             System.out.println("Your a,b,n data are :");
             System.out.print(a);
             System.out.print(" ");
             System.out.print(b);
             System.out.print(" ");
             System.out.print(n);
             
             
             // print output
             
             System.out.println("\n");
             
             System.out.println("Our outputs are :");
             
             if(n>1){ 
                 
             	int result = a;
                 
                 for(int j =0;j<= n;j++){
                     
                     if((a >= 0 && a <=50) && (b >= 0 && b <=50)){
                        
                         result += b * (Math.pow(2,j));
                         System.out.print(" ");
                         System.out.print(result);
                         
                         

                     }
                 }
             }

             
             
             
        }
        
        
        
    	in.close();
        
	}
	

        
}
