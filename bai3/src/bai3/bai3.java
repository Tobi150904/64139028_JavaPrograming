package bai3;

import java.util.Scanner;

public class bai3 {
	public static void main(String[] args) {
		int a;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter an integer: ");
		a = sc.nextInt();
		
		if (a % 2 == 0) {
            System.out.println(a + " is even");
        } else {
            System.out.println(a + " is odd");
        }
		System.out.println("bye");
	}
}
