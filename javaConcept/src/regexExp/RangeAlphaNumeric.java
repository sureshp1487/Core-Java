package regexExp;
import java.util.regex.Pattern;

public class RangeAlphaNumeric {
public static void main(String[] args) {
	System.out.println(Pattern.matches("[a-z0-9]{9,15}", "suresh12312"));
		
	System.out.println(Pattern.matches("[789][0-9]{9}", "922043747"));
	System.out.println(Pattern.matches("[ad-z]?", "qe"));
	
}

}
