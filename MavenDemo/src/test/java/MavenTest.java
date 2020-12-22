import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MavenTest {

		@Test
		public void testADD() {
			Calculator c = new Calculator();
			int actual_result = c.add(10, 30);
			int expected_result = 40;
			assertEquals(expected_result, actual_result);
		}
		
		@Test
		public void testSUB() {
			Calculator c = new Calculator();
			int actual_result = c.sub(10, 30);
			int expected_result = -20;
			assertEquals(expected_result, actual_result);
		}
}
