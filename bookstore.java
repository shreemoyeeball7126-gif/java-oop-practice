package assingment;
class Book{
	String title;
	String author;
	double price;
	boolean isAvailable;
	Book(String title,String author,double price,boolean isAvailable){
		this.title=title;
		this.author=author;
		this.price=price;
		this.isAvailable=isAvailable;
	}
	void borrow() {
		if(isAvailable==false) {
			System.out.println("Sorry, "+title+" is not available");
		}
		else {
			System.out.println("You borrowed "+title);
			isAvailable=false;
		}
	}
	void returnBook() {
		isAvailable=true;
		System.out.println(title+" has been returned");
	}
	String getInfo(){
		return("Title "+title+" Author "+author+" price "+price+" isAvailable "+isAvailable);
	}
}
public class opp2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book b1 = new Book("Harry Potter", "J.K. Rowling", 499.0, true);
		System.out.println(b1.getInfo());
		b1.borrow();
		b1.borrow();
		b1.returnBook();
		b1.borrow();

	}

}
