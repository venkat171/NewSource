package Java;

import java.util.Scanner;

public class StarPattern {

	public static void main(String[] args) {
		Scanner ab=new Scanner(System.in);
		int n=ab.nextInt();
		for(int i=1;i<=n;i++) //row
		{
			for(int j=1;j<=i;j++) //column
			{
				
				System.out.print("* ");   
			}
			System.out.println(" ");   
			
		}
			
		}
			
	}

