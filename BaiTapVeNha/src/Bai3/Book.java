package Bai3;

public class Book implements IBook{
	private int id;
	private String name;
	private String publishDate;
	private String author;
	private String language;
	private float averagePrice;
	int[] PriceList = new int[5];
	
	public Book(int id, String name, String publishDate, String author, String language, float averagePrice) {
		this.id = id;
		this.name = name;
		this.publishDate = publishDate;
		this.author = author;
		this.language = language;
		this.averagePrice = averagePrice;
	}
	
	public Book() {
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPublishDate() {
		return publishDate;
	}

	public void setPublishDate(String publishDate) {
		this.publishDate = publishDate;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public float getAveragePrice() {
		return averagePrice;
	}

	@Override
	public void Display() {
		System.out.println("Name: " + name);
		System.out.println("PublishDate: " + publishDate);
		System.out.println("Author: " + author);
		System.out.println("Language: " + language);
		System.out.println("Average: " + averagePrice);
	}
	
	public void Calculate() {
		this.averagePrice = (float)(PriceList[0] + PriceList[1] + PriceList[2] + PriceList[3] + PriceList[4]) / 5;
	}
}
