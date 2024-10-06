package FileDemo;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileOutputStream fos = null;
		try {
			fos = new FileOutputStream("testout.txt");
		} catch (FileNotFoundException e) {
			System.out.println("File not found");
		}
		try {
			for (int i = 65; i <= 90; i++) {
				fos.write(i);
			}
			fos.flush();
			fos.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("Success...");	
	}
}
