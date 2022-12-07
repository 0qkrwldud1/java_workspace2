package ch07_array_1019;

public class ArrayCopy {

	public static void main(String[] args) {

		int[] array1 = {10 ,20, 30, 40, 50};
		int[] array2 = {1, 2, 3, 4, 5};
		
		//array1 : 원본 , 0 : 위치, array2 : 복사본 , 1 : 위치, 4 : 크기만큼 복사.
		//어레이1의 0부터 어레이2의 1번부터, 어레이1에서 4개복사
		System.arraycopy(array1, 0, array2, 1, 4);
				
		for(int i=0; i<array2.length; i++){
			System.out.println(array2[i]);
		}
	}
}
