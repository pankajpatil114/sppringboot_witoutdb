
public class A {

	public static void main(String[] args) {

		int a = 1000;
		int a1 = 5000;

		System.out.println(a1);
		System.out.println("1000");// 1000
		System.out.println("a");// a

		System.out.println(a);// 1000
		// 1000+1000=2000
		a = a + a;
		System.out.println(a);// 2000

		a = a + a;
		System.out.println(a);// 4000

		a = a + a;
		System.out.println(a);// 8000

	}
}
