package assingment;
class BankAccount{
	String ownerName;
	double balance;
	BankAccount(String ownerName,double balance){
		this.ownerName=ownerName;
		this.balance=balance;
	}void deposit(double amount){
		balance=balance+amount;
		System.out.println("New balance "+balance);
	}
	void withdraw(double amount) {
		if(amount>balance) {
			System.out.println("Insufficient funds");
		}else {
			balance=balance-amount;
			System.out.println("New balance "+balance);
		}
	}
	double getBalance() {
		return balance;
	}
}
public class opp1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankAccount acc = new BankAccount("Shreemoyee", 5000);
		acc.deposit(2000);
		acc.withdraw(1000);
		acc.withdraw(8000);
		System.out.println("Balance: " + acc.getBalance());

	}

}
