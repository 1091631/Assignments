package Assgn;
class MyCustomer{
	private int id;
	private String name;
	private char gender;
	public MyCustomer(int id, String name, char gender) {
		this.id = id;
		this.name = name;
		this.gender = gender;
	}
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public char getGender() {
		return gender;
	}
	public String toString() {
		return this.name+"("+this.id+")";
	}
}

class MyAccount{
	private int id;
	private MyCustomer customer;
	private double balance;
	public MyAccount(int id, MyCustomer customer) {
		this.id = id;
		this.customer = customer;
	}
	public MyAccount(int id, MyCustomer customer, double balance) {
		this.id = id;
		this.customer = customer;
		this.balance = balance;
	}
	public double getBalance() {
		return Math.round(balance);
		
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public int getId() {
		return id;
	}
	public MyCustomer getCustomer() {
		return customer;
	}
	public String toString() {
		return this.customer+" balance = $"+this.balance;
	}
	public String getCustomerName() {
		return this.customer.getName();
	}
	public double deposit(double a) {
		this.balance += a;
		return this.balance;
	}
	public double withdraw(double a) {
		if(a>this.balance)
			System.out.println(a+" Amount withdrawn exceeds the current balance!");
		else
			this.balance -= a;
		return this.balance;
	}
}

public class CustomerAndAccount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyCustomer rick = new MyCustomer(7, "Rick", 'm');
		System.out.println(rick);
		MyAccount a1 = new MyAccount(1234, rick, 45678.0067);
		System.out.println(a1);
		MyAccount a2 = new MyAccount(4321, new MyCustomer(10, "Summer", 'f'));
		System.out.println("Account balance of a1 = "+a1.getBalance());
		System.out.println("Account ID of a1 = "+a1.getId());
		a2.setBalance(50000);
		System.out.println("Account balance of a2 = "+a2.getBalance());
		System.out.println(a2);
		System.out.println("Account balance of a1 = "+a1.deposit(20000));
		System.out.println("Customer name of account a2 = "+ a2.getCustomerName() );
		System.out.println("Account balance of a2 = "+a2.withdraw(60000));
	}

}

