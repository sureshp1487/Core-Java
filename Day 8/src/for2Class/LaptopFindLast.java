package for2Class;

public class LaptopFindLast {
	public static void main(String[] args) {
		String []laptop= {"lenovo","dell","samsung","hp"};
		
		for(int i=0;i<laptop.length;i++) {
			System.out.println(laptop[i].charAt(laptop[i].length()-1));
		}
	}

}
