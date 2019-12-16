package workbook.section6_82p;

public class Triangle extends Shape implements Resize {

	//Constructor---------------------------------------------------
	public Triangle() {	}
	public Triangle(int width, int height, String colors) {
		super(width, height, colors);
	}
	//Method------------------------------------------------------
	@Override
	public double getArea() {
		double area = (double)getHeight()*getWidth()/2;
		return area;
		}

	@Override
	public void setResize(int size) {
		setHeight(getHeight()+size);
	}
	
	
	//Getter Setter-----------------------------------------------

}
