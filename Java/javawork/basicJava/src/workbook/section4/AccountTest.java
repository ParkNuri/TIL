package workbook.section4;

public class AccountTest {

	public static void main(String[] args) {
		Account a= new Account("441-0290-1203",500000,7.3);
		a.print();
		a.deposit(20000);
		System.out.println(a.getBalance());
		System.out.println("¿Ã¿⁄: "+a.calculateInterest());
	}

}
