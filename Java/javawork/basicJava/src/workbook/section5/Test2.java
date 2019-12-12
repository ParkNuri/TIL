package workbook.section5;

public class Test2 {

	public static void main(String[] args) {
		//Company의 salary가 double이고 입력받은 salary가 int이므로
		//자동 casting이 된다.
		Company com = new Company(Double.parseDouble(args[0]));
		
		System.out.println("연 기본급 합: "+com.getIncome()+"\t세후: "+com.getAfterTaxIncome());
		System.out.println("연 보너스 합: "+com.getBonus()+"\t세후: "+com.getAfterTaxBonus());
		System.out.println("연 지급액 합: "+(double)(com.getAfterTaxIncome()+com.getAfterTaxBonus()));

	}

}
