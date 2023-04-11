package oopsCon;

import java.util.StringJoiner;
import java.util.StringTokenizer;

public class StrJoiner {
	public static void main(String [] args) {
		
		
		StringJoiner var=new StringJoiner(",");
		var.add("suresh");
		var.add("suresh");
		var.add("suresh");
		System.out.println(var);
		
		StringTokenizer var1=new StringTokenizer("i will use my bike perhaps"," ");
		
		while (var1.hasMoreTokens()) {
		System.out.println(var1.nextToken());
		}
	}

}
