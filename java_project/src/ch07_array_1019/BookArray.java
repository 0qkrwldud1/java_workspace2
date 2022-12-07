package ch07_array_1019;

public class BookArray {

	public static void main(String[] args) {
		Book[] library = new Book[5]; //할당x
		
		library[0] = new Book(); //주소값 할당
		library[1] = new Book("책1","작가1");
		
		System.out.println(library[0].getBookName());
		System.out.println(library[1].getBookName());
		
//		for(int i=0; i<library.length; i++){
//			System.out.println(library[i]);
//		}		
	}
}
