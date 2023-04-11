package forClass1;

public class PrintPattern {
	public static void main(String[] args) {
		String word="onesoft";
		String otherWord="";
		
		for(int i=0;i<word.length();i++) {
			otherWord=otherWord+word.charAt(i);
			
			System.out.println(otherWord);
		}
	}

}
