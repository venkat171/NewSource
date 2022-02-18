package Java;

import java.util.Scanner;

public class Armstrong {

	public static void main(String[] args) {
		int cnt=1;
		while(cnt>0) {
    Scanner ab=new Scanner(System.in);
    int n=ab.nextInt();
    int c=0,a,b;
    a=n;
    while(a>0)
    {
    	b=n%10;
    	c=c+(b*b*b);
    	a/=10;
    	
    }
    if(n==c)
    {
    	System.out.println("Armstrong Number");
    }
    else 
    {
    	System.out.println("Not a Armstrong Number");
    }
   
    }
		 System.out.println("Do you want to continue yes=1 or no=0\t\t");
		    Scanner sc=new Scanner(System.in);
		    int cnt1=sc.nextInt();
    
	}

}
