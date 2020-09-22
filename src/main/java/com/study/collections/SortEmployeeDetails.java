package com.study.collections;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

import com.study.model.Employee;

public class SortEmployeeDetails {
	
	public static List<Employee> getEmployeeDetails(){
		List<Employee> empList = new ArrayList<Employee>();
		
		empList.add(new Employee("Ram","101",30.45,35, new Date("1/12/2020")));
		empList.add(new Employee("mohan","109",5020.45,22, new Date("12/12/2020")));
		empList.add(new Employee("ramesh","1001",1020.45,45, new Date("15/12/2020")));
		empList.add(new Employee("dinesh","015",7020.45,35, new Date("10/12/2020")));
		empList.add(new Employee("umesh","101",2020.45,25, new Date("5/12/2020")));
		return empList;
	}

	/**
	 *  sorting employee details based on employee name
	 */
	public static void sortByName() {
		List<Employee> empList = getEmployeeDetails();
		empList.sort((Employee emp1, Employee emp2) -> emp1.getName().compareTo(emp2.getName()));
		
		empList.forEach(list ->{
			System.out.println(list);
		});
	}
	
	/**
	 * sorting employee details based on employee salary
	 */
	public static void sortBySalary() {
		List<Employee> empList = getEmployeeDetails();
		
		Comparator<Employee> comp = Comparator.comparing(Employee::getSalary);
		empList = empList.stream().sorted(comp).collect(Collectors.toList());
		empList.forEach(list ->{
			System.out.println(list);
		});
	}
	
	/**
	 * sorting employee details based on employee Joining Date
	 */
	public static void sortByDate() {
		List<Employee> empList = getEmployeeDetails();
		empList.sort((Employee emp1, Employee emp2) ->emp1.getJoiningDate().compareTo(emp2.getJoiningDate()));
		
		empList.forEach(list ->{
			System.out.println(list);
		});
	}
	
	/**
	 * sorting employee details based on employee age
	 */
	public static void sortByAge() {
		List<Employee> empList = getEmployeeDetails();
		empList.sort((Employee emp1, Employee emp2) ->emp1.getAge() - emp2.getAge());
		// for reverse 
		//empList.sort((Employee emp1, Employee emp2) ->emp1.getAge() - emp2.getAge());
		empList.forEach(list ->{
			System.out.println(list);
		});
	}
	
	/**
	 * sorting employee details based on employee all fields
	 */
	public static void sortOnAllFields() {
		List<Employee> empList = getEmployeeDetails();
		
		Comparator<Employee> comp = Comparator
                .comparing(Employee::getName).thenComparing(Employee::getId).thenComparing(Employee::getSalary)
                .thenComparing(Employee::getAge).thenComparing(Employee::getJoiningDate);
		empList = empList.stream().sorted(comp).collect(Collectors.toList());
		
		empList.forEach(list ->{
			System.out.println(list);
		});
	}
	
	public static void main(String[] args) {
		//sortByName();
		//sortBySalary();
		//sortByDate();
		//sortByAge();
		
		sortOnAllFields();
	}
}
