package workbook.section5_64p;

public class Otab extends Mobile{
	
	//Constructor--------------------------------------------------
	public Otab(){}
	public Otab(String mobileName, int batterySize, String osType){
		super(mobileName, batterySize, osType);
	}
	
	//Method-------------------------------------------------------
	public int operate(int time) {
		this.setBatterySize(this.getBatterySize()-time*12);
		return this.getBatterySize();
	
	}
	public int charge(int time) {
		this.setBatterySize(this.getBatterySize()+time*8);
		return this.getBatterySize();
	}
	
	
}
