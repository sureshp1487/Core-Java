package for4_class;

public class FindPrime1 {
	public static void main(String [] args) {
		int nums=7;
		boolean isPrime=true;
		
		for(int i=2;i<nums;i++) {
			if(nums%i==0) {
				isPrime=false;
			}
		}
		if(isPrime==true) {
			System.out.println("is Prime");
		}else {
			System.out.println("is Not Prime");
		}
		
	}

}
