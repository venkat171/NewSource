package Java;

import java.util.Scanner;

public class operation {

	public static void main(String[] args) {
		Scanner ab=new Scanner(System.in);
		int a=ab.nextInt();
		int b=ab.nextInt();
		int add,sub,mul,div;
		add=a+b;
		System.out.println(add);
		sub=a-b;
		System.out.println(sub);
		mul=a*b;
		System.out.println(mul);
		div=a%b;
		System.out.println(div);

	}

}
