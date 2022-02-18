package Java;

import java.util.Scanner;

public class WhileWithFactorial {

	public static void main(String[] args) {
		Scanner ab=new Scanner(System.in);
		int a=ab.nextInt();
		int fact=1,i=1;
		while(i<=a)
		{
			fact*=i;
			i++;
			
		
	//	System.out.println("Factorial numbers are : "+fact);
		}  
		System.out.println("Factorial numbers are : "+fact);
	}

}
