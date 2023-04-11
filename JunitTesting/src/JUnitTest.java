import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertAll;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class JUnitTest {
	@BeforeClass
	public static void beforeClass() {
		System.out.println("before class");
	}
	@AfterClass
	public static void afterclass() {
		System.out.println("end page");
	}
		
	@Test
	public void strCompare() {
		String name="suresh";
		String name1="suresh";
		assertEquals(name, name1);
		System.out.println("Same");
	}

}
