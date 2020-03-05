package files;

import java.io.File;
import java.nio.charset.StandardCharsets;

import org.apache.commons.io.FileUtils;

public class JsonReading {

	public static void main(String[] args) throws Exception {

		File file = new File("C:\\EclipseWs\\Java\\emp.json");

		String content = FileUtils.readFileToString(file, StandardCharsets.UTF_8);

		System.out.println(content);

	}

}
