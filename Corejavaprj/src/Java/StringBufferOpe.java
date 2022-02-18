package Java;

public class StringBufferOpe {

	public static void main(String[] args) {
		StringBuffer sb=new StringBuffer("Hello "); 
		System.out.println(sb.capacity());
		System.out.println(sb.insert(6,"Java"));
		System.out.println(sb.delete(1,3));
		System.out.println(sb.reverse());
	//	System.out.println(sb.insert(0,'e').reverse().append("Java"));

	}

}
