package lms;

public class LmsStdInfor {
	public static void main(String[] args) {
		
		String[] infor=args[0].split(",");
		int rollNo=Integer.parseInt(infor[0]);
		String name=infor[1];
		String section=infor[2];
		long mobileNo=Long.parseLong(infor[3]);
		int age=Integer.parseInt(infor[4]);
		
		
		System.out.println("Roll No :"+rollNo+" Name : "+name+" Section : "+section+" Age :"+age+" Mobile No :"+mobileNo);
		
		
	}

}
