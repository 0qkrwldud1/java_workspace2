package ch07_array_1019;

public class CharArray {

	public static void main(String[] args) {

		char[] alpahabets = new char[26]; //선언만한 상태
		char ch = 'A'; //선언하고 값 할당
		
		//배열 값을 설정
		for(int i=0 ; i<5; i++, ch++){
			alpahabets[i] = ch;
		}
		
		//배열 값 가져오기
		for(int i=0; i<5; i++){
			System.out.println(alpahabets[i] + "," + (int)alpahabets[i]);
		}
	} 
}