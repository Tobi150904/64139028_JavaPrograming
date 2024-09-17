package Citizen;

import java.sql.Date;

public class Citizen {
	private String Name;
	private String Id;
	private Date YearOfBirth;
	private String Gender;
	private String Nationality;
	
	public Citizen(String name,String id, Date year, String gender, String nationality) {
        this.Name = name;
        this.Id = id;
        this.YearOfBirth = year;
        this.Gender = gender;
        this.Nationality = nationality;
    }
	
	public String getName() {
		return Name;
	}
	
	public void setName(String name) {
		this.Name = name;
	}

	public String getId() {
		return Id;
	}

	public void setId(String id) {
        this.Id = id;
    }
	
	public Date getYearOfBirth() {
		return YearOfBirth;
	}
	
	public void setYearOfBirth(Date yearOfBirth) {
		this.YearOfBirth = yearOfBirth;
	}
	
	public String getGender() {
		return Gender;
	}
	
	public void setGender(String gender) {
		this.Gender = gender;
	}
	
	public String getNationality() {
		return Nationality;
	}
	
	public void setNationality(String nationality) {
		this.Nationality = nationality;
	}

	@Override
	public String toString() {
        return "Name: " + Name + "\nId: " + Id + "\nYearOfBirth: " + YearOfBirth + "\nGender:" + 
	            		Gender + "\nNationality: " + Nationality + "\n";
	}
}
