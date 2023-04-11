package for3_Class;

public class UseFruits {
	public static void main(String[] args) {
		Fruits fru=new Fruits();
		fru.fruitsName="apple";
		fru.price=47;
		fru.isHybried=true;
		
		Fruits fru1=new Fruits();
		fru1.fruitsName="orange";
		fru1.price=87;
		fru1.isHybried=true;
		
		Fruits fru2=new Fruits();
		fru2.fruitsName="Water millan";
		fru2.price=30;
		fru2.isHybried=true;
		
		Fruits fru3=new Fruits();
		fru3.fruitsName="banana";
		fru3.price=20;
		fru3.isHybried=false;
		
		Fruits fru4=new Fruits();
		fru4.fruitsName="cherry";
		fru4.price=67;
		fru4.isHybried=true;
		
		Fruits fru5=new Fruits();
		fru5.fruitsName="papaya";
		fru5.price=78;
		fru5.isHybried=true;
		
		Fruits []arr= {fru,fru1,fru2,fru3,fru4,fru5};
		
//		for(int i=0;i<=arr.length/2;i++) {
//			System.out.println("Fruit Name = "+arr[i].fruitsName+" Fruit Price = "+arr[i].price);
//		}
		
//		for(int i=arr.length/2;i>=0;i--) {
//			System.out.println("Fruits Name = "+arr[i].fruitsName+" Fruits Price = "+arr[i].price);
//		}
		
		 
	//Enhanced for loop
		
//		for(Fruits var:arr) {
//			System.out.println("Fruits Name = "+var.fruitsName+" Fruits Price = "+var.price+" Hybried = "+var.isHybried);
//		}
		
//		for(int i=arr.length/2;i<=arr.length-1;i++) {
//			System.out.println("Fruits Name = "+arr[i].fruitsName+" Price = "+arr[i].price);
//		}
		
		for(int i=arr.length-1;i>=arr.length/2;i--) {
			System.out.println("\nFruits Name = "+arr[i].fruitsName+"\nPrice = "+arr[i].price);
		}
	}

}
