package string12;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class StrReverse {
	public static void main(String[] args) {
		
		int []var= {12,43,54,3,3};
		
		
		for (int i : var) {
		int a=i;
		System.out.println(a);
		}
		
	
	String name="suresh";
	
	ArrayList<String> revNa=new ArrayList<>(Arrays.asList(name));
	
	String revName=revNa.stream().map(string-> new StringBuffer(string).reverse()).collect(Collectors.joining());
	System.out.println(revName);
	}				
}
