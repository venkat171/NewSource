package Java;

import java.util.Scanner;
//import java.lang.Math;
public class GettingRuntimeOperator {

	public static void main(String[] args) 
	{
	Scanner ab=new Scanner(System.in);
	int a=ab.nextInt();
	int b=ab.nextInt();
	int c;
	char ch=ab.next().charAt(0);
	switch(ch)
	{
	case '+':
		c=a+b;
		System.out.format("Sum of 2Nos is : "+c);
		break;
	case '-':
		c=a-b;
		System.out.format("Sub of 2Nos is : "+c);
		break;
	case '*':
		c=a*b;
		System.out.format("Mul of 2Nos is : "+c);
		break;
	case '/':
		c=a/b;
		System.out.format("Div of 2Nos is : "+c);
		break;
	case '%':
		c=a%b;
		System.out.format("Mod of 2Nos is : "+c);
		break;
	default:
		System.out.format("Invalid Operator");
		
		
		
		
	}
		

	}

}
