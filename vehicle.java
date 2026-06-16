package assingment;
class Vehicle{
	String brand;
	int speed;
	Vehicle(String brand,int speed){
		this.brand=brand;
		this.speed=speed;
	}
	void describe() {
		System.out.println("Brand: "+brand+" Speed: "+speed);
	}
}
class Car extends Vehicle{
	int numDoors;
	Car(String brand,int speed,int numDoors){
		super (brand,speed);
		this.numDoors=numDoors;
	}@Override
	void describe() {
		System.out.println("Brand: "+brand+" Speed: "+speed+" No of doors: "+numDoors);
	}
}
class Bike extends Vehicle{
	boolean hasSidecar;
	Bike(String brand,int speed,boolean hasSidecar){
		super (brand,speed);
		this.hasSidecar=hasSidecar;
	}@Override
	void describe() {
		System.out.println("Brand: "+brand+" Speed: "+speed+" Has side cars: "+hasSidecar);
	}
}
public class opp10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehicle v1 = new Car("Toyota", 120, 4);
		v1.describe();

		Vehicle v2 = new Bike("Yamaha", 100, false);
		v2.describe();
	}

}
