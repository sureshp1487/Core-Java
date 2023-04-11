package oopsCon;

public class PassByValue {
	int value=50;
	
	void change(int value) {
		value=value+100;
	}
	public static void main(String[] args) {
		PassByValue bv=new PassByValue();
		System.out.println("before change :"+bv.value);
		bv.change(200);
		
		System.out.println("after change b value :"+bv.value);
		
	}

}
