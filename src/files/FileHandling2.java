package files;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class FileHandling2 {
	static List<Integer> words = new ArrayList<Integer>();
	static List<Integer> chars = new ArrayList<Integer>();
	static String maxString = "";
	static Map<String, Integer> wordMap = new HashMap<String, Integer>();
	static FileReader fr;
	static BufferedReader reader;
	static FileWriter fw;
	static BufferedWriter writer;
	static FileWriter mw;
	static BufferedWriter metricswriter;
	static double noOfLines = 0;
	static int totalWords = 0;
	static int totalChars = 0;
	static String line = null;
	static String[] tokens;
	static StringBuffer buffer;

	public static void main(String[] args) throws IOException {

		initializeFiles();
		readInputFile();
		generateMetrics();
		closeFileHandles();
		System.out.println("Input file is parsed successfully and Output file is generated along with metrics!!");
	}

	private static void readInputFile() throws IOException {
		while ((line = reader.readLine()) != null) {

			noOfLines++;
			tokens = line.split(" ");

			words.add(tokens.length);
			buffer = readTokens(tokens);

			writer.write(buffer.toString());
			writer.newLine();
			writer.flush();
		}
	}

	private static void initializeFiles() throws FileNotFoundException, IOException {
		fr = new FileReader("C:\\EclipseWs\\Java\\input.txt");
		reader = new BufferedReader(fr);

		fw = new FileWriter("C:\\EclipseWs\\Java\\output.txt");
		writer = new BufferedWriter(fw);

		mw = new FileWriter("C:\\EclipseWs\\Java\\metrics.txt");
		metricswriter = new BufferedWriter(mw);

	}

	private static void closeFileHandles() throws IOException {
		fr.close();
		fw.close();
		mw.close();

		reader.close();
		writer.close();
		metricswriter.close();
	}

	private static void generateMetrics() throws IOException {

		for (int i = 0; i < words.size(); i++) {
			totalWords += words.get(i);
		}
		for (int i = 0; i < chars.size(); i++) {
			totalChars += chars.get(i);
		}

		double wordsPerSentence = totalWords / noOfLines;
		metricswriter.write(String.format("Avg No.of words per sentence:%.2f", wordsPerSentence));
		metricswriter.newLine();
		double charasPerSentence = totalChars / noOfLines;
		metricswriter.write(String.format("Avg No.of characters per sentence:%.2f", charasPerSentence));
		metricswriter.newLine();
		metricswriter.write("Longest Word:" + maxString);
		metricswriter.newLine();
		final Map<String, Integer> sortedByCount = sortByValue(wordMap);
		metricswriter.write("Most Frequent Word:" + sortedByCount.keySet().toArray()[0]);
		metricswriter.flush();
	}

	public static Map<String, Integer> sortByValue(final Map<String, Integer> wordCounts) {
		return wordMap.entrySet().stream().sorted((Map.Entry.<String, Integer>comparingByValue().reversed()))
				.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));
	}

	private static StringBuffer readTokens(String[] tokens) {

		StringBuffer buffer = new StringBuffer();

		for (int i = 0; i < tokens.length; i++) {
			if (wordMap.containsKey(tokens[i])) {

				Integer count = wordMap.get(tokens[i]);
				wordMap.put(tokens[i], ++count);
			} else {
				wordMap.put(tokens[i], 1);
			}
			chars.add(tokens[i].length());
			buffer.append(reverseString(tokens[i]));
			maxString = findMaxString(tokens[i]);
			buffer.append(" ");
		}
		return buffer;
	}

	private static String findMaxString(String token) {

		if (token.length() > maxString.length()) {
			maxString = token;
		}
		return maxString;
	}

	private static String reverseString(String token) {
		String reverseString = "";

		for (int i = token.length() - 1; i >= 0; i--) {
			reverseString += token.charAt(i);
		}
		return reverseString;
	}

}
