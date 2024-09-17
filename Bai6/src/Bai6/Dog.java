package Bai6;

public class Dog implements Animal{
	private String Category;
    private boolean Gender;
    public Dog(String category, boolean gender) {
        this.Category = category;
        this.Gender = gender;
    }
	@Override
	public void sound() {
		// TODO Auto-generated method stub
		System.out.println("Gau Gau");
	}
	public String toString() {
        return "Category: " + Category + "\nGender: " + Gender;
	}
    
}
