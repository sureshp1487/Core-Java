package forClass1;

public class FindAverage {
	public static void main(String[] args) {
		int total=0;
		int count=0;
		
		for(int i=1;i<=20;i++) {
			
			total=total+i;
			count=count+1;
		}
		System.out.println("total = "+total);
		System.out.println("count = "+count);
		
		int average=total/count;
		System.out.println("average = "+average);
		
	}

}
