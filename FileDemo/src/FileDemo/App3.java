package FileDemo;

import java.io.FileReader;
import java.io.IOException;

public class App3 {
	public static void main(String[] args) throws IOException {
		FileReader fr = new FileReader("testout.txt");
		char[] charArray = new char[50];
		fr.read(charArray);
		for (int i = 0; i < 10; i++) {
			System.out.print(charArray[i]);
		}
		System.out.println(String.valueOf(charArray));
	}
}
