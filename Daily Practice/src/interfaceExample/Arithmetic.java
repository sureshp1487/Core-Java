package interfaceExample;

public interface Arithmetic {
	
	
	default void add(int num,int num1) {
		System.out.println(num+num1);
	}

}
