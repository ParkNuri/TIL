package workbook.section6_82p;

public abstract class Shape {
	private int width;
	private int height;
	private String colors;
	
	//Constructor---------------------------------------------------
	public Shape() {
	}
	public Shape(int width, int height, String colors) {
		super();
		this.width = width;
		this.height = height;
		this.colors = colors;
	}
	
	//Method------------------------------------------------------
	public abstract double getArea(); //≥–¿Ã±∏«œ±‚

	
	//Getter Setter-----------------------------------------------
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public String getColors() {
		return colors;
	}
	public void setColors(String colors) {
		this.colors = colors;
	}
	
	
	
	
}
