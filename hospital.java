package assingment;
abstract class Staff{
	String name;
	int id;
	Staff(String name,int id){
		this.name=name;
		this.id=id;
	}
	abstract String getRole();
}
class Doctor extends Staff implements Schedulable{
	String specialization;
	Doctor(String name,int id,String specialization){
		super(name,id);
		this.specialization=specialization;
	}
	String getRole(){
		return("Doctor "+name+"- Ward "+specialization);
	}
	public String getSchedule(){
		return "Mon-Fri 9AM-5PM";
	}
}
class Nurse extends Staff{
	String ward;
	Nurse(String name,int id,String ward){
		super(name,id);
		this.ward=ward;
	}
	String getRole(){
		return("Nurse "+name+"- Ward "+ward);
	}
}
interface Schedulable{
	public String getSchedule();
}

public class opp12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Doctor d = new Doctor("Dr. Sharma", 101, "Cardiology");
		System.out.println(d.getRole());
		System.out.println(d.getSchedule());

		Nurse n = new Nurse("Sister Priya", 202, "ICU");
		System.out.println(n.getRole());
	}

}
