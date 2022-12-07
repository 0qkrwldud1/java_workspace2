package ch07_array_1019;

import java.util.ArrayList; //ctrl + shift + o : 자동임포트

public class ArrayListTest {

	public static void main(String[] args) {
		
		//student타입으로 arraylist만들기.
		//변수이름은 students
		//해당 arraylist에 각자 알고있는 이름3개 등록.
		//기본 for문 출력
		//향상된 for문 출력
		//해당 student의 생성자 잘보고 객체 만들기
		//showinfo를 사용해 출력.
		
		ArrayList<Student> students = new ArrayList<Student>();
		students.add( new Student("조정래") );
		students.add( new Student("헤르만 헤세") );
		students.add( new Student("유시민") );
		
		for(int i=0; i<students.size(); i++){
			
			Student student = students.get(i); 
			student.showInfo();
		}
		
		
		System.out.println();
		System.out.println("=== 향상된 for문 사용 ===");
		for(Student student : students){
			student.showInfo();
		}
		
		ArrayList<Book> library = new ArrayList<Book>(); //arraylist 선언, Book 타입만 넣을 수 있다. -> 제너릭

		//.add를 사용해 객체생성후 리스트에 담고있다.
		//book타입의 객체 다섯개를 등록.
		//객체이기 때문에 주소값만 담겨있다.
		library.add( new Book("태백산맥", "조정래") ); 
		library.add( new Book("데미안", "헤르만 헤세") );
		library.add( new Book("어떻게 살 것인가", "유시민") );
		library.add( new Book("토지", "박경리") );
		library.add( new Book("어린왕자", "생텍쥐페리") );
		
		
		for(int i=0; i<library.size(); i++){
			
	
			Book book = library.get(i); //arraylist의 get이라는 메서드를 사용해 값을 가지고 온다.
			book.showBookInfo();		//제너릭으로 book만 담기때문에 가져올 때도 book으로 가져옴.
		}
		
		System.out.println();
		System.out.println("=== 향상된 for문 사용 ===");
		for(Book book : library){
			book.showBookInfo();
		}
	}
}
