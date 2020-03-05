package collectionsdemo;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetExample {

	public static void main(String[] args) {

		Set<String> values = new HashSet<String>();

		values.add("abc");
		values.add("xyz");

		Iterator itr = values.iterator();

		while (itr.hasNext()) {

			System.out.println(itr.next());
		}
	}

}
