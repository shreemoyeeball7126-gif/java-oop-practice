package assingment;
class StudentGrade{
	String name;
	int[]marks;
	StudentGrade(String name,int[]marks){
		this.name=name;
		this.marks=marks;
	}
	int getTotal() {
		return marks[0]+marks[1]+marks[2]+marks[3]+marks[4];
	}
	int getAverage() {
		return getTotal()/5;
	}
	String getGrade() {
		int a=getAverage();
		if(a>=90) {
			return "A";
		}
		else if(a>=75) {
			return "B";
		}else if(a>=60) {
			return "C";
		}
		return "D";
	}
	int getHighest() {
		int max=marks[0];
		for(int i=1;i<5;i++) {
			if(marks[i]>max) {
				max=marks[i];
			}
		}
		return max;
	}
	int getLowest() {
		int min=marks[0];
		for(int i=1;i<5;i++) {
			if(marks[i]<min) {
				min=marks[i];
			}
		}
		return min;
	}
	void displayReport() {
		System.out.println("Total: "+getTotal()+" Average: "+getAverage()+" Grade: "+getGrade()+" Highest: "+getHighest()+" Lowest: "+getLowest());
	}
}
public class opp11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] marks = {85, 92, 78, 90, 88};
		StudentGrade sg = new StudentGrade("Shreemoyee", marks);
		sg.displayReport();
	}

}
