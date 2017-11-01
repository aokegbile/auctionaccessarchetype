#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.dto;

import org.junit.Test;
import org.meanbean.test.BeanTester;

public class PlainOldJavaObjectTest {

	/*
		POJOs/DTOs/Entities are able to test getter/setter methods using MeanBean dependency
		The test below should run and test getter/setter with one simple line
	 */

	@Test
	public void testApplicationPermission() {
		new BeanTester().testBean(PlainOldJavaObjectTest.class);
	}
}
