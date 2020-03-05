package files;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileHandling {

	public static void main(String[] args) throws IOException {

		FileReader fr = new FileReader("C:\\EclipseWs\\Java\\a.txt");
		BufferedReader reader = new BufferedReader(fr);
		String line = null;

		while ((line = reader.readLine()) != null) {
			System.out.println(line);
		}
	}

}
