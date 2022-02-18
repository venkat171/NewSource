package Java;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		Scanner ab=new Scanner(System.in);
		int a=ab.nextInt();
		int fact=1;
		for(int i=1;i<=a;i++)
		{
			fact*=i;
			
		}
		System.out.println("Factorial numbers are : "+fact);
		   
		   
	}

}
