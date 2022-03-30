package git;

import java.util.Scanner;

class Employee {
	int EID;
	String name;
	float basic;
	float DA  = 0.51f;
	
	void set(int EID,String name,float basic)
	{
		this.EID = EID;
		this.name = name;
		this.basic = basic;
	}
	
	void get()
	{
		System.out.println("Employee ID is " + EID);
		System.out.println("Employee Name is " + name);
		System.out.println("Employee Name is " + basic);
	}
	
	void disp()
	{
		float Salary = basic + (DA * basic);
		System.out.println("Employee Salary is " + Salary);

	}
}
class Company {
public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter Employee ID: ");
		int EID = scan.nextInt();
		
		scan.nextLine();
		
		System.out.print("Enter Employee Name: ");
		String name = scan.nextLine();
		
		System.out.print("Enter Basic Salary: ");
		float basic = scan.nextFloat();
		
		Employee ref = new Employee ();
		
		ref.set(EID,name,basic);
		ref.get();
		ref.disp();
		
}
}


