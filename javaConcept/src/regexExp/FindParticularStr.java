package regexExp;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FindParticularStr {
	public static void main(String[] args) {
		
		
		String name="test whether the regular expression matches the pattern";
		String[] names=name.split(" ");
		
		Collections.reverse(Arrays.asList(names));
		
		Pattern s=Pattern.compile("the");
		Matcher v=s.matcher(name);
		
	
//		for(String var:names) {
//			System.out.println(var);
//		}
		
		while(v.find()) {
			System.out.println(v.group());
		}
		
		
		
	}

}


