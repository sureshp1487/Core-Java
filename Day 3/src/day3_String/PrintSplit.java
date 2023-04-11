  package day3_String;

public class PrintSplit {
	public static void main(String[] args) {
		String word="Welcome world";
		
		String []words=word.split("l");
		
		System.out.println(words[1]);
	}

}
