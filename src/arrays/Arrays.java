package arrays;

public class Arrays {

	public static void main(String[] args) {

		int a[] = { 10, 20, 30 }; // Array declaration and initialisation
		int b[] = new int[4]; // declaration

		b[0] = 10; // initialisation
		b[1] = 20;
		b[2] = 30;

		for (int i = 0; i < 2; i++) {
			System.out.println(b[i]);
		}

		int count = 0;
		for (int val : b) {
			if (count < 2) {
				System.out.println(val);
			} else {
				break;
			}
			count++;
		}
	}

}
