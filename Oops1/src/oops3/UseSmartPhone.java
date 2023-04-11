package oops3;

public class UseSmartPhone {
	public static void main(String[] args) {
		SmartPhone sp=new SmartPhone();
		System.out.println(sp.battery("54000 Amh"));
		System.out.println(sp.cemera("32 mp"));
		System.out.println(sp.findNetPrice(15000, 500));
	}

}
