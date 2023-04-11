package oops2;

public class Pen extends StationaryProduct {
		private boolean isWood;
		
		public void setIsWood(boolean isWood) {
			this.isWood=isWood;
		}
		public boolean getIsWood() {
			return isWood;
		}
		public Pen(String brand,int price,String color,boolean isWood) {
			super(brand,price,color);
			this.isWood=isWood;
		}
		public String toString(){
			return "brand: "+getBrand()+"\nPrice: "+getPrice()+"\nColor: "+getColor()+"\nIsWood"+getIsWood();
		}
		 
	}
	


