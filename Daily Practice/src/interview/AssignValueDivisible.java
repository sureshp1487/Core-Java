package interview;

public class AssignValueDivisible {
	public static void main(String[] args) {
		for(int i=1;i<=20;i++) {
			if(i%3==0) {
				System.out.println("3 divisible :"+"BUZZ");
			} if(i%6==0){
				System.out.println("6 divisible :"+"FIZZBUZZ");
			}
		}
	}

}
