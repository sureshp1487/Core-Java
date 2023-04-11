package collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class FailSafe_Iterator {
	public static void main(String[] args) {
	Map<Integer, String> details1=new HashMap<Integer,String>();
		
		details1.put(1, "suresh");
		details1.put(2, "mani");
		details1.put(3, "raj");
		
		
		ConcurrentHashMap<Integer, String> copyDet=new ConcurrentHashMap<Integer,String>(details1);
		
		Iterator itr=copyDet.keySet().iterator();
		
		while(itr.hasNext()) {
			
			System.out.println(copyDet.get(itr.next()));
			copyDet.put(4, "priya");
		}
	}

}
