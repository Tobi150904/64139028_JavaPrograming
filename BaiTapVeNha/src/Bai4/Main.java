package Bai4;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		StudentMark student = new StudentMark();
		ArrayList<StudentMark> listStudent = new ArrayList<>();
		int choice;
		do {
			System.out.println("Please select an option:");
			System.out.println("1. Insert new student");
			System.out.println("2. View list of Students");
			System.out.println("3. Average Mark");
			System.out.println("4. Exit");
			System.out.println("Option: ");
			choice = sc.nextInt();
			switch(choice) {
				case 1:
					sc.nextLine();
					System.out.println("Please input student fullname: ");
					student.setFullname(sc.nextLine());
					System.out.println("Please input class name: ");
					student.setNameClass(sc.nextLine());
					System.out.println("Please input semester: ");
					student.setSemester(sc.nextInt()); 
					student.setID(listStudent.size() + 1);
					for(int i = 0; i < 5; i++) {
						System.out.println("Please input marks of subject " + (i + 1) + ": ");
						student.SubjectMark[i] = sc.nextInt();
					}
					listStudent.add(student);
					break;
				case 2:
					for (StudentMark s : listStudent) {
						s.Display();
					}
				    break;
				case 3:
					for(StudentMark s : listStudent) {
						s.AveCal();
						s.Display();
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
