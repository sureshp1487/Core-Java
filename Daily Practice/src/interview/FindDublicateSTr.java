package interview;

public class FindDublicateSTr {
	public static void main(String[] args) {
		String name="sureshe";
		String dup="";
		
		for(int i=0;i<name.length();i++) {
			for(int j=i+1;j<name.length();j++) {
				if(name.charAt(i)==name.charAt(j)) {
					dup=dup+name.charAt(j);
					break;
				}
			}
		}
		
		System.out.println(dup);
	}
}
