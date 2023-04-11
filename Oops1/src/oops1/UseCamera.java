package oops1;

public class UseCamera {
	public static void main(String [] args) {
		
		Lense ls=new Lense("sony lens",1000,"2mm",true);
		Camera cm=new Camera("sony",40000,true,ls);
		
	System.out.println(cm);
	}

}
