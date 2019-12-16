package workbook.section7_100p;

public class ShapeTest {

	public static void main(String[] args) {
		Shape [] shape = new Shape[4];
		
		shape[0] = new Rectangle(4, 7, 5);
		shape[1] = new Rectangle(5, 4, 6);
		shape[2] = new Circle(6, 6, 7);
		shape[3] = new Circle(7, 8, 3);

		for(Shape obj: shape) {
			if(obj instanceof Rectangle) {
				System.out.println("Rectangle: "+((Rectangle)obj).printInfo());
			}
			else {
				System.out.println("Circle: "+((Circle)obj).printInfo());				
			}
		}
		
		for(Shape obj: shape) {
			if(obj instanceof Rectangle) {
				((Rectangle)obj).move(obj.getPoint().getX()+10, obj.getPoint().getY()+10);
			}
			else {
				((Circle)obj).move(obj.getPoint().getX()+10, obj.getPoint().getY()+10);;				
			}
		}
		
		for(Shape obj: shape) {
			if(obj instanceof Rectangle) {
				System.out.println("Rectangle: "+((Rectangle)obj).printInfo());
			}
			else {
				System.out.println("Circle: "+((Circle)obj).printInfo());				
			}
		}
		
	}

}
