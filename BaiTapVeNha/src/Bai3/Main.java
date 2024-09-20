package Bai3;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Book book = new Book();
		ArrayList<Book> bookList = new ArrayList<>();
		int choice;
		do {
			System.out.println("Menu");
			System.out.println("1. Insert Book");
			System.out.println("2. View list of books");
			System.out.println("3. Average price");
			System.out.println("4. Exit");
			System.out.println("Choice: ");
			choice = sc.nextInt();
			switch(choice) {
				case 1:
					sc.nextLine();
					System.out.println("Enter name: ");
					book.setName(sc.nextLine());
					System.out.println("Enter publish date: ");
					book.setPublishDate(sc.nextLine());
					System.out.println("Enter author: ");
					book.setAuthor(sc.nextLine());
					System.out.println("Enter language: ");
					book.setLanguage(sc.nextLine());
					System.out.println("Enter 5 prices: ");
					for(int i = 0; i < 5; i++) {
						System.out.println("Price " + (i + 1) + ": ");
						book.PriceList[i] = sc.nextInt();
					}
					bookList.add(book);
					break;
				case 2:
					for(Book b : bookList) {
						b.Display();
					}
				    break;
				case 3:
					for(Book b : bookList) {
                        b.Calculate();
                        b.Display();
                    }
					break;
				case 4:
					System.exit(0);
					break;
				default:
                    System.out.println("Invalid choice");
                    break;
			}
		}while(choice != 0);
	}
}
