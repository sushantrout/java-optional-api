package com.tech;

import java.util.ArrayList;
import java.util.List;

public class EmployeeProvider {
	public static List<Employee> getEmployees() {
		List<Employee> employeeList = new ArrayList<>();

		String saleMarketing = "Sales And Marketing";
		String hrDepartment = "HR";
		String productDevelopement = "Product Development";
		String securityAndTransport = "Security And Transport";
		String accountANdFinance = "Account And Finance";
		String infrastructure = "Infrastructure";
		
		String female = "Female";
		String male = "Male";

		Employee sushant = new Employee(1, "Sushant Rout", 32, male, saleMarketing, 2011, 25000.0);
		Employee sanjay = new Employee(2, "Sanjay Swain", 28, male, productDevelopement, 2014, 32500.0);
		employeeList.add(sushant);
		employeeList.add(sanjay);
		employeeList.add(new Employee(3, "Asish Mohapatr", 32, male, saleMarketing, 2011, 25000.0));
		employeeList.add(new Employee(4, "Avi Baral", 32, male, productDevelopement, 2011, 25000.0));
		employeeList.add(new Employee(5, "Ranes Sahoo", 32, male,productDevelopement, 2011, 25000.0));
		employeeList.add(new Employee(6, "Hemendra Sethi", 32, saleMarketing, hrDepartment, 2011, 25000.0));
		employeeList.add(new Employee(7, "Avay Jena", 32, male, hrDepartment, 2011, 25000.0));
		employeeList.add(new Employee(8, "Arun Das", 32, male, hrDepartment, 2011, 25000.0));
		employeeList.add(new Employee(111, "Jiya Brein", 32, female, hrDepartment, 2011, 25000.0));
		employeeList.add(new Employee(122, "Paul Niksui", 25, male, saleMarketing, 2015, 13500.0));
		employeeList.add(new Employee(133, "Martin Theron", 29, male, infrastructure, 2012, 18000.0));
		employeeList.add(new Employee(144, "Murali Gowda", 28, male, productDevelopement, 2014, 32500.0));
		employeeList.add(new Employee(155, "Nima Roy", 27, female, hrDepartment, 2013, 22700.0));
		employeeList.add(new Employee(166, "Iqbal Hussain", 43, male, securityAndTransport, 2016, 10500.0));
		employeeList.add(new Employee(177, "Manu Sharma", 35, male, accountANdFinance, 2010, 27000.0));
		employeeList.add(new Employee(188, "Wang Liu", 31, male, productDevelopement, 2015, 34500.0));
		employeeList.add(new Employee(199, "Amelia Zoe", 24, female, saleMarketing, 2016, 11500.0));
		employeeList.add(new Employee(200, "Jaden Dough", 38, male, securityAndTransport, 2015, 11000.5));
		employeeList.add(new Employee(211, "Jasna Kaur", 27, female, infrastructure, 2014, 15700.0));
		employeeList.add(new Employee(222, "Nitin Joshi", 25, male, productDevelopement, 2016, 28200.0));
		employeeList.add(new Employee(233, "Jyothi Reddy", 27, female, accountANdFinance, 2013, 21300.0));
		employeeList.add(new Employee(244, "Nicolus Den", 24, male, saleMarketing, 2017, 10700.5));
		employeeList.add(new Employee(255, "Ali Baig", 23, male, infrastructure, 2018, 12700.0));
		employeeList.add(new Employee(266, "Sanvi Pandey", 26, female, productDevelopement, 2015, 28900.0));
		employeeList.add(new Employee(277, "Anuj Chettiar", 31, male, productDevelopement, 2012, 35700.0));
		employeeList.add(sushant);
		employeeList.add(sanjay);
		
		return employeeList;
	}
}
