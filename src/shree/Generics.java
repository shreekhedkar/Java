package shree;

import java.util.ArrayList;

public class Generics {

	public static void main(String[] args) {

		ArrayList al = new ArrayList();

		al.add("Shree");
		al.add(10);
		al.add(new Integer(20));
		al.add("Tushar");

		System.out.println(al);

		String value = (String) al.get(0);
	}

}
