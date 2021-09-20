package org.emp;

import org.client.Client;
import org.company.Company;
import org.project.Project;

public class EmployeeInfo{
	public void empName()
	{
		System.out.println("Vaishnavi");
	}
	public static void main (String[] args)
	{
		EmployeeInfo emp = new EmployeeInfo();
		emp.empName();
		
		Company com = new Company();
		com.companyName();
		
		Client cli = new Client();
		cli.clientName();
		
		Project pro = new Project();
		pro.projectName();
		
		
	}
}