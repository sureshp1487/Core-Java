package for4_class;

public class OddAndEven {
	public static void main(String[] args) {
		int[]nums= {1,2,3,4,5,6,7,8,9};
		int count=0;
		int count1=0;
		
		for(int i=0;i<nums.length;i++) {
			if(nums[i]%2==0) {
				count=count+1;
			}else {
				count1=count1+1;
			}
		}
		System.out.println("Even Num count = "+count);
		System.out.println("Odd Num count = "+count1);
	}

}
