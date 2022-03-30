package git;

import java.util.Scanner;
class Salary {
	
	int EID;
	String name;
	float basic;
	float DA  = 0.51f;
	
	void setID(int EID){
		this.EID = EID;
	}
	void getID(){
		System.out.println("Employee ID is " + EID);
	}
	
	void setname(String name){
		this.name = name;
		}
	void getname(){
		System.out.println("Employee Name is " + name);
	}
	
	void setbasic(float basic){
		this.basic = basic;
		}
	void getbasic(){
		System.out.println("Employee Name is " + basic);
		}

	void disp(){
		float Salary = basic + (DA * basic);
		System.out.println("Employee Salary is " + Salary);
	}
	
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter Employee ID: ");
		int EID = scan.nextInt();
		
		scan.nextLine();
		
		System.out.print("Enter Employee Name: ");
		String name = scan.nextLine();
		
		System.out.print("Enter Basic Salary: ");
		float basic = scan.nextFloat();
		
	    Salary ref = new Salary ();
		
		ref.setID(EID);
		ref.setname(name);
		ref.setbasic(basic);

		ref.getID();
		ref.getname();
		ref.getbasic();

		ref.disp();

	}
}
		




