package chap05;

public class ArrayCopyTest01 {

	public static void main(String[] args) {
		//배열에 값 할당
		int[] firstArr = new int [5];
		for(int i = 0; i<firstArr.length; i++) {
			firstArr[i]=10+i;
		}
		
		//배열 값 출력(할당 중에 출력하는건 불안전)
		for(int i = 0; i<firstArr.length; i++) {
			System.out.print(firstArr[i]+"\t");
		}
		
		
		System.out.println();
		
		//배열의 사이즈를 변경
		//1. 새로운 배열을 생성
		int[] secondArr = new int[firstArr.length*3];
		for(int i=0;i<secondArr.length;i++) {
			//System.out.println(secondArr[i]+"\t");
			if(i<firstArr.length)
			{
				secondArr[i]= firstArr[i];
			}
			System.out.print(secondArr[i]+"\t");
		}
		for(int i=0;i<secondArr.length;i++) {
			System.out.print(secondArr[i]+"\t");
		}
		
	}

}
