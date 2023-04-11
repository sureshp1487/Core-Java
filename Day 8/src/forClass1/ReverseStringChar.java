package forClass1;

public class ReverseStringChar {
	public static void main(String[] args) {
		String word="onesoft";
		
		String reverseWord="";
		for(int i=word.length()-1;i>=0;i--) {
			
			reverseWord=reverseWord+word.charAt(i);
			
		}
		System.out.println(reverseWord);
	}

}
