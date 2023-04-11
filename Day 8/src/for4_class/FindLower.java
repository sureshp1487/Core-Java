package for4_class;

public class FindLower {
	public static void main(String[] args) {
		int []nums= {20,17,16,23,12};
		int low=nums[1];
		for(int i=0;i<nums.length;i++) {
			if(nums[i]<low) {
				low=nums[i];
			}
		}
		System.out.println(low);
		
	}

}
