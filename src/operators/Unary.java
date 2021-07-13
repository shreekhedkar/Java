package operators;

public class Unary {

	public static void main(String[] args) {

		int a; // variable declaration
		a = 10; // variable initialisation
		int b = 20; // declaration+ initialisation

		// ++ , -- ,! (negation)

		// value of a should be increased by 1
		int result = --b; // ++ is known as post increment operator //value of a will be 11
		// a = a + 1;

//		System.out.println("Value of result:" + result);
//		System.out.println("Value of B:" + b);

//		++a; // ++ is known as pre increment operator
//		System.out.println("Value of A pre incrment:" + a);

		// a--; // -- post decrement operator
		// --a; // -- pre decrement operator

		boolean flag = true;
		System.out.println(!flag);
		// System.out.println(a);
		// ++ and --

		// int c = ++a; // a = a+1

		// System.out.println(c);

		// int result = a++;
		// System.out.println(result);
		// System.out.println(!flag);

	}

}
