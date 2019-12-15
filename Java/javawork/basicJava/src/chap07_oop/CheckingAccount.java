package chap07_oop;

public class CheckingAccount extends Account {
	private String cardNo;
	public CheckingAccount() {	}
	public CheckingAccount(String account, String ownerName, int balance, String cardNo) {
		super(account, balance, ownerName);
		this.cardNo = cardNo;
	}
	public void pay(int amount, String cardNo) {
		//문자열 비교는 무조건 equals 사용하기
		//(==)사용 No!!
		
//		if(this.cardNo==cardNo) {
		if(this.cardNo.equals(cardNo)) {
			if(amount<this.getBalance()) {
//				this.setBalance(this.getBalance()-amount);
				withdraw(amount);
				
			}
			else{System.out.println("지불이 불가능합니다.");}
		}else {
			System.out.println("지불이 불가능합니다.");
		}
	}
}
