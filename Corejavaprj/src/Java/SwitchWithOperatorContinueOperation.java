package Java;

import java.util.Scanner;

public class SwitchWithOperatorContinueOperation {

	public static void main(String[] args) {
		int cnt=1;
		while(cnt>0)
		{
		Scanner ab=new Scanner(System.in);
		int a=ab.nextInt();
		int b=ab.nextInt();
		int c;
		int ch=ab.nextInt();
		switch(ch)
		{
		case 1:
			c=a+b;
			System.out.format("Sum of 2Nos is : "+c);
			break;
		case 2:
			c=a-b;
			System.out.format("Sub of 2Nos is : "+c);
			break;
		case 3:
			c=a*b;
			System.out.format("Mul of 2Nos is : "+c);
			break;
		case 4:
			c=a/b;
			System.out.format("Div of 2Nos is : "+c);
			break;
		case 5:
			c=a%b;
			System.out.format("Mod of 2Nos is : "+c);
			break;
		default:
			System.out.format("Invalid Operator");
			
			
			
			
		}
		 System.out.println("\nDo you want to continue yes : 1 (or) No : 0 \t\t");
	      Scanner abc=new Scanner(System.in);
		  cnt =abc.nextInt();
		}
	}

}
