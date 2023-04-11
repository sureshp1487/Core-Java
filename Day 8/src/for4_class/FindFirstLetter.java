package for4_class;

public class FindFirstLetter {
	public static void main(String[] args) {
		String []name= {"ruresh","mani","suriya"};
		for(int i=0;i<name.length;i++) {
			if(name[i].startsWith("s")) {
				System.out.println(name[i]);
			}
			
		}
	}

}
