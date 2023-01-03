package staffProject;

import java.sql.Date;

public class staff {
	
	private int StaffID;
	private String firstName;
	private String lastName;
	private Date dateOfBirth;
	private String department;
	private double salary;
	private Date startDate;
	private Boolean fullTime;
	
	
	
	
	
	
	
	
	public staff(int id, String fn, String ln, Date dob, String dp, double sal, Date sd, Boolean ft) {
		
		StaffID = id;
		firstName = fn;
		lastName = ln;
		dateOfBirth = dob;
		department = dp;
		salary = sal;
		startDate = sd;
		fullTime = ft;
		
	}
	
	public int getStaffID() {
		return StaffID;
	}

	public void setStaffID(int id) {
		StaffID = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String fn) {
		firstName = fn;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String ln) {
		lastName = ln;
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
	}
	
	

	public void setDateOfBirth(Date dob) {
		dateOfBirth = dob;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String dp) {
		department = dp;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double sal) {
		salary = sal;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date sd) {
		startDate = sd;
	}

	public Boolean getFullTime() {
		return fullTime;
	}
	
	public String isfulltime() {
		
		return(fullTime?"Yes":"No");
	}

	public void setFullTime(Boolean ft) {
		fullTime = ft;
	}

	@Override
	public String toString() {
		return "staff [StaffID=" + StaffID + ", firstName=" + firstName + ", lastName=" + lastName + ", dateOfBirth="
				+ dateOfBirth + ", department=" + department + ", salary=" + salary + ", startDate=" + startDate
				+ ", fullTime=" + fullTime + "]";
	
	

	
}
	}
