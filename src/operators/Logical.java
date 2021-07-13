package operators;

public class Logical {

	public static void main(String[] args) {

		int a = 10;
		int b = 20;

		// b++; // b = b+1
		// System.out.println("B is :" + b);

		// b = b+1

		// T || F = T short-circuit evaluation.
		// a= 11 || b = 21

		// T a =11 ||

		// 10=10 and then increment a=11 T && 20 = 20 and increment b to 21 T
		// 11 ==10 F && short circuit
		if (++a == 10 && ++b == 20) {
			a++; //
			b++; //
		}

		System.out.println(a); // 11 11 10 12 12
		System.out.println(b); // 21 20 20 21 22

	}

}
