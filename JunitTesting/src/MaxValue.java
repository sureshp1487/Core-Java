import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class MaxValue{
	
	@Before

	@Test
	public void test() {
		
		assertEquals(9,Calculation.findMax(new int[] {1,3,4,5,9,10}));
		
		
	}


}