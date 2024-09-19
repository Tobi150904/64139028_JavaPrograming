package Bai2;

public class News implements INews{
	private int ID;
	private String Title;
	private String PublishDate;
	private String Author;
	private String Content;
	private float AverageRate;
	int[] RateList = new int[3];
	
	public News(int id, String title, String publishDate, String author, String content) {
		this.ID = id;
		this.Title = title;
		this.PublishDate = publishDate;
		this.Author = author;
		this.Content = content;
	}

	public News() {
		// TODO Auto-generated constructor stub
	}

	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		this.ID = iD;
	}
	public String getTitle() {
		return Title;
	}
	public void setTitle(String title) {
		this.Title = title;
	}
	public String getPublishDate() {
		return PublishDate;
	}
	public void setPublishDate(String publishDate) {
		this.PublishDate = publishDate;
	}
	public String getAuthor() {
		return Author;
	}
	public void setAuthor(String author) {
		this.Author = author;
	}
	public String getContent() {
		return Content;
	}
	public void setContent(String content) {
		this.Content = content;
	}
	public float getAverageRate() {
		return AverageRate;
	}

	public void Display() {
		System.out.println("ID: " + ID);
		System.out.println("Title: " + Title);
		System.out.println("Publish Date: " + PublishDate);
		System.out.println("Author: " + Author);
		System.out.println("Content: " + Content);
		System.out.println("Average Rate: " + AverageRate);
	}
	
	public void Calculate () {
		this.AverageRate = (float)(RateList[0] + RateList[1] + RateList[2]) / 3;
	}
	
	
}
