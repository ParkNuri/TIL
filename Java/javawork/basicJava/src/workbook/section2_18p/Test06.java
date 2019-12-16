package workbook.section2_18p;

public class Test06 {

	public static void main(String[] args) {
		int i=1;
		while(true) {
			for(int j =2;j<10;j++) {
				System.out.print(j+"*"+i+"="+j*i+"\t");
				
				
				if(j%3==1) {
					
					System.out.println();
					if(i<3) {
						j=j-3;
					}
					i++;
					if(i>3) {
						i=1;
						System.out.println();
					}
					
				}
				
			}
			break;
			
		}
	}
}
