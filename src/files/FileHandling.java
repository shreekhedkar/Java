package files;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class FileHandling {

	public static void main(String[] args) throws IOException {

//		FileReader fr = new FileReader("C:\\EclipseWs\\Java\\a.txt");
//		BufferedReader reader = new BufferedReader(fr);
//
//		FileWriter fw = new FileWriter("C:\\EclipseWs\\Java\\a.txt");
//		BufferedWriter bw = new BufferedWriter(fw);
//
//		String line = null;
//
//		while ((line = reader.readLine()) != null) {
//			// System.out.println(line);
//			bw.write(line);
//			bw.newLine();
//			bw.flush();
//		}
//		reader.close();

//		FileUtils.copyFile(new File("C:\\EclipseWs\\Java\\a.txt"),
//				new File("C:\\EclipseWs\\Java\\magic.txt"));
//
//		List<String> lines = FileUtils.readLines(new File("C:\\EclipseWs\\Java\\a.txt"));
//
//		System.out.println(lines);

//		InputStreamReader is = new InputStreamReader(System.in);
//		BufferedReader reader = new BufferedReader(is);
//
//		System.out.println("Enter the name->");
//		String name = reader.readLine();
//
//		System.out.println("Name Entered is=>" + name);

		Scanner scan = new Scanner(System.in);

		System.out.println("Enter the no->");
		int a = scan.nextInt();
		System.out.println("Entered Number is->" + a);

		System.out.println("Enter the name->");
		String name = scan.nextLine();
		System.out.println("Entered Name is->" + name);

	}

}
