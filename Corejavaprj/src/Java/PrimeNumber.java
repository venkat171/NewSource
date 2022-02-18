package Java;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
     int num,i,count=0;
     Scanner ab=new Scanner(System.in);
     num=ab.nextInt();
     for(i=2;i<num;i++)
     {
    	 if(num%i==0)
    	 {
    		 count++;
    		 break;
    	 }
     }
     if(count==0)
     {
    	 System.out.println("It is a Prime Num");
     }
     else
     {
    	 System.out.println("It is a Not Prime Num");
     }
     
	}

}
