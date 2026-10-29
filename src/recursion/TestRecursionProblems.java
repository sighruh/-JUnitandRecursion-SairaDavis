package recursion;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class TestRecursionProblems {

	@Test
	void test1() {
		assertEquals(RecursionProblems.count8(8818), 4);
	}
	
	@Test
	void test2() {
		assertEquals(RecursionProblems.count8(88188), 6);
	}
	
	@Test
	void test3() {
		assertEquals(RecursionProblems.count8(0), 0);
		
	}

} // End class
