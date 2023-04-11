package for4_class;

public class FindPositveAndNegative {
	public static void main(String[] args) {
		int []nums= {1,2,3,4,5,-5,-3,-4,-6};
		int count=0;
		int count1=0;
		
		for(int i=0;i<=nums.length-1;i++) {
			if(nums[i]>0) {
				count=count+1;
			}else {
				count1=count1+1;
			}
		}
		System.out.println("Pasitve Num = "+count);
		System.out.println("Negative Num = "+count1);
	}

}
