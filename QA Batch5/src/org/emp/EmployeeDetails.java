package org.emp;

public class EmployeeDetails 
{
	  int emp_id;  
	  public int getEmp_id() {  
	    return emp_id;  
	}  
	private String name;
	private long phoneno; 
	private String address;
	private int empdob;
	private String email;  
	public void setEmp_id(int emp_id) {  
	    this.emp_id = emp_id;  
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
	public void setAddress(String address)
	 {  
	    this.address = address;  
	}  
	public long getPhoneno() {  
	    return phoneno;  
	}
	public void setphoneno(long phoneno) 
	{  
	    this.phoneno = phoneno;  
	}  
	
	public String getEmail() {  
	    return email;  
	}  
	public void setEmail(String email) {  
	    this.email = email;  
	}  
	  public String toString() {  
	    return "Employee [emp_id = " + emp_id + ",  name = " + name + ", address = " + address  
	            + ", phoneno = " + phoneno + ", email = " + email + "]";  
	    
	    }  
	 
	    public static void main(String args[])
	    {  
	        EmployeeDetails emp = new EmployeeDetails();  
	        emp.setEmp_id(101);  
	        emp.setName("Emma ");  
	        emp.setAddress(" Delhi");  
	        emp.setEmail("Emma123@gmail.com");
	    	System.out.println(emp);
	       }         
	 }  

