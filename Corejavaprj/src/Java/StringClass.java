package Java;
import java.lang.*;
public class StringClass {

	public static void main(String[] args) {
		String s="String class test";
		String f="  String class Test   ";
		char ch=s.charAt(3);
		int d=s.length();
		String str=s.toUpperCase();
		String str1=s.toLowerCase();
		String[] arr=s.split(" ");
		
		System.out.println(ch);
		System.out.println(d);
		System.out.println(str);
		System.out.println(str1);
		System.out.println(s.equals(f));
		System.out.println(s.equalsIgnoreCase(f));
		System.out.println(f.trim());
		System.out.println(s.toCharArray().length);
		System.out.println(s.concat(" "+f));
		System.out.println(s.replace('S','T'));
		System.out.println(s.indexOf('n'));
		System.out.println(s.lastIndexOf('s'));
		System.out.println(s.substring(2));
		System.out.println(s.substring(2,5));
	//	System.out.println(arr);
		
		
		
	}

}
