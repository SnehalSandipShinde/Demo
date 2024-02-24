package org.tnt.java_code;
//Tenerity
import java.util.ArrayList;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		List<String> name = new ArrayList<>();
		name.add("xyz");
		name.add("abc");
		System.out.println(employeeObj(name));

	}

	public static List<Employee> employeeObj(List<String> empName) {
		List<Employee> listEmp = new ArrayList<>();

		for (String empObj : empName) {
			Employee emp = new Employee();
			emp.setName(empObj);
			emp.setId(emp.getId() + 1);
			listEmp.add(emp);
		}

		return listEmp;
	}

}
