package Java;

import java.util.Scanner;

public class Java {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner a=new Scanner(System.in);
		//b means Name 
		String b=a.nextLine();
		//c means age
		int c=a.nextInt();
		//f means address
		String f=a.next();
		//d means language 
		String d=a.next();
		//e means percentage 
		float e=a.nextFloat();
		System.out.println("Name is: "+b);
		System.out.println("Age is: "+c);
		System.out.println("Im coming from: "+f);
		System.out.println("Language Known: "+d);
		System.out.println("Percentage on ELAT: "+e);
		System.out.println("My Name is "+b+" and My Age is "+c+"."+"Im coming from "+f+"."+"I know the Language "+d+"."+"I got percentage on Elat is "+e+".");
		
		
		

	}

}
