package Dictionnary;

public class TuDien {
	private String word;
	private String meaning;
	
	public TuDien(String w, String m) {
		this.word = w;
		this.meaning = m;
	}

	public String getWord() {
		return word;
	}

	public void setWord(String word) {
		this.word = word;
	}

	public String getMeaning() {
		return meaning;
	}

	public void setMeaning(String meaning) {
		this.meaning = meaning;
	}

	public String toString() {
		return "word=" + word + ", meaning=" + meaning ;
	}
}
