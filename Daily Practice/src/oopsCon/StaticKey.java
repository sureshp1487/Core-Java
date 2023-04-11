package oopsCon;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public class StaticKey {
	
//	int rollNo;
//	String name;
//	static String clg="qmc";
//	 StaticKey(int r,String n ){
//		rollNo=r;
//		name=n;
//	}
	
	
	
	public static void main(String[] args) {
		String name="automation engineer work on automation field auto automatic";
		
		Pattern v=Pattern.compile("auto");
		Matcher s=v.matcher(name);
		
		while(s.find()) {
			System.out.println(s.group());
		}
		
		
	}

}
