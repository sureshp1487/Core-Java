import java.util.function.Function;

public class UseFunInterface {
	public static void main(String[] args) {
		  Function<Integer, Double> half = a-> a / 2.0;
		  
	        // Applying the function to get the result
	       try { 
	    	   half=half.compose(a->a*3);
		  half=half.andThen(null);
	      	
	       }
	       catch(Exception e) {
	    	   System.out.println("Exception thrown "
                               + "while passing null: "
                               + e);
	       }
	        System.out.println(half.apply(20));
	}

}
