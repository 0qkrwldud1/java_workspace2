package ch07_array_1019;

public class ObjectCopy1 {

	public static void main(String[] args) {
		Book[] bookArray1 = new Book[3];
		Book[] bookArray2 = new Book[3];
		
		bookArray1[0] = new Book("태백산맥2", "조정래");
		bookArray1[1] = new Book("데미안2", "헤르만 헤세");
		bookArray1[2] = new Book("어떻게 살 것인가2", "유시민");
 		System.arraycopy(bookArray1, 0, bookArray2, 0, 3);
		
		for(int i=0; i<bookArray1.length; i++){
			//bookArray2[i].showBookInfo();
			System.out.println(bookArray1);
		}
		
		for(int i=0; i<bookArray2.length; i++){
			//bookArray2[i].showBookInfo();
			System.out.println(bookArray2);
		}
		
		for(int i=0; i<bookArray1.length; i++){
			bookArray2[i].showBookInfo();
			System.out.println(bookArray1);
		}
		//원본 복사 x
		//실제 데이터가 위치한 주소값만 복사.
	}
}
