package collectionnn;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class PrintSet {
	public static void main(String[] args) {
//		HashSet<String> name = new HashSet<String>();
//		name.add("suresh");
//		name.add("pravin");
//		name.add("ravi");
//
//		for (String i : name) {
//			System.out.println(i);
//		}
			System.out.println();
			
		LinkedHashSet<String>name1=new LinkedHashSet<>();
		name1.add("suresh");
		name1.add("pravin");
		name1.add(null);
		
		for (String s : name1) {
			System.out.println(s);
		}
		TreeSet<Integer>rollNo=new TreeSet<>();
		rollNo.add(3);
		rollNo.add(8);
		rollNo.add(4);
		rollNo.add(2);
		rollNo.add(7);
		rollNo.add(9);
		for (int sno : rollNo) {
			System.out.println(sno);
		}
	}
}
