package workbook.section6_82p;

public class AccountTest {

	public static void main(String[] args) {
		Account a= new Account("441-0290-1203",500000,7.3);
		a.print();
		try {
			a.deposit(-10);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		try {
			a.withdraw(600000);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		System.out.println("¿‹∞Ì: "+ a.getBalance());
		System.out.println("¿Ã¿⁄: "+a.calculateInterest());
	}

}
