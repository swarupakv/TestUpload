package com.staticconcept;

class Employee
{
	 int empid;
	 String empname;
	 static String companyname = "ABC";
	 
	 Employee(int empid, String empname)
	 {
		 this.empid = empid;
		 this.empname = empname;
	 }
	 
	 void display()
	 {
		 System.out.println(empid +" " + empname+" "+companyname);
	 }
}
public class StaticVariable3 {
	
	public static void main(String[] args) {
		Employee e1 = new Employee(1, "test1");
		e1.display();
		Employee e2 = new Employee(2, "test2");
		e2.display();
	}

}

//1 test1 ABC
//2 test2 ABC
