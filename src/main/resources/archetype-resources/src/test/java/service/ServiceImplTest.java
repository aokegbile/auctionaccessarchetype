#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.service;

import ${package}.dao.AADao;
import ${package}.dao.AADaoImpl;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ServiceImplTest {
	/*
		This test is a template for writing tests. You will have to update this as you code.
		Or you will update your code as you write your tests ;)
	 */

	private Service service;

	@Before
	public void setUp() {
		// SetUp() method is to create your mock objects
		service = new ServiceImpl();
	}

	@Test
	public void testFindStringById() {
		String result = service.doAction();
		assertEquals("Auction Access", result);
	}

}
