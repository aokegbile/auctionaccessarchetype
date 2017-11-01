#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.entity;


import javax.persistence.*;

@Entity
public class AADatabaseObject {
	private Integer id;
	private String column;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	public Integer getId() {
		return id;
	}

	public void setId(final Integer id) {
		this.id = id;
	}

	@Column(name = "column")
	public String getColumn() {
		return column;
	}

	public void setColumn(final String column) {
		this.column = column;
	}
}
