package for5_Class;

public class UseBag {
	public static void main(String[] args) {
		Bag bag=new Bag();
		bag.brand="vip bag";
		bag.price=500;
		bag.bagType="school bag";
		bag.isWaterProof=false;
		
		Bag bag1=new Bag();
		bag1.brand="American";
		bag1.price=1200;
		bag1.bagType="tourbag";
		bag1.isWaterProof=true;
		
		Bag bag2=new Bag();
		bag2.brand="dell bag";
		bag2.price=800;
		bag2.bagType="tourbag";
		bag2.isWaterProof=false;
		
		Bag []bags= {bag,bag1,bag2};
		for(int i=0;i<bags.length;i++) {
			if(bags[i].bagType.equalsIgnoreCase("tourbag")) {
				System.out.println("brand :"+bags[i].brand+"\nPrice :"+bags[i].price+"\nBag Type :"+bags[i].bagType+"\nWaterProof"+bags[i].isWaterProof+"\n");
			}
		}
		
				
	}

}
class Bag{
	String brand;
	int price;
	String bagType;
	boolean isWaterProof;
	
}
