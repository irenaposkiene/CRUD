package form;



import java.util.ArrayList;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped


public class Student2 {
	private String subject1;
	
	public String[] subject2Lang;
	
	public String gender;

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	
	// list of countries for the drop-down list
	List<String> subject1Options;
	
	

	public Student2() {
		// populate the list of countries
		subject1Options = new ArrayList<>();
		
		subject1Options.add("Mathematics");
		subject1Options.add("Chemistry");
		subject1Options.add("Language");
				
	}

	// getter/setter methods

	// need to add a getter method for country options
	
	public List<String> getsubject1Options() {
		return subject1Options;
	}

	
	public String getsubject1() {
		return subject1;
	}

	public void setsubject1(String subject1) {
		this.subject1 = subject1;
	}
		
	public String [] getSubject2Lang() {
		return subject2Lang;
	}
	public void setSubject2Lang(String[] subject2Lang) {
		this.subject2Lang=subject2Lang;
	}

	
	
}


