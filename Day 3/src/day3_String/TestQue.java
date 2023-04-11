package day3_String;

public class TestQue {
	public static void main(String[] args) {
		String words="world wide wonder";
		
		String []arr=words.split(" ");
		
		String word=((arr[0]+","+arr[1]+","+arr[2]).toUpperCase());
		
		String words1=word.concat(" program");
		System.out.println(words1);
		
	}

}
