package day3_String;

public class PrintEqualIgnoreCase {
	public static void main(String[] args) {
		
		String name="suresh";
		String name1="SURESH";
		
		boolean isEqualsIgnoreCase=name.equalsIgnoreCase(name1);
		
		System.out.println(isEqualsIgnoreCase);
	}

}
