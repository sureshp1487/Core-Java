package for5_Class;

public class UseSmartPhone {
	public static void main(String[] args) {
		SmartPhone sp=new SmartPhone();
		sp.brand="oppo";
		sp.price=17000;
		sp.model="f17";
		sp.cemera="32 mp";
		
		SmartPhone sp1=new SmartPhone();
		sp1.brand="Samsung";
		sp1.price=20000;
		sp1.model="s21";
		sp1.cemera="64 mp";
		
		SmartPhone sp2=new SmartPhone();
		sp2.brand="redmi";
		sp2.price=14000;
		sp2.model="mi 8";
		sp2.cemera="16 mp";
		
		SmartPhone sp3=new SmartPhone();
		sp3.brand="iphone";
		sp3.price=65000;
		sp3.model="11 pro";
		sp3.cemera="16 mp sony lens";
		
		SmartPhone[]smartPho= {sp,sp1,sp2,sp3};
		
//		//create new instance
//		SmartPhone max=new SmartPhone();
//		max.brand ="";
//		
//		for(SmartPhone var:smartPho) {
//			if(var.brand.length()>max.brand.length()) {
//			max=var;
//				
//			}
//		}
//		System.out.println("Brand :"+max.brand+"\nPrice :"+max.price+"\nModel"+max.model+"\nCemera :"+max.cemera);
	
//	find minimum
		
		SmartPhone min=new SmartPhone();
		min.brand=smartPho[1].brand;//smartPho[i] this is array index value [1].brand name Samsung stored in min.brand or
		
		for(SmartPhone phone:smartPho) {
			if(phone.brand.length()<min.brand.length()) {
				min=phone;
			}
		}
		System.out.println("Brand :"+min.brand+"\nPrice :"+min.price+"\nModel :"+min.model+"\nCemera :"+min.cemera);
	}

}
class SmartPhone{
	String brand;
	int price;
	String model;
	String cemera;
}
