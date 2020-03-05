
public class PredictTheOutput {

	static int a = 10;
	static int b = 20;

	public static void main(String[] args) {

		System.out.println(a);
		a++;
		add();
	}

	private static void add() {
		System.out.println(a);
	}

}
