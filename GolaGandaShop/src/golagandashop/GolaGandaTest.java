package golagandashop;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


class GolaGandaTest {

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
	void testGolaGanda() {
		System.out.println("======TEST 1 EXECUTED=======");
		MainClass test = new MainClass();
		double result = test.priceSmallComelle(50, 10);
		assertEquals(60, result); 
	}
	
	@Test
	void testGolaGanda1() {
		System.out.println("======TEST 2 EXECUTED=======");
		MainClass test = new MainClass();
		double result = test.priceSmallNutella(50, 20);
		assertEquals(70, result); 
	}
	
	@Test
	void testGolaGanda2() {
		System.out.println("======TEST 3 EXECUTED=======");
		MainClass test = new MainClass();
		double result = test.priceMediumComelle(80, 10);
		assertEquals(90, result); 
	}
	
	@Test
	void testGolaGanda3() {
		System.out.println("======TEST 4 EXECUTED=======");
		MainClass test = new MainClass();
		double result = test.priceMediumNutella(80, 20);
		assertEquals(100, result); 
	}
	
	@Test
	void testGolaGanda4() {
		System.out.println("======TEST 5 EXECUTED=======");
		MainClass test = new MainClass();
		double result = test.priceLargeComelle(100, 10);
		assertEquals(110, result); 
	}
	
	@Test
	void testGolaGanda5() {
		System.out.println("======TEST 6 EXECUTED=======");
		MainClass test = new MainClass();
		double result = test.priceLargeNutella(100, 20);
		assertEquals(120, result); 
	}

}
