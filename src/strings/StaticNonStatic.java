package strings;

public class StaticNonStatic {

	static int a = 20;

	public static void main(String[] args) {
		int a = 10;
		System.out.println(a);

		print(a);
	}

	private static void print(int a) {

		System.out.println(a);// 10
	}

}
