package Java;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
   Scanner ab=new Scanner(System.in);
   int a=ab.nextInt();
  int reverse=0;
  while(a!=0)
  {
	  int rem=a%10;
	
	  reverse=reverse*10+rem;
	  
	  a=a/10;
	
  }
 
  
  System.out.println(reverse);
	}

}
