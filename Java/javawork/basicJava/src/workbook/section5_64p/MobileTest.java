package workbook.section5_64p;

public class MobileTest {

	public static void main(String[] args) {
		Ltab m1 = new Ltab("Ltab", 500, "AP-01");
		Otab m2 = new Otab("Otab", 1000, "AND-20");
		
		MobileTest mt = new MobileTest();
		
		mt.printStatus(m1, m2);
		
		//10분 충전
		System.out.println("10분 충전");
		m1.charge(10);
		m2.charge(10);
		
		mt.printStatus(m1, m2);
		
		//5분 통화
		System.out.println("5분 통화");
		m1.operate(5);
		m2.operate(5);
				
		mt.printStatus(m1, m2);
		
	}
	public void printStatus(Ltab l, Otab o) {
		System.out.println("Mobile\tBattery\tOS\t");
		System.out.println("--------------------------");
		System.out.println(l.getMobileName()+"\t"+l.getBatterySize()+"\t"+l.getOsType()+"\n"+o.getMobileName()+"\t"+o.getBatterySize()+"\t"+o.getOsType()+"\n");
		
	}

}

