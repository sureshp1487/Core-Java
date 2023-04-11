package regexExp;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MetacharactersReg {
	public static void main(String[] args) {
		String name="suresh";
//		Metacharacter ..............................................
		
		 System.out.println(Pattern.matches("s..e", "sure")); //false
		 System.out.println(Pattern.matches("cat|dog","cat"));
		 
		 System.out.println(Pattern.matches("[CM]at|[CM]ad", ""));
		 
		 boolean isTrue=Pattern.compile(".s").matcher("as").matches();
		 System.out.println("using pattern compile :"+isTrue);
		 
		 
		 Pattern pattern=Pattern.compile("[s]uresh");
	
		Matcher mat=pattern.matcher(name);
		if(mat.matches()) {
			System.out.println("match");
		}else {
			System.out.println("does not match");
		}
		
		
		
		
//		System.out.println(Pattern.matches("\\d","z" ));//it accept for number range :0-9
//		System.out.println(Pattern.matches("\\D","z" ));// it accept for alphabet
//		
//		/* w represents word character which accepts alphabets (Capital & small) and digits [0-9].
//		 So when we compare “w” with an alphabet or number returns true. Else false.*/
//        System.out.println(Pattern.matches("\\w", "2")); //false
//        System.out.println(Pattern.matches("\\w", "a")); //true
//        System.out.println(Pattern.matches("\\w", "$")); //true
//        
//        /*W represents a non-word character that accepts anything except alphabets and digits. 
//         * So when we compare “W” with an alphabet or number returns false. Else true.*/
//        System.out.println(Pattern.matches("\\W", "2")); //false
//        System.out.println(Pattern.matches("\\W", " ")); //true
//        System.out.println(Pattern.matches("\\W", "$")); //true
		
		//true is allowed for space not allowed character,number special character
		System.out.println(Pattern.matches("\\s", " ")); 
		
		//true it allowed for character and number it not allowed for space
		System.out.println(Pattern.matches("\\S", "$"));
	}
}
