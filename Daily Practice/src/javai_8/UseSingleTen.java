package javai_8;

public class UseSingleTen {
	public static void main(String[] args) {
		SingleTen instance=SingleTen.getInstance();
		instance.setMessage("this is message set the main method");
		instance.setAge(35);
		displayMsg();
		
		
//		SingleTen instance1=SingleTen.getInstance1();
//		instance1.setMessage("second instance");
//		displayMsg();
	}
	
	public static void displayMsg() {
		SingleTen instance=SingleTen.getInstance();
	System.out.println(instance.getAge()+"Message :"+instance.getMessage());
		
		
		
//		SingleTen instance1=SingleTen.getInstance1();
//System.out.println(instance1.getMessage());
	}

}
