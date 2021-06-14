package TestingMethod;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


class existsInArray {


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
	void existTest() {  
		System.out.println("======TEST 1 EXECUTED=======");
		AllMethods test = new AllMethods();
		int result = test.existsInArray(new int []{1, 2, 3},3);
		assertEquals(2, result); 
		
	}
	
	@Test	
	void notExistTest() {  
		System.out.println("======TEST 2 EXECUTED=======");
		AllMethods test = new AllMethods();
		int result = test.existsInArray(new int []{1, 4, 3},2);
		assertEquals(-1, result); 
		
	}
		
	@Test	
	void notExistTest2() {  
		System.out.println("======TEST 3 EXECUTED=======");
		AllMethods test = new AllMethods();
		int result = test.existsInArray(new int []{11, 13, 14 , 15},12);
		assertEquals(-1, result); 
		
	}
	
	@Test
	void existTest2() {  
		System.out.println("======TEST 4 EXECUTED=======");
		AllMethods test = new AllMethods();
		int result = test.existsInArray(new int []{10, 11, 12, 13},12);
		assertEquals(2, result); 
		
	}

}
