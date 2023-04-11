package interview;

public class FindSumArrays {
	public static void main(String[] args) {
		int []amount= {23,12,10,5,20};
		int total=0;
		
		for(int i=0;i<amount.length;i++) {
			total=total+amount[i];
		}
		System.out.println("total amount :"+total);
	}

}
