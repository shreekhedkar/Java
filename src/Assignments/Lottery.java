package Assignments;

public class Lottery {

	public static void main(String[] args) {

		String names[] = { "Ambarish", "Shraddha", "Payal", "Arun", "Siva", "Nazneen", "Ajay", "Kiran", "Sanjeev",
				"Akshay", "Deepak", "Aakash", "Nitin" };

		int no = (int) (Math.random() * 13);

		System.out.println("Congratulations.You are the chosen one!=> " + names[no]);
	}

}
