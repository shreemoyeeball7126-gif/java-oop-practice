package assingment;
class Employee{
	String name;
	double salary;
	String jobTitle;
	Employee(String name,double salary,String jobTitle){
		this.name=name;
		this.salary=salary;
		this.jobTitle=jobTitle;
	}
	void applyRaise(double percent) {
		salary=salary+salary*percent*0.01;
		System.out.println("New salary: "+salary);
	}
	String getInfo() {
		return("Name: "+name+" Salary: "+salary+" JobTitle: "+jobTitle);
	}
}
public class opp9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e1 = new Employee("Shreemoyee", 50000, "Developer");
		System.out.println(e1.getInfo());
		e1.applyRaise(10);
		System.out.println(e1.getInfo());
	}

}
