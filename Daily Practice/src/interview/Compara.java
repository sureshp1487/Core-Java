package interview;

public class Compara {
	public static void main(String []args) {
		String name="suresh";
		
		String secondName=new String(name);
		System.out.println("using .equals method :"+name.equals(secondName));//it will popup as true it is check the content
		System.out.println("using == operator"+name==secondName);//it will popup false it will check memory address
		
	}

}
