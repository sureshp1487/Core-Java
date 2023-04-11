package interview;

import java.util.ArrayList;
import java.util.Arrays;

public class AddTwoNum {
	public static void main(String[] args) {
		ArrayList<Integer>var=new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7));
		
		for(int i=0;i<var.size();i++) {
			for(int j=i+1;j<var.size();j++) {
				if(var.get(i)+var.get(j)==5) {
				System.out.println(var.get(i)+"---"+var.get(j));
				
				}
			}
		}
		
		int result=var.stream().mapToInt(Integer::intValue).sum();
		System.out.println(result	);
	}

}
