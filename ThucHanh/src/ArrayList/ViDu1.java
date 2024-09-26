package ArrayList;

import java.util.ArrayList;
import java.util.List;

public class ViDu1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list = new ArrayList<String>();
		System.out.println("Size of list: " + list.size());
		for (int i = 0; i < 10; i++) {
			list.add("Element " + i);
		}
		System.out.println("Size of list: " + list.size());
		for (String s : list) {
			System.out.println(s);
		}
		
		
	}

}
