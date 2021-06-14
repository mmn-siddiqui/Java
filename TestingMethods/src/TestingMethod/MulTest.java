package TestingMethod;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


class MulTest {
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
	void testMultiply() {
		System.out.println("======TEST 4 EXECUTED=======");
		AllMethods test = new AllMethods();
		double result = test.mult(3,5);
		assertEquals(15, result); 
	}
	@Test
	void testMultiply1() {
		System.out.println("======TEST 1 EXECUTED=======");
		AllMethods test = new AllMethods();
		double result = test.mult(5,5);
		assertEquals(25, result); 
	}
	
	@Test
	void testMultiply2() {
		System.out.println("======TEST 2 EXECUTED=======");
		AllMethods test = new AllMethods();
		double result = test.mult(3,4);
		assertEquals(12, result); 
	}
	@Test
	void testMultiply3() {
		System.out.println("======TEST 3 EXECUTED=======");
		AllMethods test = new AllMethods();
		double result = test.mult(5,4);
		assertEquals(20, result); 
	}


}



	