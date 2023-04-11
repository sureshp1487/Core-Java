package day3_String;

public class TaskString {
	public static void main(String[] args) {
		String name="suresh";
		String name1=" kumar";		
		String fullName=name.concat(name1);		
		String fullName1=fullName.toUpperCase();
		String fullName2=fullName1.substring(0,7);
		System.out.println(fullName1);
	}

}
