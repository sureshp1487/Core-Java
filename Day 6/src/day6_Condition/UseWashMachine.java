package day6_Condition;

public class UseWashMachine {
	public static void main(String[] args) {
		WashMachine check= new WashMachine();
		
		check.brand="croma";
		check.price=18000;
		check.color="white";
		boolean isWarranty;
		
		if(check.brand.contains("a")||check.brand.contains("e")||check.brand.contains("i")||check.brand.contains("o")||check.brand.contains("u")) {
			
			System.out.println(check.brand.substring(check.brand.length()/2,check.brand.length()));
		}else {
			System.out.println(check.brand.substring(0,check.brand.length()/2));
		}
		
	}

}
