abstract class Account{
	double balance;
	Account(double b){
		this.balance=b;
	}
	abstract double calinterest();
}
class Savings extends Account{
	Savings(double balance){
		super(balance);
	}
	@Override
	double calinterest(){
		return balance * 0.04;
	}
}
class Deposit extends Account{
	Deposit(double b){
		super(b);
	}
	@Override
	double calinterest(){
		return balance * 0.07;
	}
}
class AbstractDemo{
	public static void main(String args[]){
		Account[] accounts={new Savings(10000), new Deposit(10000)};
		for(Account a: accounts){
			System.out.println(a.calinterest());
		}
	}
}
