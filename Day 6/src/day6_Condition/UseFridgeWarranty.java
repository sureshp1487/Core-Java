package day6_Condition;

public class UseFridgeWarranty {
	public static void main(String[] args) {
		
		FridgeWarranty fridge= new FridgeWarranty();
		fridge.brand="Samsung";
		fridge.price=20000;
		fridge.color="black";
		boolean isWarranty=true;

		if(fridge.isWarranty==false) {
			System.out.println(fridge.price+(fridge.price*10)/100);
		}else
		{
			System.out.println(fridge.price-(fridge.price*10)/100+" is not warranty");
		}
	}

}
