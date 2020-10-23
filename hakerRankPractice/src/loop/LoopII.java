package loop;

import java.util.*;
import java.io.*;

public class LoopII{
	
    public static void main(String []argh){
//        Scanner in = new Scanner(System.in);
//        int t=in.nextInt();
//        for(int i=0;i<t;i++){
//            int a = in.nextInt();
//            int b = in.nextInt();
//            int n = in.nextInt();
//        }
        int a =5,b=3,n =5;
    	
        if(n>1){ 
            
        	int result = a;
            
            for(int i =0;i<= n;i++){
                
                if((a >= 0 && a <=50) && (b >= 0 && b <=50)){
                   
                    result += b * (Math.pow(2,i));
                    System.out.print(" ");
                    System.out.print(result);
                    
                    

                }
            }
        }


      // in.close();
    }
}
