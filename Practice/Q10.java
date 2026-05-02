import java.util.*;

class TaxCalculator{
	
	static void calculateTax(double sal){
	
		System.out.println("Entered Salary : " + sal );

		double Tax = sal * 0.1;
		System.out.println("Tax value : " + Tax);

		double RemSalary = sal - Tax;
		System.out.println("Remaining Salary after Tax deduction : " + RemSalary);
	} 

	public static void main(String[] args){
	
		Scanner sc = new Scanner(System.in);
	
		System.out.println("Enter Salary : ");
		double salary = sc.nextDouble();
		
		calculateTax(salary);
	}
}
