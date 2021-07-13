

public class MyClass {

	public static void main(String[] args) {

		String[] names = new String[4];
		names[0] = "abc";
		names[1] = "xyz";
		names[3] = "pqr";
		names[2] = "pqr";

		for (int i = 0; i < names.length; i++) {
			System.out.println("Names are as follows:" + names[i]);
		}
	}

}
