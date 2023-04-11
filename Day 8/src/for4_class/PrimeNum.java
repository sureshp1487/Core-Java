package for4_class;

public class PrimeNum {
	public static void main(String[] args) {
		int num=20;
		for(int i=0;i<1;i++) {
		if(num%1==0 & num%num==0) {
			System.out.println(num+" not prime");
		}else {
			System.out.println(num+" prime");
		}
		}
		
//		second way
		
		int num1=122;
		boolean isflag=true;
		for(int i=0;i<num1;i++) {
			if(num1%2==0) {
				isflag=false;
			}
		}
		if(isflag) {
			System.out.println("Prime");
		}else {
			System.out.println("Not Prime");
		}
		}
	}


