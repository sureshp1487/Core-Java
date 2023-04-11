package for5_Class;

public class UseAc {
	public static void main(String[] args) {
		Ac ac=new Ac();
		ac.brand="samsung";
		ac.price=28000;
		ac.color="white";
		ac.isFiveStar=true;
		
		Ac ac1=new Ac();
		ac1.brand="sony";
		ac1.price=15000;
		ac1.color="black";
		ac1.isFiveStar=false;
		
		Ac ac2=new Ac();
		ac2.brand="g brand";
		ac2.price=10000;
		ac2.color="brown";
		ac2.isFiveStar=false;
		
		Ac []arr= {ac,ac1,ac2};
		for(int i=0;i<arr.length;i++) {
			if(arr[i].isFiveStar==true) {
			System.out.println("BRAND="+arr[i].brand+", NET PRICE="+(arr[i].price+(arr[i].price*4/100)));
			}
		}
		
	}

}
class Ac {
	String brand;
	int price;
	String color;
	boolean isFiveStar;
	int netPrice;
}
