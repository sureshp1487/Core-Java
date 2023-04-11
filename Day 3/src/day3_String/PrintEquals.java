package day3_String;

public class PrintEquals {
	public static void main(String[] args){
		String name="mani";
		String name1="suresh";
//		should be pass the parameter
		boolean isEqual=name.equals(name1);
//		should be pass the direct String value
		boolean isEqual1=name1.equals("suresh");
		
		System.out.println(isEqual);
		System.out.println(isEqual1);
		
	}
	

}
