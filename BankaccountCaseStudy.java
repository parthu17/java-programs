class BankAccount{
    private int balance = 1000;
    synchronized void withdrawn(int withdrawal){
        balance-=withdrawal;
    }
    synchronized void getBalance(){
        if(balance>=0){
            System.out.println("Balance: "+balance);
        }
        else{
            System.out.println("Insufficient Balance");
        }
    }
}
class BankThread extends Thread{
    BankAccount bankacc;
    BankThread(BankAccount b){
        bankacc= b;
    }
    public void run(){
        bankacc.withdrawn(800);
        bankacc.getBalance();
    }
}
public class BankaccountCaseStudy{
    public static void main(String args[]) throws InterruptedException{
        BankAccount b = new BankAccount();
        BankThread b1 = new BankThread(b);
        BankThread b2 = new BankThread(b);
        b1.start();
        b2.start();
        b1.join();
        b2.join();
    }
}