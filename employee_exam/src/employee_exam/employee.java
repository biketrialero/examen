package employee_exam;

public class employee {

	   private String myName;
	   private double mySalary;

	   public employee(String name, double salary) {
	      myName = name;
	      mySalary = salary;
	   }
//versio 3

	   public String getName() {
	      return myName;
	   }

	   public double getSalary() {
	      return mySalary;
	   }

	   public void raiseSalary(int percent) {
	      mySalary = mySalary +
	         percent * 0.01 * mySalary;
	   }

	   public void setSalary(double salary) {
	      mySalary = salary;
	   }

	   public String toString() {
	      return "Name: " + getName() +
	             ", Salary: " + getSalary();
	   }
	}