package Bai1;
import java.util.Scanner;


public class ManagePhoneBook {
	public static void main(String[] args) {
		PhoneBook phonebook = new PhoneBook();
		Scanner sc = new Scanner(System.in);
		
		int choice;
		do {
			System.out.println("PHONEBOOK MANAGEMENT SYSTEM");
			System.out.println("1. Insert Phone");
			System.out.println("2. Remove Phone");
			System.out.println("3. Update Phone");
			System.out.println("4. Search Phone");
			System.out.println("5. Sort");
			System.out.println("0. Exit");
			System.out.print("Choose: ");
			choice = sc.nextInt();
			sc.nextLine();
			switch (choice) {
				case 1:
	                System.out.println("Enter name: ");
	                String name = sc.nextLine();
	                System.out.println("Enter phone: ");
	                String phone = sc.nextLine();
	                phonebook.insertPhone(name, phone);
	                break;
				case 2: 
					System.out.print("Enter name: ");
					name = sc.nextLine();
					phonebook.removePhone(name);
					break;
				case 3:
					System.out.println("Enter name: ");
					name = sc.nextLine();
					System.out.println("Enter new phone: ");
					phone = sc.nextLine();
					phonebook.updatePhone(name, phone);
				case 4:
					System.out.println("Enter name: ");
					name = sc.nextLine();
					phonebook.searchPhone(name);
					break;
				case 5:
					phonebook.sort();
					break;
				case 0:
					break;
				default:
					System.out.println("Invalid choice!");
					break;
				
			}
		}while (choice != 0);
	}
}
