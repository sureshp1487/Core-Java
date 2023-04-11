package string12;

public class str {
	public static void main(String[] args) {
		String value= "12345";
		
		
		int total=0;
		
		for(int i=value.length();i>=0;i--) {
			total=total+Integer.valueOf(i);
			
		}
	System.out.println("sum of :"+total);
	}

}
