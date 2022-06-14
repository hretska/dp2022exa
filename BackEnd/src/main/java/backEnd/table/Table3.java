package backEnd.table;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table; 

@Entity
@Table(name = "table3")
public class Table3 implements Serializable{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int id;
	private String title4;
	private int high;
	

	
	
	public Table3() {
		super();
	}

	public Table3(int id, String title4, int high) {
		super();
		this.id = id;
		this.title4 = title4;
		this.high = high;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle4() {
		return title4;
	}

	public void setTitle4(String title4) {
		this.title4 = title4;
	}

	

	public int getHigh() {
		return high;
	}

	public void setHigh(int high) {
		this.high = high;
	}

	@Override
	public String toString() {
		return "{\"id\": " + id + ", \"title4\": \""+title4+"\", \"high\": " + high + "}";
	}
}