package exceptions;

public class Unchecked {

	public static void main(String[] args) {

		int a[] = { 10 };
		int balance = 0;

		try {
			balance = a[1];
		} catch (ArrayIndexOutOfBoundsException ex) {
			System.out.println("ArrayIndexOutOfBounds");
		} catch (Exception e) {
			System.out.println("Arithmetic");
		}

	}

}
