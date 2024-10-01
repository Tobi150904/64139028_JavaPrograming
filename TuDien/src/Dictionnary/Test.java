package Dictionnary;

import java.util.ArrayList;

public class Test {
	public static void main(String[] args) {
		ArrayList<TuDien> list = new ArrayList<TuDien>();
		list.add(new TuDien("hello", "xin chào"));
		list.add(new TuDien("goodbye", "tạm biệt"));
		list.add(new TuDien("love", "yêu"));
		list.add(new TuDien("hate", "ghét"));
		list.add(new TuDien("like", "thích"));
		list.add(new TuDien("dislike", "không thích"));
		list.add(new TuDien("beautiful", "đẹp"));
		list.add(new TuDien("ugly", "xấu"));
		list.add(new TuDien("smart", "thông minh"));
		list.add(new TuDien("stupid", "ngu ngốc"));
		
		for (TuDien td : list) {
			System.out.println(td);
		}
	}
}
