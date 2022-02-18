package Java;

import java.util.Scanner;

public class ifelse {

	public static void main(String[] args) {
		//int a=10,b=15,c=5;
		Scanner ab=new Scanner(System.in);
		int a=ab.nextInt();
		int b=ab.nextInt();
		int c=ab.nextInt();
				
		if(a>b&&a>c)
		{
			System.out.println(" a is greater ");
		}
		else if(b>a&&b>c)
		{
			System.out.println(" b is greater ");
		}
		else
		{
			System.out.println(" c is greater ");
		}

	}

}
