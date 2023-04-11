package day3_String;

public class Task2 {
	public static void main(String[] args) {
		String word="welcome to my little WORLD";
		
		char words[]=word.toCharArray();
//		System.out.println(words[0]);
//		System.out.println(words[1]);
//		System.out.println(words[2]);
//		System.out.println(words[3]);
//		System.out.println(words[4]);
//		System.out.println(words[5]);
//		System.out.println(words[6]);
//		for(char v:words) {
//			System.out.println(v);
//		}
		

//		
//		String[]words1=word.split(" ");
//		System.out.println((words1[3]+words1[4]).toUpperCase());
//		System.out.println(words1[4].charAt(4));
//		System.out.println(words1[4].charAt(3));
//		System.out.println(words1[0].substring(0,7));
		
		
//		another method 
//		upperCase() method
		
		String upperCase=word.toUpperCase();
		System.out.println(upperCase);
		
//		lowerCase() method
		String lowerCase=word.toLowerCase();
		System.out.println(lowerCase);
		
//		length() include space also count
		int length=word.length();
		System.out.println(length);
		
		
		
		
		
		
		
		
		
		
	}

}
