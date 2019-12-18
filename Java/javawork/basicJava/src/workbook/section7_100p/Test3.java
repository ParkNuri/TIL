package workbook.section7_100p;

import java.util.StringTokenizer;

public class Test3 {

	public static void main(String[] args) {
		String str = "4, 2, 3, 6, 7";
		StringTokenizer st = new StringTokenizer(str,",");
		int sum = 0;
		for (int i = 0; i < st.countTokens(); i++) {
			sum+=Integer.parseInt(st.nextToken().toString());
		}
		System.out.println(sum);
	}

}
