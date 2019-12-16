package workbook.section6_82p;

public class CarTest {

	public static void main(String[] args) {
		Car [] car = new Car[2];
	
		car[0] = new L3("L3", "1500", 50, 25, 0);
		car[1] = new L5("L5", "2000", 70, 35, 0);
	
		Car.printCarDetail();
		for(Car obj: car) {
			System.out.print(obj.getName()+"\t\t"+obj.getEngine()+"\t\t"+obj.getOilTank()+"\t"+obj.getOilSize()+"\t"+obj.getDistance()+"\t\t");
			if(obj instanceof L3) {
				System.out.println(((L3)obj).getTempGage());
			}else if(obj instanceof L5) {
				System.out.println(((L5)obj).getTempGage());				
			}
			
		}
		
		System.out.println("\n25 주유");
		Car.printCarDetail();
		for(Car obj: car) {
			obj.setOil(25);
			System.out.print(obj.getName()+"\t\t"+obj.getEngine()+"\t\t"+obj.getOilTank()+"\t"+obj.getOilSize()+"\t"+obj.getDistance()+"\t\t");
			if(obj instanceof L3) {
				System.out.println(((L3)obj).getTempGage());
			}else if(obj instanceof L5) {
				System.out.println(((L5)obj).getTempGage());				
			}
		}
		
		System.out.println("\n80 주행");
		Car.printCarDetail();
		for(Car obj: car) {
			obj.go(80);
			System.out.print(obj.getName()+"\t\t"+obj.getEngine()+"\t\t"+obj.getOilTank()+"\t"+obj.getOilSize()+"\t"+obj.getDistance()+"\t\t");
			if(obj instanceof L3) {
				System.out.println(((L3)obj).getTempGage());
			}else if(obj instanceof L5) {
				System.out.println(((L5)obj).getTempGage());				
			}
		}
		
		
		
	}

}
