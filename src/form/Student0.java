package form;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class Student0 {

	private String name;
	private String phone;
	
	// create no-arg constructor
	public Student0() {
		
	}

	// define getter/setter methods	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	
}





