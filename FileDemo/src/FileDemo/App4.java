package FileDemo;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class App4 {
	public static void main(String[] args) throws IOException {
		FileReader fr = new FileReader("testout.txt");
		BufferedReader br = new BufferedReader(fr);
		
		String line = br.readLine();
		System.out.println(line);
	}
}
