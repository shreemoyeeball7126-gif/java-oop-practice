package assingment;
class Dog{
	String name;
	String breed;
	int age;
	Dog(String name, String breed,int age){
		this.name=name;
		this.breed=breed;
		this.age=age;
	}
	void isAdult(){
		if(age>18) {
			System.out.println(name+" is adult");
		}
		else {
			System.out.println(name+" is not adult");
		}
	}
	String display() {
		return("Name: " + name + ", Breed: " + breed + ", Age: " + age);
	
	}
}

public class opp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog d1=new Dog("Tommy","Golden retriver",5);
		String d1p=d1.display();
		System.out.println(d1p);
		d1.isAdult();
		Dog d2=new Dog("tinu","doberman",10);
		String d2p=d2.display();
		System.out.println(d2p);
		d2.isAdult();

	}

}
