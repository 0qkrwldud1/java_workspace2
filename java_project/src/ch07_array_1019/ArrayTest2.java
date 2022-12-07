package ch07_array_1019;

import ch05_test.Person;


public class ArrayTest2 {

	public static void main(String[] args) {

		double[] data = new double[5]; //선언만 값 할당x
		String[] data2 = new String[5];
		Person[] data3 = new Person[5];
		
		data[0] = 10.0;
		data[1] = 20.0;
		data[2] = 30.0;
		//3개만 할당 나머지 2개는 할당하지 않음.
		//나머지는 값이 할당되지 않았기 때문에 기본값이 들어간다. -> 0
		
		data2[0] = "pjy";
		data2[1] = "pjy2";
		
		data3[0] = new Person();
		
		//반복문으로 하나씩 값을 사용한다 -> 값을 불러온다.
		for(int i=0; i<data.length; i++){
			System.out.println(data[i]);
					
		}		
		for(int i=0; i<data2.length; i++){
			System.out.println(data2[i]);
			
		}
		for(int i=0; i<data3.length; i++){
			System.out.println(data3[i]);
			
		}
	}
}
