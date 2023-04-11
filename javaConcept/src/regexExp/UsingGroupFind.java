package regexExp;
import java.util.regex.Matcher;
	import java.util.regex.Pattern;

public class UsingGroupFind {
	
	   public static void main( String args[] ) {
	      // String to be scanned to find the pattern.
	      String line = "This order was placed for QT10001! Qt2! was";
	     
	      int count=0;

	      // Create a Pattern object
	      Pattern r = Pattern.compile("was");

	      // Now create matcher object.
	      Matcher m = r.matcher(line);
	      
	      while (m.find( )) {
	    	  count++;
	         System.out.println("Found value: " + m.group());
	         System.out.println(count);
	         //System.out.println("Found value: " + m.group(1) );
	         //System.out.println("Found value: " + m.group(3) );
	     
      }
	   
	   try {
		   int a=8;
		   int b=0;
		   System.exit(0);
		   int c=a/b;
		   System.exit(c);
		   System.out.println("Hello");
	   }
	   finally {
           
           System.out.println(
               "finally : i execute always.");
           
       }
	   }
	}


