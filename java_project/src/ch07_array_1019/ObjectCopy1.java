package ch07_array_1019;

public class ObjectCopy1 {

	public static void main(String[] args) {
		Book[] bookArray1 = new Book[3];
		Book[] bookArray2 = new Book[3];
		
		bookArray1[0] = new Book("태백산맥2", "조정래");
		bookArray1[1] = new Book("데미안2", "헤르만 헤세");
		bookArray1[2] = new Book("어떻게 살 것인가2", "유시민");
 		//복사
		System.arraycopy(bookArray1, 0, bookArray2, 0, 3);
		//복사본 어레이2의 객체를 확인 -> 주소값확인 
		
		//향상된 for문으로 출력하기.
		for(Book lang : bookArray1){
			System.out.println(lang);
		}
		
		System.out.println("bookarray2 출력하기");
		for(int i=0; i<bookArray1.length; i++){
			//bookArray2[i].showBookInfo();
			System.out.println(bookArray2[i]);
		}
		
		System.out.println("bookarray1 출력하기");
		for(int i=0; i<bookArray1.length; i++){
			//bookArray2[i].showBookInfo();
			System.out.println(bookArray1[i]);
		}
		
		for(int i=0; i<bookArray2.length; i++){
			//bookArray2[i].showBookInfo();
			bookArray2[i].showBookInfo();
		}
		
	}	//어레이1과 어레이2의 주소값이 동일.
		//배열 복사는 윈도우로 예를들면 바로가기 아이콘을 만드는것.
		//원본을 복사한것이 아닌 a라는 어떠한 폴더로 가기위한 바로가기를 만드는것.
		//따라서 주솟값을 복사한것이기 때문에 원본은 그대로이다.
		//얕은 복사.
}
