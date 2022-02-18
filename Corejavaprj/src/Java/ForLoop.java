package Java;

import java.util.Scanner;
public class ForLoop {

	public static void main(String[] args) {
Scanner ab=new Scanner(System.in);
int n=ab.nextInt();
int count=0;
for(int i=1;i<=n;i++) //row
{
	for(int j=1;j<=i;j++) //column
	{
		count++;
		System.out.print(count+ " ");   
	}
	System.out.println(" ");   
	
}
	
}
	}


