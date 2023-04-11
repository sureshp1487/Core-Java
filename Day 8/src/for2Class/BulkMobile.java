package for2Class;

public class BulkMobile {
	public static void main(String[] args) {
		int []mobile= {100,200,300,400};
		int count=0;
		for(int i=0;i<mobile.length;i++) {
			System.out.println("Index of "+i+" is "+mobile[i]);
			count=count+1;
			
		}
		System.out.println("Count="+count);
	
	}

}
