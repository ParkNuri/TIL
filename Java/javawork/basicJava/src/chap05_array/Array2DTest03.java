package chap05_array;
//2차원 배열의 선언과 생성과 초기화하기
public class Array2DTest03 {

	public static void main(String[] args) {
		int[][] myarr = {
				{1,2,3,4,5},
				{6,7,8,9,10},
				{11,12,13,14,15},
		}; // int[][] myarr= new int[3][5];
		
		int[][] myarr2 = {
				{1,2,3},
				{6,7,8,9},
				{11,12,13,14,15},
		}; // int[][] myarr= new int[3][];
		
		//myarr와 myarr2의 배열의 배열에 저장된 값을 출력하기
		
		for(int row=0;row<myarr.length;row++) {
			for (int i=0;i<myarr[row].length;i++) {
				System.out.print(myarr[row][i]+"\t");
			}
			System.out.println();
		}
		System.out.println();		System.out.println();
		for(int row=0;row<myarr2.length;row++) {
			for (int i=0;i<myarr2[row].length;i++) {
				System.out.print(myarr2[row][i]+"\t");
			}
			System.out.println();
		}

	}

}
