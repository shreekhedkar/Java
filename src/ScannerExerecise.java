import java.util.Scanner;

public class ScannerExerecise {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Enter first number:");
		int no1 = scan.nextInt();

		System.out.println("Enter second number:");
		int no2 = scan.nextInt();

		int result = no1 + no2;
		System.out.println("Addition is :" + result);
		// System.out.println("Entered no is=>" + no);

	}

}
