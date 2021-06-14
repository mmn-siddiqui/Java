package TestingMethod;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class EqualTest {
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		  System.out.println("@BeforeAll executed");
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		 System.out.println("@AfterAll executed");
	}

	@BeforeEach
	void setUp() throws Exception {
		 System.out.println("@BeforeEach executed");
	}

	@AfterEach
	void tearDown() throws Exception {
		System.out.println("@AfterEach executed");
	}

	@Test
	void testNotEqual() {
		System.out.println("======TEST 1 EXECUTED=======");
		AllMethods test = new AllMethods();
		int result = test.areArrayEquals(new int []{1, 5, 3}, new int []{8, 2, 3});
		assertEquals(-1, result); 
	}
	
	@Test
	void testEqual() {
		System.out.println("======TEST 2 EXECUTED=======");
		AllMethods test = new AllMethods();
		int result = test.areArrayEquals(new int []{1, 2, 3}, new int []{1, 2, 3});
		assertEquals(0, result); 
		
	}
	@Test
	void testEqual2() {
		System.out.println("======TEST 3 EXECUTED=======");
		AllMethods test = new AllMethods();
		int result = test.areArrayEquals(new int []{9, 12, 13, 88}, new int []{9, 12, 13, 88});
		assertEquals(0, result); 
		
	}
	
	@Test
	void testNotEqual2() {
		System.out.println("======TEST 4 EXECUTED=======");
		AllMethods test = new AllMethods();
		int result = test.areArrayEquals(new int []{8, 10, 12, 3}, new int []{8, 2, 3});
		assertEquals(-1, result); 
	}
	
	

}
