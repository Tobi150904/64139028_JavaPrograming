package Bai2;
import java.util.ArrayList;
import java.util.Scanner;

public class NewsManagement {
    public static void main(String[] args) {
        ArrayList<News> newsList = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int option;

        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Insert news");
            System.out.println("2. View list news");
            System.out.println("3. Average rate");
            System.out.println("4. Exit");
            System.out.print("Mời bạn nhập một lựa chọn: ");

            option = sc.nextInt();

            switch (option) {
                case 1: // Insert news
                    News news = new News();
                    sc.nextLine(); // consume newline
                    System.out.print("Nhập Title: ");
                    news.setTitle(sc.nextLine());
                    System.out.print("Nhập Publish Date: ");
                    news.setPublishDate(sc.nextLine());
                    System.out.print("Nhập Author: ");
                    news.setAuthor(sc.nextLine());
                    System.out.print("Nhập Content: ");
                    news.setContent(sc.nextLine());
                    
                    System.out.println("Nhập 3 đánh giá:");
                    for (int i = 0; i < 3; i++) {
                        System.out.format("Đánh giá %d: ", i + 1);
                        news.RateList[i] = sc.nextInt();
                    }

                    newsList.add(news);
                    break;

                case 2: // View list news
                    for (News n : newsList) {
                        n.Display();
                    }
                    break;

                case 3: 
                    for (News n : newsList) {
                        n.Calculate();
                        n.Display();
                    }
                    break;
                    
                 case 4:
					System.exit(0);
					break;

                default:
                    System.out.println("Lựa chọn không hợp lệ, vui lòng thử lại.");
            }
        }
    }
}
