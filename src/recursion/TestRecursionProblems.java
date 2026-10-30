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
	
	@Test
	void test4() {
		assertEquals(RecursionProblems.countHi(""), 0);
	}
	
	@Test
	void test5() {
		assertEquals(RecursionProblems.countHi("xhi"), 1);
	}
	
	@Test
	void test6() {
		assertEquals(RecursionProblems.countHi("sghihisdf"), 2);
	}
	
	@Test
	void test7() {
		assertEquals(RecursionProblems.countHi2("sghixhisdf"), 1);
	}
	
	@Test
	void test8() {
		assertEquals(RecursionProblems.countHi2("xhi"), 0);
	}
	
	@Test
	void test9() {
		assertEquals(RecursionProblems.countHi2("hixhihi"), 2);
	}
	
	@Test
	void test10() {
		assertEquals(RecursionProblems.strCount("catcowcat", "cat"), 2);
	}
	
	@Test
	void test11() {
		assertEquals(RecursionProblems.strCount("catcowcat", "cow"), 1);
	}
	
	@Test
	void test12() {
		assertEquals(RecursionProblems.strCount("", "cat"), 0);
	}
	
	@Test
	void test13() {
		assertEquals(RecursionProblems.stringClean(" "), " ");
	}
	
	@Test
	void test14() {
		assertEquals(RecursionProblems.stringClean("sssss"), "s");
	}
	
	@Test
	void test16() {
		assertEquals(RecursionProblems.stringClean("zzyyxx"), "zyx");
	}

} // End class
