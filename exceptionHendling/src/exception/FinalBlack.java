package exception;

public class FinalBlack {
	public static void main(String[] args) {
		try {
			int [] nums= {10,20,30,40};
			System.out.println(nums[4]);
		}	
		catch(StringIndexOutOfBoundsException ea) {
			ea.printStackTrace();
		}
		finally {
			System.out.println("db closed");
		}
		
	}

}
