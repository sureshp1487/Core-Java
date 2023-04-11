package javai_8;

public class SingleTen {

	private static SingleTen singleInst = new SingleTen();
	// private static final SingleTen singleInst1=new SingleTen();
	private String msg;
	private int age;
//     it will create constructor using private access modification
	private SingleTen() {
	}
//        create static method
	public static SingleTen getInstance() {
		return singleInst;
	}
//	public static SingleTen getInstance1() {
//		return singleInst1;
//		
//	}
	public String getMessage() {

		return msg;
	}
	public int getAge() {
		return age;
	}
	public void setMessage(String msg) {
		this.msg = msg;
	}
	public void setAge(int age) {
		this.age = age;
	}
}
