package workbook.section6_82p;

public class Rectangle extends Shape implements Resize {

	//Constructor---------------------------------------------------
	public Rectangle() {	}
	public Rectangle(int width, int height, String colors) {
		super(width, height, colors);
	}
	//Method------------------------------------------------------
	@Override
	public void setResize(int size) {
		setWidth(getWidth()+size);	
	}
	
	@Override
	public double getArea() {
		double area = (double)getHeight()*getWidth();
		return area;
	}
	
	//Getter Setter-----------------------------------------------

}
