package operators;

public class Ternary {

	public static void main(String[] args) {

		int a = 10;
		// (condition)? true : false
		int result = a >= 10 ? a : 0;
		// if(condition)? do this if condition is true : do this if condition is false
		if (a >= 10) {
			result = a;
		} else {
			result = 0;
		}

		System.out.println("Result:" + result);
	}
}
