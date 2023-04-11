package collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class FailFast_iterator {
	public static void main(String[] args) {
		Map<Integer, String> details=new HashMap<Integer,String>();
		
		details.put(1, "suresh");
		details.put(2, "mani");
		details.put(3, "raj");
		
		
		Iterator itr=details.keySet().iterator();
		
		while(itr.hasNext()) {
			System.out.println(details.get(itr.next()));
			details.put(4, "pravin");
		}
		
	}

}
