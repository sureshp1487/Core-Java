package for2Class;

public class Test {
	public static void main(String[] args) {
		String word= "suresh";
		char []words=word.toCharArray();
		
		for(int i=words.length-1;i>=0;i--) {
			System.out.println(words[i]);
		}
	}

}
