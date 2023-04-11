package for5_Class;

public class UseLaptop {
	public static void main(String[] args) {
		Laptop laptop=new Laptop();
		laptop.brand="lenovo";
		laptop.price=23000;
		laptop.model="B490";
		laptop.isTouchScreen=false;
		
		Laptop laptop1=new Laptop();
		laptop1.brand="dell";
		laptop1.price=60000;
		laptop1.model="latitude5312";
		laptop1.isTouchScreen=true;
		
		Laptop laptop2=new Laptop();
		laptop2.brand="hp";
		laptop2.price=40000;
		laptop2.model="hp21";
		laptop2.isTouchScreen=false;
		
		Laptop laptop3=new Laptop();
		laptop3.brand="mac";
		laptop3.price=150000;
		laptop3.model="m1 pro";
		laptop3.isTouchScreen=true;
		
		
		Laptop []laptops= {laptop,laptop1,laptop2,laptop3};
		for(int i=0;i<laptops.length;i++) {
			if(laptops[i].isTouchScreen==true) {
				System.out.println("Brand :"+laptops[i].brand.toUpperCase()+"\nPrice :"+laptops[i].price+"\nModel :"+laptops[i].model.toUpperCase()+"\nTouchScreen :"+laptops[i].isTouchScreen+"\n");
			}
			
		}
		
		}

}
