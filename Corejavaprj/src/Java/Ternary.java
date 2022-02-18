package Java;

public class Ternary {

	public static void main(String[] args) {
		int a=5,b=10,c=15;
		int d=(a > b) ? (a > c ? a : c) : (b > c ? b : c);
		System.out.println(d);

	}

}
