package test.exam;
public class ScoreExam{
	public static void main(String[] args){
		int kor = 80;
		int math = 68;
		int eng = 95;

		int total	= kor + math + eng;
		double avg = total/3;

		System.out.println("ÃÑÁ¡ => " + total);
		System.out.println("Æò±Õ => " + avg);
	}
}