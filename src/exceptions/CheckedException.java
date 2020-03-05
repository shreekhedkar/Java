package exceptions;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;

public class CheckedException {

	public static void main(String[] args) throws IOException {

		FileUtils.copyFile(new File("a.txt"), new File("b.txt"));
	}

}
