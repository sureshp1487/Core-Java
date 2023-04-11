package for4_class;

public class FindStringLen {
	public static void main(String[] args) {
		String[]word={"suresh","mani","sangeetha","roja"};
		String max=word[1];
		
		for(int i=0;i<word.length;i++) {
			if(word[i].length()>max.length()) {
				max=word[i];
			}
		}
		System.out.println(max);
	}

}
