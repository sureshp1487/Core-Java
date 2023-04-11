package regexExp;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class QuantifierEx {
	public static void main(String[] args) {
		        // Making an instance of Pattern class
		        // By default quantifier "+" is Greedy
		        Pattern p = Pattern.compile("bad+");
		  int count=0;
		  
		        // Making an instance of Matcher class
		        Matcher m = p.matcher("badaabadrrbadyybad");
		        System.out.println(m.matches());
		  
		        while (m.find())
		            System.out.println(" Pattern found from " + m.start() +
		                               " to " + m.end()+" "+count++);
		        
	}

}
