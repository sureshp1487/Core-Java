package for5_Class;

public class UsePencil {
	public static void main(String[] args) {
		Pencil pencil=new Pencil();
		
		pencil.brand="cello";
		pencil.price=10;
		pencil.shade="h1";
		pencil.isColor=true;
		
		
		Pencil pencil1=new Pencil();
		pencil1.brand="hero";
		pencil1.price=15;
		pencil1.shade="h3";
		pencil1.isColor=false;
		
		Pencil pencil2=new Pencil();
		pencil2.brand="rollex";
		pencil2.price=14;
		pencil2.shade="hp2";
		pencil2.isColor=false;
		
		
		
		Pencil[] arr= {pencil,pencil1,pencil2};
		
		for(int i=0;i<arr.length;i++) {
			if((arr[i].price%2==0) && (arr[i].isColor==true)) {	
			System.out.println(arr[i].brand.toUpperCase());	
			}
		}	
		
	}

}
class Pencil {
	String brand ;
	int price;
	String shade;
	boolean isColor;
}
