package forClass1;

public class ReverseString {
	public static void main(String[] args) {
		String word="onesoft";
		
		for(int i=word.length()-1;i>=0 ;i--) {
			System.out.println(word.charAt(i));
		}
	}

}
