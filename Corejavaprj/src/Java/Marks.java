package Java;

import java.util.Scanner;

public class Marks {

	public static void main(String[] args) {
		Scanner ab=new Scanner(System.in);
		float a=ab.nextFloat();
        if(a>90)
        {
        	System.out.println("A - Excellent");
        }
        else if(a<90&&a>=80)
        {
        	System.out.println("B - Very Good");
        }
        else if(a<80&&a>=70)
        {
        	System.out.println("C - Good");
        }
        else if(a<70&&a>=60)
        {
        	System.out.println("D - Satisfactory");
        }
        else if(a<60&&a>=50)
        {
        	System.out.println("E - Work hard");
        }
        else if(a<50&&a>=40)
        {
        	System.out.println("F - Just Passed");
        }
        else
        {
         System.out.println("Failed");	
        }

	}

}
