package Java;

import java.util.Scanner;

public class CombinedCode {

	public static void main(String[] args) {
		int cnt=1;
		while(cnt>0)
		{
    Scanner ab=new Scanner(System.in);
    int a=ab.nextInt();
    System.out.println("Enter the choice : ");
    System.out.println("1.Sum of Digits ");
    System.out.println("2.Factorial of the given number");
    System.out.println("3.Fibonacci series ");  
    int s=ab.nextInt();
    switch(s)
    {
    case 1:
    {
    	int sum=0;
    	for(int i=1;i<=a;i++)
    	{
    		sum+=i;
    		
    	}
    	System.out.println("Sum of Digits : "+sum);
    	break;
    }
    case 2:
    	
    {
    	int fact=1;
    	for(int i=1;i<=a;i++)
    	{
    		fact*=i;
    		
    	}
    	System.out.println("Factorial of the number is : "+fact);
    	break;
    }
    case 3:
    {
    	int f1=0,f2=1,f3;
    	System.out.print(f1+" "+f2);
    	for(int i=2;i<=a;i++)
		{
			f3=f1+f2;
			
			System.out.print(" "+f3);
			f1=f2;    
			  f2=f3; 
		       
		}
    	break;
    }
    default:
    {
    	System.out.println("Invalid Number");
    }
   
    	
    }
    System.out.println("\nDo you want to continue yes : 1 (or) No : 0 \t\t");
    Scanner abc=new Scanner(System.in);
	  cnt =abc.nextInt();
	}

	}
}
