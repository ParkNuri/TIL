package workbook.section4;

public class Account {
	String account="";
	int balance=0;
	double interestRate=0.0;
	Account(){
		
	}
	Account(String account, int balance, double interestRate){
		setAccount(account);
		setBalance(balance);
		setInterestRate(interestRate);
	}
	
	
	public void print() {
		System.out.println("��������: "+account+"\t�����ܾ�: "+balance);
		//		System.out.println("���¹�ȣ: "+account+"\t�ܾ�: "+balance+"��\t������: "+interestRate+"%");
	}
	public double calculateInterest() {
		double interest=0.0;
		interest = balance*(interestRate/100);
		return interest;
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
