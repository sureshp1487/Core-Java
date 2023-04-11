package day6_Condition;

public class UseMobile {
	public static void main(String[] args) {
		Mobile mobile =new Mobile();
		mobile.brand="vivo";
		mobile.price=18000;
		mobile.isWaterProof=true;
		
		Mobile mobile1 =new Mobile();
		mobile1.brand="samsung";
		mobile1.price=12000;
		mobile1.isWaterProof=true;
		
		Mobile mobile2=new Mobile();
		mobile2.brand="oppo";
		mobile2.price=23000;
		mobile2.isWaterProof=true;
		
		Mobile mobile3 =new Mobile();
		mobile3.brand="realme";
		mobile3.price=43000;
		mobile.isWaterProof=true;
		
		
		if(mobile.price>mobile1.price && mobile.price>mobile2.price && mobile.price>mobile3.price) 
		{	
			System.out.println("Mobile :"+(mobile.price-mobile.price*30/100));	
		}
		else if(mobile1.price > mobile.price && mobile1.price>mobile2.price  &&mobile2.price>mobile3.price)
		{
			System.out.println("Mobile 1:"+(mobile1.price-mobile1.price*30/100));
		}
		else if(mobile2.price > mobile.price && mobile2.price > mobile1.price && mobile2.price >mobile3.price){
			System.out.println("Mobile 2:"+(mobile2.price -mobile2.price*30/100));
		}
		else if(mobile3.price>mobile.price &&mobile3.price>mobile1.price && mobile3.price >mobile2.price) {
		System.out.println("Mobile 3:"+(mobile3.price-mobile3.price*30/100));	
		}
		}

}
class Mobile{
	String brand;
	int price;
	boolean isWaterProof;
	
}