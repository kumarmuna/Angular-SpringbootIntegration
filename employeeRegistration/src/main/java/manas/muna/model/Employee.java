package manas.muna.model;

import java.io.Serializable;
import java.util.List;

public class Employee implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -8809089768201955649L;
	Long id;
	String name;
	String address;
	//List<Address> address;
	
	public Employee() {}
	public Employee(Long id, String name, String address) {
		 this.id = id;
		 this.name = name;
		 this.address = address;
	}
	public Employee(Long id, String name) {
		 this.id = id;
		 this.name = name;
		 this.address = null;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	
}
