package regexExp;

public class StrSplitUsingRegex {
	public static void main(String[] args) {
		String name="suresh kumar mani kandan";
		for(String w:name.split("\\B", 0)) {
		  System.out.println(w);
		}
	}
}
