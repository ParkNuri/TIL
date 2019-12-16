package workbook.section6_82p;

public class ShapeTest {

	public static void main(String[] args) {
		
		Shape [] shape = new Shape[7];
		
		// 데이터 기반으로 객체 생성 후 배열에 값 초기화
		shape[0] = new Triangle(7,5,"Blue"); 
		shape[1] = new Rectangle(4,6,"Blue"); 
		shape[2] = new Triangle(6,7,"Red"); 
		shape[3] = new Rectangle(8,3,"Red"); 
		shape[4] = new Triangle(9,8,"White"); 
		shape[5] = new Rectangle(5,7,"White"); 
		shape[6] = new Circle(0,0,"White",3); 
		
		
		System.out.println("기본정보");
		//case 1
		for (int i = 0; i < shape.length; i++) {
			if(shape[i] instanceof Triangle) {
				System.out.print("Triangle\t");
			}
			else if(shape[i] instanceof Rectangle) {
				System.out.print("Rectangle\t");
			}else {
				System.out.print("Circle\t");
			}
		
			System.out.println(shape[i].getArea()+"\t"+shape[i].getColors());
		}
		//case 2
		for (int i = 0; i < shape.length; i++) {
			System.out.print(shape[i].getClass().getName());
			System.out.println(shape[i].getArea()+"\t"+shape[i].getColors());
		}
		
		//사이즈 변경 5
		/*for (int i = 0; i < shape.length; i++) {
			if(shape[i] instanceof Triangle) {
				((Triangle)shape[i]).setResize(5);
			}
			else {
				((Rectangle)shape[i]).setResize(5);
			}
		}*/
		System.out.println("\n사이즈를 변경 후 정보");
		for (int i = 0; i < shape.length; i++) {
			if(shape[i] instanceof Triangle) {
				System.out.print("Triangle\t");
				((Triangle)shape[i]).setResize(5);
			}
			else if(shape[i] instanceof Rectangle) {
				System.out.print("Rectangle\t");
				((Rectangle)shape[i]).setResize(5);
			}
			else {
				System.out.print("Circle\t");
				((Circle)shape[i]).setResize(5);
			}
		
			System.out.println(shape[i].getArea()+"\t"+shape[i].getColors());
		}
		
		//향상된 for문 - 5.0부터 추가된 for문
		//배열이나 Collection을 다룰 때 사용
		//for문이 한 번 실행될때마다
		//shape배열에서 요소 하나씩 꺼내서 obj에 전달 후 작업
		for(Shape obj : shape ) {
			
			System.out.println(obj.getArea()+"\t"+obj.getColors());	//obj = shape[i]
		}
		
		
	}

}
