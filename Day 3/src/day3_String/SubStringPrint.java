package day3_String;

import java.util.Spliterator;

public class SubStringPrint {
	public static void main(String[] args) {
		String word="suresh kumar manik";
		
		String word2 []=word.split(" ");
		
//		for(String var:splitstr) {
//			System.out.println(var.charAt(var.length()-1));
//		}
		for(int i=0;i<=word2.length-1;i++) {
			if(word2[i].length()%2==0) {
				
				System.out.println(word2[i].substring(word2[i].length()/2-1,word2[i].length()/2+1));
			}
			else {
				System.out.println(word2[i].charAt(word2[i].length()/2));
			}
			
			//System.out.println(word2[i].charAt(0));
		}

		
		/*String word3=word.replace("suresh", "pravin");
		String word1=word.substring(0,7);
		System.out.println(word1);*/
		
	}

}
