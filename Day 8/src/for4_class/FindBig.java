package for4_class;

public class FindBig {
	public static void main(String[] args) {
		int []nums= {23,45,12,87,43};
		int max=0;
		
		for(int i=0;i<nums.length;i++) {
			if(nums[i]>max) {
			max=nums[i];
			}
		}
		System.out.println(max);
	}

}
