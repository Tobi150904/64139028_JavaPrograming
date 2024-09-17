package bai4;

import java.util.Scanner;

public class bai4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        double height, weight;
        double bmi;
        
        System.out.println("Nhap can nang (kg): ");
        weight = sc.nextDouble();
        System.out.println("Nhap chieu cao (m): ");
        height = sc.nextDouble();
        bmi = weight / (height * height);
		while (bmi < 0) {
			System.out.println("Vui long nhap");
			try {
				System.out.println("Nhap can nang (kg): ");
				weight = sc.nextDouble();
			} catch (Exception e) {
				System.out.println("Vui long nhap so ");
				sc.next();
				continue;
			}
			System.out.println("Enter your height (m): ");
			height = sc.nextDouble();
			bmi = weight / (height * height);
		}
		if (bmi < 18.5) {
			System.out.println("Can nang thap");
		} else if (bmi < 24.9) {
			System.out.println("Binh thuong");
		} else if (bmi >= 25) {
			System.out.println("Thua can");
		} else if (bmi > 25 && bmi <= 29.9){
			System.out.println("Tien beo phi");
        } else if (bmi > 30 && bmi <= 34.9){
			System.out.println("Beo phi cap do I");
		} else if (bmi > 35 && bmi <= 39.9) {
			System.out.println("Beo phi cap do II");
        } else {
			System.out.println("Beo phi cap do III");
		}
	}
}
