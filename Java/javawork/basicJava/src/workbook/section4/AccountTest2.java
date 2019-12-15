package workbook.section4;

public class AccountTest2 {

	public static void main(String[] args) {
		Account[] a = new Account[5];
		
		for(int i = 1;i < 6;i++) {
			a[i-1] = new Account("221-0101-211"+i, 100000, 4.5);
		}
		
		for(int i = 0;i < 5;i++) {
			a[i].accountInfo();
			System.out.println();
		}

		for(int i = 0;i < 5;i++) {
			a[i].setInterestRate(3.7);
		}

		for(int i = 0;i < 5;i++) {
			a[i].accountInfo();
			System.out.println("\t"+a[i].balance*a[i].interestRate/100+" ¿ø");
		}
		

	}

}
