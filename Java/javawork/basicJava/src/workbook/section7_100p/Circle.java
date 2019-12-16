package workbook.section7_100p;

public class Circle extends Shape implements Movable {
	private int radius;
	
	public Circle() {};
	public Circle(int radius, int x, int y) {
		super(new Point(x,y));
		this.radius = radius;
	}
	
	
	@Override
	public void move(int x, int y) {
		this.point.setX(x);
		this.point.setY(y);
	}
	@Override
	public double getArea() {
		
		return (double)radius*radius*Math.PI;
	}
	@Override
	public double getCircumference() {
		return 2*Math.PI*radius;
	}
	
	public String printInfo() {
		return (String)(this.radius+"\t"+this.point.getX()+"\t"+this.point.getY());
	}
	
	
	public int getRadius() {
		return radius;
	}
	public void setRadius(int radius) {
		this.radius = radius;
	};
	
	
	
	
	
}
