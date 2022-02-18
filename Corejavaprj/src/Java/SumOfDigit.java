package Java;

import java.util.Scanner;

public class SumOfDigit {

	public static void main(String[] args) {
    Scanner ab=new Scanner(System.in);
    int a=ab.nextInt();
    int sum=0;
    for(int i=1;i<=a;i++)
    {
    	sum+=i;
    }
    System.out.println("Sum of digits:"+sum);
  
	}

}
