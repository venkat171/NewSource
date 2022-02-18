package Java;

import java.util.Scanner;

public class dynamicPercentage {

	public static void main(String[] args) {
	   Scanner ab=new Scanner(System.in);
	   int a=ab.nextInt();
	   int b=ab.nextInt();
	   int c=ab.nextInt();
	   int d=ab.nextInt();
	   float totalvalues=(a+b+c+d)/4;
	   float per=((totalvalues)*100)/100;
	   System.out.println("avg is : "+totalvalues);
	   System.out.println("percentage value is : "+per);
	   
	   

	}

}
