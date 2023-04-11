package interview;

import java.util.Arrays;
import java.util.Collections;

public class sortStr {
	public static void main(String[] arg) {
		String name = "abcfed";

		char[] a = name.toCharArray();
		Arrays.sort(a);
		System.out.println(a);

		int[] num = { 1, 4, 2, 3, 6, 8, 7 };

		Arrays.sort(num);
		System.out.println(Arrays.toString(num));

	}

}
