package interview;

import java.util.Arrays;

public class FindSecondLargestNum {
	public static void main(String[] args) {
		int num[] = { 23, 44, 12, 87, 32, 98, 88 };
		
		Arrays.sort(num);
		
		System.out.println(num[num.length - 2]);
	}
}
