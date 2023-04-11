package for5_Class;

public class UseFan1 {
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
		//create new new object 
		Fan min=new Fan();
		min.price=fan1.price;
		for(int i=0;i<fans.length;i++) {
		
		if(fans[i].price<min.price) {
		min.price=fans[i].price;
		min=fans[i];
		}
		}
		System.out.println("netPrice : "+min.price+"\nbrand name : "+min.brand+"\ncolor : "+min.color);
		//System.out.println("brand name : "+fans[maxI].brand+"\nbrand price : "+fans[maxI].price+"\nisWarranty : "+fans[maxI].isWarranty);
	}

}
