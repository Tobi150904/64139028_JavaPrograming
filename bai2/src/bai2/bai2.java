package bai2;

import java.util.Scanner;

public class bai2 {
	public static void main(String[] args) {
		int a, b, tong;
		Scanner sc = new Scanner(System.in);
		System.out.println("Tinh tong 2 so a va b");
		System.out.println("Nhap a: ");
		a = sc.nextInt();
		System.out.println("Nhap b: ");
		b = sc.nextInt();
		tong = a + b;
		System.out.println("Tong cua a va b la: " + tong);
	}
}
