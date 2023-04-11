package for2Class;

public class Bag {
	public static void main(String[] args) {
		int []noOfBag=new int[6];
		noOfBag[0]=12;
		noOfBag[1]=23;
		noOfBag[2]=13;
		noOfBag[3]=16;
		noOfBag[4]=45;
		noOfBag[5]=32;
		
		for(int i=noOfBag.length/2-1;i>=0;i--) {
			
			System.out.println(noOfBag[i]);
		}
	}

}
