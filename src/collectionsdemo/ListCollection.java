package collectionsdemo;

import java.util.HashSet;
import java.util.Set;

public class ListCollection {

	public static void main(String[] args) {

		Set<Employee> empList = new HashSet<Employee>();

		Employee e = new Employee();
		e.setEno(10);
		e.setEname("abc");
		empList.add(e);
		empList.remove(e);

		Employee e1 = new Employee();
		e1.setEno(20);
		e1.setEname("xyz");
		empList.add(e1);

		System.out.println(empList.toString());
//		for (Employee emp : empList) {
//
//			System.out.println(emp.getEname());
//			System.out.println(emp.getEno());
//		}
//
		// List<String> list = new ArrayList<>(values);
//
//		for (int i = 0; i < 2; i++) {
//
//			System.out.println(list.get(i));
//
//		}

	}
}
