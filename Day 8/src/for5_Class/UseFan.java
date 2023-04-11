package for5_Class;

public class UseFan {
	public static void main(String[] args) {
		Fan fan1=new Fan();
		fan1.brand="usha fan";
		fan1.price=3500;
		fan1.color="brown";
		fan1.isWarranty=true;
		
		Fan fan2=new Fan();
		fan2.brand="croma fan";
		fan2.price=2500;
		fan2.color="white";
		fan2.isWarranty=true;
		
		Fan fan3=new Fan();
		fan3.brand="G brand";
		fan3.price=1500;
		fan3.color="black";
		fan3.isWarranty=false;
		
		Fan []fans= {fan1,fan2,fan3};
		int maxPrice=0; 
		int maxI=0;
		
		for(int i=0;i<fans.length;i++) {
			if(fans[i].price>maxPrice) {
				
				maxI=i;
				maxPrice=fans[i].price-(fans[i].price*8/100);
				
			}
			
		}
		System.out.println("netPrice : "+maxPrice);
		System.out.println("brand name : "+fans[maxI].brand+"\nbrand price : "+fans[maxI].price+"\nisWarranty : "+fans[maxI].isWarranty);
	}

}
