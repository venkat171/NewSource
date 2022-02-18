package Java;

import java.util.Scanner;

public class Weedays {

	public static void main(String[] args) {
     Scanner ab=new Scanner(System.in);
     String a=ab.nextLine();
    // System.out.println("Enter the character :");
     switch(a)
     {
     case "M":
    	 System.out.println("Today is monday");
    	 break;
     case  "T":
    	 System.out.println("Today is tuesday");
    	 break;
     case "W":
    	 System.out.println("Today is Wednesday");
    	 break;
     case "THU":
    	 System.out.println("Today is Thursday");
    	 break;
     case "F":
    	 System.out.println("Today is Friday");
    	 break;
     case "S":
    	 System.out.println("Today is Saturday");
    	 break;
     case "Sun":
    	 System.out.println("Today is Sunday");
    	 break;
     default :
    	 System.out.println("Invalid Input");
     }
     
	}

}
