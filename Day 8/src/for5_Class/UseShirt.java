
/*find the max price then give 10 
 * tax and print object datas in UpperCase. 
 * */
package for5_Class;

public class UseShirt {
	public static void main(String[] args) {
		Shirt shirt=new Shirt();
		shirt.brand="trands";
		shirt.price=500;
		shirt.isChecked=true;
		
		Shirt shirt1=new Shirt();
		shirt1.brand="offo";
		shirt1.price=550;
		shirt1.isChecked=false;
		
		Shirt shirt2=new Shirt();
		shirt2.brand="Adidas";
		shirt2.price=700;
		shirt2.isChecked=true;
		
		Shirt[] arr= {shirt,shirt1,shirt2};
		
		Shirt max=new Shirt();
		max.price=shirt1.price;
		for(Shirt var:arr) {
			if(var.price>max.price) {
			 max=var;
			 max.netPrice=var.price+(var.price*10/100);
			}
		}
		System.out.println("BRAND="+max.brand.toUpperCase()+",\nPrice="+max.price+",\nChecked or not="+max.isChecked+",\nNetPrice="+max.netPrice);
		if(max.price%2==0) {
			System.out.println("Even");
		}else {
			System.out.println("Odd");
		}
	
	}
}
class Shirt{
	String brand;
	int price;
	boolean isChecked;
	int netPrice;
}
