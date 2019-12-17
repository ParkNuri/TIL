package workbook.section6_82p;

public class CalcTest {

	public static void main(String[] args) {
		int firstNum = Integer.parseInt(args[0]);
		String cal = args[1];
		int secondNum = Integer.parseInt(args[2]);
		//double result = 0.0;
		Calculator c = new Calculator();
		if (args.length != 3) {
			System.out.println("다시 입력하세요.");
		} else {
			switch (cal) {
			case "+":
				c.plus(firstNum, secondNum);
				break;

			case "-":
				c.minus(firstNum, secondNum);
				break;
			case "x":
				c.multiplication(firstNum, secondNum);
				break;
			case "/":
				c.divide(firstNum, secondNum);
				break;
			}
		}
	}

}
