package Java;

import java.util.Scanner;

public class GradeWithSwitch {

	public static void main(String[] args) {
		int cnt=1;
		while(cnt>0)
		{
		    System.out.println("Enter the Marks you obtained\n");
			Scanner ab=new Scanner(System.in);
			int a=ab.nextInt();
			char grade = ' ';
			
	        if(a>=90 &&  a<=100)
	        {
	        	grade = 'A';
	        }
	        else if(a<90&&a>=80)
	        {
	        	grade = 'B';
	        }
	        else if(a<80&&a>=70)
	        {
	        	grade = 'C';
	        }
	        else if(a<70&&a>=60)
	        {
	        	grade = 'D';
	        }
	        else if(a<60&&a>=50)
	        {
	        	grade = 'E';
	        }
	        else if(a<50&&a>=40)
	        {
	        	grade = 'F';
	        }
	        else if(a<40 && a<0)
	        {
	        	grade = 'G';
	        }
	
		      switch(grade) {
		         case 'A' :
		            System.out.println("Excellent"); //a>=90 &&  a<=100
		            break;
		         case 'B' :
		        	 System.out.println("Very Good");//a<90&&a>=80
		        	 break;
		         case 'C' :
		            System.out.println("Good");//a<80&&a>=70
		            break;
		         case 'D' :
		            System.out.println("Satisfactory");//a<70&&a>=60
		            break;
		         case 'E' :
		            System.out.println("Work Hard");//a<60&&a>=50
		            break;
		         case 'F':
		        	 System.out.println("Failed");//a<50&&a>=40
		        	 break;
		         default :
		            System.out.println("Need to be Work Hard");
		      }
		      System.out.println("Your grade is " + grade);
		      System.out.println("Do you want to continue yes : 1 (or) No : 0 \t\t");
		      Scanner abc=new Scanner(System.in);
			  cnt =abc.nextInt();
		}   
	   }

	}


