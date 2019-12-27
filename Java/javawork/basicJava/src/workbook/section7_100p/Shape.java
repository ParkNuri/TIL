package workbook.section7_100p;

public abstract class Shape {
	protected Point point;
	
	
	public Shape() {}
	public Shape(Point point) {
		this.point = point;
	}
	public Shape(int x, int y) {
		this.point = new Point(x,y);
	}
	
	public abstract double getArea();
	public abstract double getCircumference();
	
	
	public Point getPoint() {
		return point;
	}
	public void setPoint(Point point) {
		this.point = point;
	}

	
}
