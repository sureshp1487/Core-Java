package collectionnn;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Arr {
	public static void main(String[] args) {
		ArrayList<Integer>value=new ArrayList<>(Arrays.asList(12,3,4,2,54,5,32,2));
		Collections.sort(value);
		System.out.println(value);
		
		
		Collections.sort(value,Collections.reverseOrder());
		System.out.println(value);
	}
	

	
}
