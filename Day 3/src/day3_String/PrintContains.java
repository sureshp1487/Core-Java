package day3_String;

public class PrintContains {
	public static void main(String[] args) {
		String name="suresh";
//		string value is join character ans: true 
		boolean contains=name.contains("su");
//		without join character ans: false
		boolean contains1=name.contains("sr");
		System.out.println(contains);
		System.out.println(contains1);
	}

}
