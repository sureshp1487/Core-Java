package lms;

public class LmsStudent {
	public static void main(String[] args) {
		String[]info=args[0].split("_p");
		
		int rollNo=Integer.parseInt(info[0]);
		String name=info[1].toUpperCase();
		String section=info[2];
		long mobileNo=Integer.parseInt(info[3]);
		int age=Integer.parseInt(info[4]);
		float weight=Float.parseFloat(info[5]);
		
		System.out.println("Roll No :"+rollNo+" Name :"+name+" Section :"+section+" Mobile No :"+mobileNo+" Age :"+age+" Weight :"+weight);
	}

}
