package for3_Class;

public class UseMarker {
	public static void main(String[] args) {
		Marker m1=new Marker();
		
		m1.brand="cello";
		m1.price=30;
		m1.color="pink";
		m1.isrefillable=true;
		
		Marker m2=new Marker();
		m2.brand="hero";
		m2.price=35;
		m2.color="blue";
		m2.isrefillable=false;
		
		Marker m3=new Marker();
		m3.brand="bright";
		m3.price=55;
		m3.color="red";
		m3.isrefillable=true;
		
		Marker marker[]=new Marker[3];
		marker[0]=m1;
		marker[1]=m2;
		marker[2]=m3;
		
		/*for(int i=0;i<marker.length;i++) {
			System.out.println("Brand Name = "+marker[i].brand+" Price = "+marker[i].price+"  Available Color = "+marker[i].color);
		}*/
		
		for(int i=marker.length-1;i>=0;i--) {
			System.out.println("Brand Name = "+marker[i].brand+" Price = "+marker[i].price+" Available Color = "+marker[i].color);
		}
		
	}

}
