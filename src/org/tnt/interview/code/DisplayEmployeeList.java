package org.tnt.interview.code;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DisplayEmployeeList 
{
	public static void main(String[] args) 
	{
		
		List<String> names = Arrays.asList("Snehal","Vijay","Pooja");
		
		List<Employee> emp = getNames(names);
		
		System.out.println(emp);

	}

	public static List<Employee> getNames(List<String> names) 
	{

		List<Employee> employees = new ArrayList<>();

		int id = 0;
		for (String name : names) 
		{

			Employee employee = new Employee(++id, name);
			
			employees.add(employee);

		}
		return employees;
	}
}