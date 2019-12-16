package workbook.section7_100p;

public class Rectangle extends Shape implements Movable {
	
	private int width;
	
	public Rectangle() {};
	public Rectangle(int width, int x, int y) {
		super(new Point(x,y));
		
		this.width = width;
	}
	
	
	@Override
	public void move(int x, int y) {
		this.point.setX(x);
		this.point.setY(y);		
	}
	@Override
	public double getArea() {
		return width*width;
	}
	@Override
	public double getCircumference() {
		// TODO Auto-generated method stub
		return 4*width;
	}
	
	public String printInfo() {
		return (String)(this.width+"\t"+this.point.getX()+"\t"+this.point.getY());
	}
	
	
	
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	
	
	

}
