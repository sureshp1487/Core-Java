package day6_Condition;

public class FindDigit {
	public static void main(String[] args) {
		int num=99;
		
		if(num>0&&num<10) {
			System.out.println("One Digit Number");
		}else if(num>=10 && num<100) {
			
			System.out.println("two Digit Number");
		}else if(num>=100  && num<1000) {
			System.out.println("Three Digit Number");
		}
	}

}
