package Java;

import java.util.Scanner;

public class VowelsCount {

	public static void main(String[] args) {
    Scanner ab=new Scanner(System.in);
    String a=ab.nextLine();
    int count=0;
    
    for(int i=0;i<=a.length()-1;i++)
    {
    	char ch=a.charAt(i);
    	//System.out.println(ch);
    	if(ch == 'a'|| ch == 'e'|| ch == 'i' ||ch == 'o' ||ch == 'u'||ch == ' ')
    	{
    		count++;
    		//System.out.println(count);
    	}
    	
    	
    }
    System.out.println(count);
	}

}
