package workbook.section6_82p;

public class L3 extends Car implements Temp {

	//Constructor----------------------------------------------------
	public L3() {	}
	public L3(String name, String engine, int oilTank, int oilSize, int distance) {
		super(name, engine, oilTank, oilSize, distance);
	}
	//Method---------------------------------------------------------

	@Override
	public int getTempGage() {
		
		return getDistance()/10;
	}
	
	public void go(int distance) {
		super.go(distance);
		setOilSize(getOilSize()-distance/10);
	}
	
	
	//Getter&Setter--------------------------------------------------
}
