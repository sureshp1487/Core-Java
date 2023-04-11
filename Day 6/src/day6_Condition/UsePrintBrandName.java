package day6_Condition;

public class UsePrintBrandName {
	public static void main(String[] args) {
		 PrintBrandName brand1=new  PrintBrandName();
		 brand1.brand="cello";
		 brand1.price=20;
		 brand1.color="blue";
		 
		 PrintBrandName brand2= new  PrintBrandName();
		 
		 brand2.brand="camlin";
		 brand2.price=15;
		 brand2.color="black";
		 
		 if(brand1.price>brand2.price) {
			 System.out.println(brand1.brand.toUpperCase()+" Brand1 is greater");
		 }else {
			 System.out.println(brand2.brand.toUpperCase()+" Brand2 is greater");
		 }
	}

}
