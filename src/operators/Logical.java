package operators;

public class Logical {

	public static void main(String[] args) {

		int a = 10;
		int b = 20;

		if (a == 10 || b++ == 20) {
			a++;
			b++;
		}

		System.out.println(a); // 10 10 10 11 11 10 10
		System.out.println(b); // 20 21 20 22 21 21 20

	}

}
