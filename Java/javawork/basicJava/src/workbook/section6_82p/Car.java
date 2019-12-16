package workbook.section6_82p;

public abstract class Car {
	private String name;
	private String engine;
	private int oilTank;
	private int oilSize;
	private int distance;
	
	//Constructor----------------------------------------------------
	public Car(){
		
	}

	public Car(String name, String engine, int oilTank, int oilSize, int distance) {
		super();
		this.name = name;
		this.engine = engine;
		this.oilTank = oilTank;
		this.oilSize = oilSize;
		this.distance = distance;
	}
	
	
	//Method---------------------------------------------------------
	public void go(int distance) {
		setDistance(getDistance()+distance);
	}//주행
	public void setOil(int oilSize) {setOilSize(getOilSize()+oilSize);}//주유

	public static void printCarDetail() {
		System.out.println("vehicleName\tengineSize\toilTank\toilSize\tdistance\ttemperature\n--------------------------------------------------------------------");
	}
	
	//Getter&Setter--------------------------------------------------
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEngine() {
		return engine;
	}

	public void setEngine(String engine) {
		this.engine = engine;
	}

	public int getOilTank() {
		return oilTank;
	}

	public void setOilTank(int oilTank) {
		this.oilTank = oilTank;
	}

	public int getOilSize() {
		return oilSize;
	}

	public void setOilSize(int oilSize) {
		this.oilSize = oilSize;
	}

	public int getDistance() {
		return distance;
	}

	public void setDistance(int distance) {
		this.distance = distance;
	}
	


}
