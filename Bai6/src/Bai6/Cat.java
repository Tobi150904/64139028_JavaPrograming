package Bai6;

public class Cat implements Animal{
	private String Category;
	private boolean Gender;
	
	public Cat(String category, boolean gender) {
        this.Category = category;
        this.Gender = gender;
    }

	@Override
	public void sound() {
		// TODO Auto-generated method stub
		System.out.println("Meo Meo");
	}

	public String toString() {
        return "Category: " + Category + "\nGender: " + Gender;
	}

	
}
