package FileDemo;

import java.io.FileWriter;
import java.io.IOException;

public class App2 {
	public static void main(String[] args) throws IOException {
		FileWriter fw = new FileWriter("testout.txt");
		fw.write("Hello World");
		fw.close();
	}	
}
