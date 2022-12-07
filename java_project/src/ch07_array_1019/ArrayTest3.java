package ch07_array_1019;

public class ArrayTest3 {

	public static void main(String[] args) {
		double[] data = new double[5];
		int size = 0;
		
		data[0] = 10.0; size++;
		data[1] = 20.0; size++;
		data[2] = 30.0; size++;
		
		for(int i=0; i<size; i++){
			System.out.println(data[i]);
			
		}//변수 사이즈라는 것을 줘서 값을 할당했을때 그 변수의 크기만큼
		 //사이즈를 재는데, 5개의 인덱스가 있지만 값은 3개만 할당해서
		 //출력했을때 값이 할당되지 않은 것은 사이즈가 없기 때문에 출력되지 않는 것을 이용함.
	}
}
