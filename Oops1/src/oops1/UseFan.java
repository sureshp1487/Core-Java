package oops1;

public class UseFan {
	public static void main(String[] args) {
		Coil coil=new Coil("usha coil",800,true);
		Fan fan=new Fan("usha fan",3000,coil);
		System.out.println(fan);
		
	}

}
