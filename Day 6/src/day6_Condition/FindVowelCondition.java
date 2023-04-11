package day6_Condition;

public class FindVowelCondition {
	public static void main(String[] args) {

	String name="onesoft";
	
	if(name.contains("a")||name.contains("e")||name.contains("i")||name.contains("o")||name.contains("u")) {
	
		System.out.println(name+" is contains vowels");
	}else {
		
		System.out.println(name+" it does not contains vowels");
	}
}
}