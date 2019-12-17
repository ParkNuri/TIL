package workbook.section6_82p;

public class Account {
	String account="";
	double balance=0;
	double interestRate=0.0;
	Account(){
		
	}
	Account(String account, double balance, double interestRate){
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
	public void deposit(int money) throws Exception {
		if(money<0) {
			throw new Exception("입금 금액이 0보다 적습니다.");
		}
		balance+=money;
		print();
	}
	public void withdraw(int money) throws Exception {
		if(money<0||money>balance) {
			throw new Exception("금액이 0보다 적거나 현재 잔액보다 많습니다.");
		}
		balance-=money;
		
		print();
	}
	
	
	
	
	
	
	public String getAccount() {
		return account;
	}
	public void setAccount(String account) {
		this.account = account;
	}
	public double getBalance() {
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
