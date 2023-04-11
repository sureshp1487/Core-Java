package interview;

import java.util.StringJoiner;

public class Delimiter {
	public static void main(String[] args) {
		String name="suresh kumar";
		StringJoiner var=new StringJoiner(","+name+",");
		var.add("suresh");
		var.add("kumar");
		
		System.out.println(var);
	}


}
