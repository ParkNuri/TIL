package workbook.section4;

public class Test2 {

	public static void main(String[] args) {
		Calc c = new Calc();
		int result =c.calculate(Integer.parseInt(args[0]));
		
		System.out.println("���: "+result);
	}

}
