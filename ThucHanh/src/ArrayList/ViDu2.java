package ArrayList;

import java.util.ArrayList;
import java.util.List;

public class ViDu2 {
	@SuppressWarnings("removal")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list = new ArrayList<String>();
		System.out.println("Size of list: " + list.size());
		for (int i = 1; i <= 10; i++) {
			list.add("Value is: " + new Integer(i));
		}
		list.set(5, "Hello world");
		System.out.println("Value is: " + (String)list.get(5));
	}
}
