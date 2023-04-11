package InhertanceIN;

public class UseLoanPerson {
	public static void main(String[] args) {
//		cannot use static keyword local variable
//		static String name;
		
		SuperBike bike=new SuperBike();
	System.out.println("BrandName :"+bike.brandName+"\nModel1"+bike.model1+"\nModel2:"+bike.model2+"\nModel3 :"+bike.model3+"\nSuperBike :"+bike.superbike);
	
		
//	class level upcasting 
//	super
	Vehicle bike1=new VehicleModel();
	//int a= double b;
//	sub
	VehicleModel v=(VehicleModel)bike1;
	System.out.println("class level typecasting :"+v.brandName);
	
	
	}
}
