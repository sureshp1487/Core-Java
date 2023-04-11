package day6_Condition;

public class UseFindBigNum {
	public static void main(String [] args) {
		
		FindBigNum age=new FindBigNum();
		
		age.suresh=23;
		age.mani=4;
		age.sangeetha=10;
		
		
		if(age.suresh>age.mani && age.suresh>age.sangeetha) {
			
			System.out.println(age.suresh+" suresh is greater");
			
		}else if(age.mani>age.sangeetha&&age.mani>age.sangeetha) {
			
			System.out.println(age.mani+" mani is greater");
		}else if(age.sangeetha>age.suresh && age.sangeetha>age.mani) {
			
			System.out.println(age.sangeetha+" sangeetha is greater");
		}
		else {
			System.out.println("Invalid data");
		}
		
		
		
	}
	

}
