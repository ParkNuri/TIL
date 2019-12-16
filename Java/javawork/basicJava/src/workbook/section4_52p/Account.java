package workbook.section4_52p;

public class Account {
	String account="";
	int balance=0;
	double interestRate=0.0;
	Account(){
		
	}
	Account(String account, int balance, double interestRate){
		this.account = account;
		this.balance = balance;
		this.interestRate = interestRate;
/*		setAccount(account);
		setBalance(balance);
		setInterestRate(interestRate);
*/
	}
	
	public void accountInfo() {
		System.out.print("계좌정보: "+account+"\t현재잔액: "+balance+"\t이자율: "+interestRate+"%");
		
	}
	
	public void print() {
		System.out.println("계좌정보: "+account+"\t현재잔액: "+balance);
		//		System.out.println("계좌번호: "+account+"\t잔액: "+balance+"원\t이자율: "+interestRate+"%");
	}
	public double calculateInterest() {
		/*double interest=0.0;
		interest = balance*(interestRate/100);
		return interest;
		*/
		return balance*interestRate/100;
	}
	public void deposit(int money) {
		balance+=money;
		print();
	}
	public void withdraw(int money) {
		balance-=money;
		print();
	}
	
	
	
	
	
	
	public String getAccount() {
		return account;
	}
	public void setAccount(String account) {
		this.account = account;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	public double getInterestRate() {
		return interestRate;
	}
	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}
	
}
