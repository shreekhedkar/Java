package conditional;

public class Conditional {

	public static void main(String[] args) {

		int no = 11;
//		while (no == 10) {
//			System.out.println(no);
//			// no++;
//		}

//		do {
//			System.out.println(no);
//			no++;
//		} while (no == 10);

		for (int i = 0; i < 10; i++) {

			if (i % 2 == 0) {
				System.out.println("Even No::" + i);
			} else {
				System.out.println("Odd No::" + i);
			}
		}

	}
}
