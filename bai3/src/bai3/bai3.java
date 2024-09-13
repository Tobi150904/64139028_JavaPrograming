package bai3;

import java.util.Scanner;

public class bai3 {
	public static void main(String[] args) {
		double a;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Nhap vao so thuc a: ");
		a = sc.nextDouble();
		
		if (a % 2 == 0) {
            System.out.println("So " + a + " la so chan");
        } else {
            System.out.println("So " + a + " la so le");
        }
		System.out.println("Bye");
	}
}
