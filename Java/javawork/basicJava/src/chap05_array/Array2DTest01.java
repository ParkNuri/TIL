package chap05_array;

public class Array2DTest01 {

	public static void main(String[] args) {
		//2차원배열의 선언과 생성
		int[][] myarr = new int[2][3];
		//2차원배열의 초기화
		myarr[0][0] = 100;
		myarr[1][1] = 200;
		//myarr[2][2] = 300; -> Exception발생
		
		System.out.println("myarr의 2번째 요소가 참고하는 배열의 0번 요소의 값"+myarr[1][0]);		
		System.out.println("myarr의 1번째 요소가 참고하는 배열의 0번 요소의 값"+myarr[0][0]);
		
		//다차원 배열의 요소의 갯수
		System.out.println("배열 요소의 갯수=>"+myarr.length);
		System.out.println("myarr의 0번 요소가 참조하는 배열 요소의 갯수=>"+myarr[0].length);
		//전체 배열의 요소를 엑세스하기 - length를 직접 써서 접근하기
		for(int row =0; row<2;row++) {
			for(int i =0;i<3;i++) {
				System.out.print(myarr[row][i]+"\t");
			}
			System.out.println();
		}
		//전체 배열의 요소를 엑세스하기 - 배열의 length 변수를 직접 써서 접근하기
		for(int row =0; row<myarr.length;row++) {
			for(int i =0;i<myarr[row].length;i++) {
				System.out.print(myarr[row][i]+"\t");
			}
			System.out.println();
		}
	}

}
