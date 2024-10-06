package FileDemo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class App1 {
	public static void main(String[] args) throws IOException {
		FileInputStream fis = null;
		fis = new FileInputStream("testout.txt");
		int byteNum;
		while(true) {
			byteNum = fis.read();
			if(byteNum == -1) break;
			System.out.println(byteNum);
			System.out.println("");
		}
		System.out.println("Done");
		
	}
}

