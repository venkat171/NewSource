package Java;

import java.util.Scanner;

public class CheckVowels {

	public static void main(String[] args) {
    Scanner ab=new Scanner(System.in);
    char ch=ab.next().charAt(0);
    if(ch == 'a'|| ch == 'e'|| ch == 'i' ||ch == 'o' ||ch == 'u'||ch == ' ')
    {
    	System.out.println("It is vowel");
    }
    else 
    {
    	System.out.println("It is consonant");
    }
    
       
        


    
	}

}
