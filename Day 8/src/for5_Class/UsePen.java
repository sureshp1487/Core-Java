package for5_Class;

public class UsePen {
	public static void main(String[] args) {
		Pen pen=new Pen();
		pen.brand="cello";
		pen.price=10;
		pen.color="blue";
		pen.isRefillable=false;
		
		Pen pen1=new Pen();
		pen1.brand="hero";
		pen1.price=50;
		pen1.color="blue";
		pen1.isRefillable=true;
		
		Pen pen2=new Pen();
		pen2.brand="rollex";
		pen2.price=15;
		pen2.color="black";
		pen2.isRefillable=false;
		
		Pen [] pens= {pen,pen1,pen2};
		//Pen penDetails=new Pen();
		
		
		for(int i=0;i<pens.length;i++) {
			if(pens[i].color.equalsIgnoreCase("blue")&&pens[i].isRefillable==true) {//&&pens[i].price>penDetails.price
				//penDetails=pens[i];
				
				System.out.println("brand :"+pens[i].brand+"\nPrice :"+pens[i].price+"\nColor : "+pens[i].color);
			}
			
		}
		
		
		
		
		
	}

}
