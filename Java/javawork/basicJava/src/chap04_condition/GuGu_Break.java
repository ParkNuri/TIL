package chap04_condition;

import java.util.Scanner;

public class GuGu_Break {
	public static void main(String[] args) {
		int i = 2;
		int j =1;
		/*while(i<10) {
			for(j=1;j<10;j++) {
				System.out.print(i+"*"+j+"="+i*j+"\t");
				j++;
			}
			System.out.println();
			i++;
		}
		*/
		for(i=2;i<10;i++) {
			if(i==5) {
				break;
			}
			for(j=1;j<10;j++) {
				/*if(i==5) {
					break;
				}*/ //break문이 내부 for에 선언되어 있으므로 반복문이 종료되지는 않는다.
				System.out.print(i+"*"+j+"="+i*j+"\t");
			}
			System.out.println();
		}
	}
}
