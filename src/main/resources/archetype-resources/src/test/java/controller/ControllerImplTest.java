#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.controller;/**
 * Created by SMahr on 11/1/2017.
 */

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ControllerImplTest {

	/*
		This test is a template for writing tests. You will have to update this as you code.
		Or you will update your code as you write your tests ;)
	 */

	private Controller controller;

	@Before
	public void setUp() {
		// SetUp() method is to create your mock objects
		controller = new ControllerImpl();
	}

	@Test
	public void testDescriptonOfEndpoint() {
		String result = controller.descriptionOfEndpoint();
		assertEquals("Auction Access", result);
	}

}
