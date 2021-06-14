package advertisementAgency;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


class AdvertisementTest {

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
	void CaseExecution1() {
		System.out.println("======TEST 1 EXECUTED=======");
		Advertised test = new Advertised();
		//double result = test.nextInt(1);
		//assertEquals(1, result); 
	}
	@Test
	void CaseExecution2() {
		System.out.println("======TEST 2 EXECUTED=======");
		Advertised test = new Advertised();
		//double result = test.nextInt(1);
		//assertEquals(1, result); 
	}
	@Test
	void CaseExecution3() {
		System.out.println("======TEST 3 EXECUTED=======");
		Advertised test = new Advertised();
		//double result = test.nextInt(1);
		//assertEquals(1, result); 
	}
	@Test
	void CaseExecution4() {
		System.out.println("======TEST 4 EXECUTED=======");
		Advertised test = new Advertised();
		//double result = test.nextInt(1);
		//assertEquals(1, result); 
	}

}
