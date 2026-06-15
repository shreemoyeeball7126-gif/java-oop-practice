package assingment;
class Marks{
	int maths;
	int science;
	int english;
	Marks(int maths,int science,int english){
		this.maths=maths;
		this.science=science;
		this.english=english;
	}
	int getTotal() {
		return maths+science+english;
	}
	int getAverage() {
		return getTotal()/3;
	}
	String getGrad() {
		int a=getAverage();
		
		if(a>=90) {
			return "A";
		}
		else if(a>=75) {
			return "B";
		}
		else if(a>=60) {
			return "C";
		}
		return "D";
	}
}
class Student12{
	String name;
	int rollno;
	Marks marks;
	Student12(String name,int rollno,Marks marks){
		this.name=name;
		this.rollno=rollno;
		this.marks=marks;
	}
	void displayReport() {
		System.out.println("Name: "+name+" roll: "+rollno);
		System.out.println("Total "+marks.getTotal()+" Average "+marks.getAverage()+" Grade "+marks.getGrad());
	}
}
public class opp3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Marks m1 = new Marks(85, 90, 70);
		Student12 s1 = new Student12("Shreemoyee", 101, m1);
		s1.displayReport();

		Marks m2 = new Marks(55, 60, 50);
		Student12 s2 = new Student12("Rohit", 102, m2);
		s2.displayReport();

	}

}
