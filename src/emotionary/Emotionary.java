package emotionary;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class Emotionary {
	String fileName;
	int emotionalValue;
	Scanner fileScanner;
	String command;

	public Emotionary(String fileName) throws FileNotFoundException {
		fileScanner = new Scanner(new FileReader(fileName));
		emotionalValue = 0;
	}

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public int getEmotionalValue() {
		return emotionalValue;
	}

	public void setEmotionalValue(int emotionalValue) {
		this.emotionalValue = emotionalValue;
	}

	public void findEmotion() {
		while (true) {
			if (fileScanner.hasNext()) {
				command = fileScanner.next();
				switch (command) {
				case "hate":
					emotionalValue -= 5;
					System.out.println(emotionalValue);
					break;
				case "love":
					emotionalValue += 10;
					System.out.println(emotionalValue);
					break;
				case "enjoyable":
					emotionalValue += 5;
					System.out.println(emotionalValue);
					break;
				case "anger":
					emotionalValue -= 10;
					System.out.println(emotionalValue);
					break;
				case "decent":
					emotionalValue += 2;
					System.out.println(emotionalValue);
					break;
				}
			}

		}
	}
}
