package TestingMethod;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Assert;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


class MaxTest {
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
	void maxTest1() {
		System.out.println("======TEST 1 EXECUTED=======");
		AllMethods test = new AllMethods();
			double result = test.max(0, 0);			
			Assert.assertEquals(Double.doubleToLongBits(0), Double.doubleToLongBits(result));
    
	}
	@Test
	void maxTest2() {
		System.out.println("======TEST 2 EXECUTED=======");
		AllMethods test = new AllMethods();
			double result = test.max(6.6, 4.98);			
			Assert.assertEquals(Double.doubleToLongBits(6.6), Double.doubleToLongBits(result));
    
	}
	@Test
	void maxTest3() {
		System.out.println("======TEST 3 EXECUTED=======");
		AllMethods test = new AllMethods();
			double result = test.max(4.98, 6.6);			
			Assert.assertEquals(Double.doubleToLongBits(6.6), Double.doubleToLongBits(result));
    
	}
	@Test
	void maxTest4() {
		System.out.println("======TEST 4 EXECUTED=======");
		AllMethods test = new AllMethods();
			double result = test.max(4.98, 4.98);			
			Assert.assertEquals(Double.doubleToLongBits(4.98), Double.doubleToLongBits(result));
    
	}

}

