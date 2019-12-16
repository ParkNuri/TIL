package workbook.section6_82p;

public class Circle extends Shape implements Resize {
	private int radius;
	
	//Constructor----------------------------------------------------
	public Circle() {	}
	
	public Circle(int width, int height, String colors, int radius) {
		super(width, height, colors);
		this.radius = radius;
	}
	
	
	//Method---------------------------------------------------------
	@Override
	public void setResize(int size) {
		setRadius(radius+size);
	}


	@Override
	public double getArea() {
		double area=(double)radius*radius*Math.PI;
		return area;
	}


	//Getter&Setter--------------------------------------------------
	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

	
}
