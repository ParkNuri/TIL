package chap07_oop;

public class StudentTest {
	public static void main(String[] args) {
		Student s1 = new Student("Kim",25,100,90,95,89);
		
		Student s2 = new Student("Lee",30,60,70,99,98);
	
		Student s3 = new Student("Park",20,68,86,60,40);
		
		Teacher t1 = new Teacher("장동건", 45, "Math");
		
		Staff st1 = new Staff("박누리", 24, " ");
		
		s1.print();
		s2.print();
		s3.print();
		t1.print();
		st1.print();
		
	}

}
