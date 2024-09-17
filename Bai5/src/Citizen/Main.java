package Citizen;

import java.sql.Date;

public class Main {
	public static void main(String[] args) {
	    Citizen citizen = new Citizen("Nguyen Van A", "123456789", Date.valueOf("1999-01-01"), "Nam", "Viet Nam");
        System.out.println(citizen.toString());
	}

}	
