/**
 * 
 */
package org.escoladeltreball.helloworld;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

/**
 * @author iaw26068632
 *
 */
public class MainTest {
	private static Main main;
	
	/**
	 * @throws java.lang.Exception
	 */
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println("in SetUpBeforeClass method");
		main = new Main();
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println("in tearDownAfterClass method");
		main = null;
	}

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		System.out.println("in setUp method");
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
		System.out.println("in tearDown method");
	}

	/**
	 * Test method for {@link org.escoladeltreball.helloworld.Main#findSmallest(int[])}.
	 */
	@Test
	public final void testFindSmallest() {
		assertEquals(1, main.findSmallest(new int[] { 1, 2, 3 }));
		assertEquals(0, main.findSmallest(new int[] { 4, 0, 1, 2, 3 }));
		assertEquals(-2, main.findSmallest(new int[] { 1, -2, 3 }));
		assertEquals(3, main.findSmallest(new int[] { 3 }));
		assertEquals(1, main.findSmallest(new int[] { 1, 1, 1}));

	}

	/**
	 * Test method for {@link org.escoladeltreball.helloworld.Main#sum(int[])}.
	 */
//    	@Ignore("el tractarem mes tard")
	@Test
	public final void testSum() {
		assertEquals(6, main.sum(new int[] { 1, 2, 3 }));
		assertEquals(2, main.sum(new int[] { 1, -2, 3 }));
		assertEquals(78, main.sum(new int[] { 8, 20, 50 }));
		assertEquals(0, main.sum(new int[] {}));
	}

	/**
	 * Test method for {@link org.escoladeltreball.helloworld.Main#frequency(int[], int)}.
	 */
//	@Ignore("el tractarem mes tard")
	@Test
	public final void testFrequency() {
		// fail("Not yet implemented"); // TODO
		assertEquals(2, main.frequency(new int[] { 1, 2, 3, 1 }, 1));
		assertEquals(0, main.frequency(new int[] { 2 , 2, 3 }, 1));
		assertEquals(1, main.frequency(new int[] { 1, 2, 3 }, 1));
		assertEquals(0, main.frequency(new int[] {}, 1));


	}

	/**
	 * Test method for {@link org.escoladeltreball.helloworld.Main#frequencyPercentage(int[], int)}.
	 */
	@Ignore("el tractarem mes tard")
	@Test
	public final void testFrequencyPercentage() {
//		fail("Not yet implemented"); // TODO
		assertEquals(0.33333, main.frequencyPercentage(new int[] { 9, 3, 8, 1, 2, 1 }, 1));
	}

}
