#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.dto;

public class PlainOldJavaObject {

	/*
		POJO/DTO package and classes are unnecessary if they are actually entities
	 */

	private int integer;
	private String string;
	private Object object;

	public int getInteger() {
		return integer;
	}

	public void setInteger(final int integer) {
		this.integer = integer;
	}

	public String getString() {
		return string;
	}

	public void setString(final String string) {
		this.string = string;
	}

	public Object getObject() {
		return object;
	}

	public void setObject(final Object object) {
		this.object = object;
	}
}
