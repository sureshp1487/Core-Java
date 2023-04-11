package javai_8;
@FuncationalInterface
public interface PrintStr {
	
	@FunctionalInterface  
	interface sayable{  
	    void say(String msg);   // abstract method  
	    // It can contain any number of Object class methods.  
	    int hashCode();  
	    String toString();  
	    boolean equals(Object obj);  
	}  
	public class FunctionalInterfaceExample2 implements PrintStr{  
	    public void say(String msg){  
	        System.out.println(msg);  
	    }  
	    public static void main(String[] args) {  
	        FunctionalInterfaceExample2 fie = new FunctionalInterfaceExample2();  
	        fie.say("Hello there");  
	    }  
	}  

	
}



