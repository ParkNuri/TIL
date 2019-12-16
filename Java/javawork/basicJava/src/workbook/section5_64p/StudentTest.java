package workbook.section5_64p;

public class StudentTest {

	public static void main(String[] args) {
		
		Student[] s = new Student[3];

		s[0]= new Student("홍길동", 15, 171, 81);
		s[1]= new Student("한사람", 13, 183, 72);
		s[2]= new Student("임걱정", 16, 175, 65);
		
		System.out.println("이름\t나이\t신장\t몸무게");
		
		int ageSum = 0, hSum = 0, wSum = 0;
		
		//배열내 객체 정보 출력 + 값 합
		for (int i = 0; i < s.length; i++) {
			System.out.println(s[i].getName()+"\t"+s[i].getAge()+"\t"+s[i].getHeight()+"\t"+s[i].getWeight());
			ageSum+=s[i].getAge();
			hSum+=s[i].getHeight();
			wSum+=s[i].getWeight();
			
		}
		
		
		
		//나이 평균 출력
		System.out.println("나이의 평균: "+Math.round(((double)ageSum/s.length)*100)/100.0);
		System.out.println("신장의 평균: "+Math.round(((double)hSum/s.length)*100)/100.0);
		System.out.println("몸무게의 평균: "+Math.round(((double)wSum/s.length)*100)/100.0);
		
	}

}
