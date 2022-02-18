package Java;

import java.util.Scanner;
import java.lang.*;

public class FibonacciSeries {

	public static void main(String[] args) {
		Scanner ab=new Scanner(System.in);
		int a=ab.nextInt();
		int f1=0,f2=1,f3;
		System.out.print(f1+" "+f2 );
		for(int i=2;i<=a;i++)
		{
			f3=f1+f2;
			
			System.out.print(" "+f3);
			f1=f2;    
			  f2=f3; 
		       
		}
		//System.out.println("Fibonacci Series are : "+f3);
	       
	       
	}

}
