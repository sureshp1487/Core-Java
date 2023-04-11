package for4_class;

public class FindPalindrome {
	public static void main(String[] args) {
		String name="amm";
		String name1="";
		
		for(int i=name.length()-1;i>=0;i--) {
			name1=name1+name.charAt(i);
		}
		if(name.equalsIgnoreCase(name1)) {
			System.out.println("palindrome");
		}else {
			System.out.println("not palindrome");
		}
	}

}
