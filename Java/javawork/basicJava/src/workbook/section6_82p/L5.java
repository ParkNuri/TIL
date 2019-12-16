package workbook.section6_82p;

public class L5 extends Car implements Temp {
	//Constructor----------------------------------------------------
	public L5() {	}
	public L5(String name, String engine, int oilTank, int oilSize, int distance) {
		super(name, engine, oilTank, oilSize, distance);
	}
	
	//Method---------------------------------------------------------
	@Override
	public int getTempGage() {
		// TODO Auto-generated method stub
		return (getDistance()/10)*2;
	}

	
	public void go(int distance) {
		super.go(distance);
		setOilSize(getOilSize()-distance/8);		
	}

	
	//Getter&Setter--------------------------------------------------
}
