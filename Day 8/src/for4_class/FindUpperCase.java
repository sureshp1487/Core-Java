package for4_class;

public class FindUpperCase {
	public static void main(String[] args) {
		String name="oNeSoFT";
		String name1=name.toUpperCase();
		int count=0;
		
		for(int i=0;i<=name.length()-1;i++) {
			
			if(name.charAt(i)==name1.charAt(i)) {
				count=count+1;
				System.out.println("Upper Characker = "+name.charAt(i));
			}
		}
		System.out.println("Upper Case Count = "+count);
		
	}

}
