package workbook.section5_64p;

public class Test01 {

	public static void main(String[] args) {
		String str = new String(args[0]);
		char[] c = str.toCharArray();
		for (int i = c.length-1; i>=0; i--) {
			System.out.print(c[i]);
		}
	}

}
