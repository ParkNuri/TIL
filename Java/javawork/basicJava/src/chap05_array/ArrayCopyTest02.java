package chap05_array;

public class ArrayCopyTest02 {

	public static void main(String[] args) {
		//�迭�� �� �Ҵ�
		int[] firstArr = new int [5];
		for(int i = 0; i<firstArr.length; i++) {
			firstArr[i]=10+i;
		}
		
		//firstArr�� ������ �迭�� ����
		int[] secondArr = new int[firstArr.length*2];
		//firstArr�迭�� 0������ firstArr�� ��� ��Ҹ� secondArr�� 0�� ��ġ����
		//copy�ؼ� �����ϱ�
		//System.arraycopy(firstArr, 0, secondArr, 0, firstArr.length);
		System.arraycopy(firstArr, 3, secondArr, 2, 2);
		for(int i=0;i<secondArr.length;i++) {
			System.out.print(secondArr[i]+" ");
		}
		System.out.println();
		
	}

}