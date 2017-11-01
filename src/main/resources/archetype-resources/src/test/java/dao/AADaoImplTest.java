#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.dao;

import ${package}.controller.Controller;
import ${package}.controller.ControllerImpl;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AADaoImplTest {
	/*
		This test is a template for writing tests. You will have to update this as you code.
		Or you will update your code as you write your tests ;)
	 */

	private AADao aaDao;

	@Before
	public void setUp() {
		// SetUp() method is to create your mock objects
		aaDao = new AADaoImpl();
	}

	@Test
	public void testFindStringById() {
		String result = aaDao.findStringById(0);
		assertEquals("Auction Access", result);
	}

}
