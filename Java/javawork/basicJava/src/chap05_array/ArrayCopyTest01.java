package chap05_array;

public class ArrayCopyTest01 {

	public static void main(String[] args) {
		//�迭�� �� �Ҵ�
		int[] firstArr = new int [5];
		for(int i = 0; i<firstArr.length; i++) {
			firstArr[i]=10+i;
		}
		
		//�迭 �� ���(�Ҵ� �߿� ����ϴ°� �Ҿ���)
		for(int i = 0; i<firstArr.length; i++) {
			System.out.print(firstArr[i]+"\t");
		}
		
		
		System.out.println();
		
		//�迭�� ����� ����
		//1. ���ο� �迭�� ����
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