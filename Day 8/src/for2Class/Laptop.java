package for2Class;

public class Laptop {
	public static void main(String[] args) {
		String []memorySize=new String [4];
		
		memorySize[0]="4 GB";
		memorySize[1]="8 GB";
		memorySize[2]="10 GB";
		memorySize[3]="12 GB";
		
		for(int i=memorySize.length-1;i>=0;i--) {
			System.out.println(memorySize[i]);
		}
		
		
	}

}
